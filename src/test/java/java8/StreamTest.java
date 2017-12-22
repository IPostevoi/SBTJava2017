package java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class StreamTest {

    @Test
    public void streamTest() {
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List filteredList = Stream.of(list).filter(obj -> (Integer) obj > 5).collect();
        Assert.assertArrayEquals(filteredList.toArray(), Arrays.asList(6, 7).toArray());
        List mappedList = Stream.of(list).filter(obj -> (Integer) obj > 5).transform(obj -> 2 * (Integer)obj).collect();
        Assert.assertArrayEquals(mappedList.toArray(), Arrays.asList(12, 14).toArray());
    }

}