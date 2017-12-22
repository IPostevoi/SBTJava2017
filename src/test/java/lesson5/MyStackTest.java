package lesson5;

import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * Created by bakla410 on 06.10.17.
 */
public class MyStackTest {

    @Test
    public void testStack() {
        MyStack myStack = new MyStack(3);
        myStack.add(2);
        Integer value = myStack.get();
        assertEquals(value, new Integer(2));
        assertEquals(myStack.size(), new Integer(0));
    }

    @Test
    public void testStackAddExc() {
        MyStack myStack = new MyStack(3);

        IllegalStateException ex = null;

        try {
            myStack.add(0);
            myStack.add(1);
            myStack.add(2);
            myStack.add(3);

            System.out.println("Exception must be thrown!");


        } catch (IllegalStateException e) {
            ex = e;
        }
        assertNotNull(ex);
    }

    @Test
    public void testStackGetExc() {
        MyStack myStack = new MyStack(3);

        IllegalStateException ex = null;

        try {
            myStack.add(0);
            myStack.add(1);
            myStack.add(2);

            myStack.get();
            myStack.get();
            myStack.get();
            myStack.get();

            System.out.println("Exception must be thrown!");

        } catch (IllegalStateException e) {
            ex = e;
        }
        assertNotNull(ex);
    }

}
