package lesson5;

/**
 * Created by bakla410 on 06.10.17.
 */
public class lesson5 {

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("1");
        }
        finally {
            System.out.println("2");
        }
    }
}
