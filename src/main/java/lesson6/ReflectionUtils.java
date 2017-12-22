package lesson6;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by bakla410 on 13.10.17.
 */
public class ReflectionUtils {

    private static void printMethods(Class<?> clazz) {
        List<Method> methods = Arrays.asList(clazz.getMethods());

        methods.stream().filter(item -> item.getReturnType() == String.class && item.getParameterCount() == 1)
                .forEach(item -> System.out.println(item.getName()));
    }

    private static void printAllMethods(Class<?> clazz) {
        System.out.println("Class: " + clazz.getName());
        printMethods(clazz);
        Class superclazz = clazz.getSuperclass();
        if (superclazz != null)
            printAllMethods(superclazz);
    }

    private static void runAnnotatedMethods(Class<?> clazz) throws Exception {
        List<Method> methods = Arrays.asList(clazz.getMethods());
        List<Method> annotatedMethods = methods.stream().filter(item -> item.isAnnotationPresent(RunMe.class))
                .collect(Collectors.toList());

        for (Method method: annotatedMethods) {
            System.out.println("smth");
            List<Class> params = Arrays.asList(method.getParameterTypes());
            List<Object> paramsInst = params.stream().map(new Function<Class, Object>() {
                @Override
                public Object apply(Class сlazz) {
                    Object obj = null;
                    try {
                        obj = clazz.newInstance();
                    } catch (Exception e) {}
                    return obj;
                }
            }).collect(Collectors.toList());
            method.invoke(clazz.newInstance(), paramsInst);
        }
    }

    public static void main(String[] args) throws Exception{
//        printMethods(Integer.class);
//        printAllMethods(Double.class);

        runAnnotatedMethods(TestClass.class);
    }

}
