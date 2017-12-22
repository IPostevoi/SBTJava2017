package lesson5;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by bakla410 on 06.10.17.
 */
public class MyStack implements Stack {

    private List<Integer> list = new LinkedList<>();
    private Integer maxSize;

    public MyStack(Integer maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void add(Integer item) throws IllegalStateException {
        if (list.size() < maxSize)
            list.add(item);
        else
            throw new IllegalStateException("Index out of bound");
    }

    @Override
    public Integer get()  throws IllegalStateException {
        if (list.size() > 0)
            return list.remove(list.size() - 1);
        else
            throw new IllegalStateException("Index out of bound");
    }

    @Override
    public Integer size() {
        return list.size();
    }

}
