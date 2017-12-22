package hw6;

import hw2.Person;
import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertEquals;


public class BeanUtilsTest {

    @Test
    public void testPersons() throws InvocationTargetException, IllegalAccessException {
        Person p1 = new Person(true, "Alex");
        Person p2 = new Person(true, "Andrew");
        Person p3 = new Person(false, "Marie");
        p1.marry(p3);

        BeanUtils.assign(p2, p1);
        assertEquals(p3, p2.getSpouse());
    }

}
