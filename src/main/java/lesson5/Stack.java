package lesson5;

/**
 * Created by bakla410 on 06.10.17.
 */
public interface Stack {

    Integer get() throws IllegalStateException;

    void add(Integer item) throws IllegalStateException;

    Integer size();
}
