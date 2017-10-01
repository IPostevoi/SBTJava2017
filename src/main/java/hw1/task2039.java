package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bakla410 on 29.09.17.
 */
public class task2039 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();

            Pattern reg = Pattern.compile("[a-zA-Z]+");
            Matcher words = reg.matcher(line);

            int count = 0;

            while (words.find()) {
                count++;
            }
            System.out.println(count);
        } catch (IOException e) {}
    }
}
