package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream<T> {
    private final List<? extends T> list;

    private Stream (List<? extends T> list) {
        this.list = list;
    }

    public static<T> Stream<T> of(List<? extends T> list) {
        return new Stream<>(list);
    }

    public Stream filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);

        List<T> newList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                newList.add(element);
            }
        }

        return new Stream<>(newList);
    }

    public Stream transform(Function<T, T> function) {
        Objects.requireNonNull(function);

        List<T> newList = new ArrayList<>();

        for (T element : list) {
            newList.add(function.apply(element));
        }

        return new Stream<>(newList);
    }

    public Map<T, T> toMap(Function<? super T, ? extends T> keyMapper,
                           Function<? super T, ? extends T> valueMapper) {
        Map<T, T> map = new HashMap<>();

        for (T element : list) {
            map.put(keyMapper.apply(element), valueMapper.apply(element));
        }

        return map;
    }

    public List collect() {
        return list;
    }

}
