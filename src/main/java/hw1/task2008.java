package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bakla410 on 24.09.17.
 */
public class task2008 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int[] line1 = parseLine(br.readLine());
            int n = line1[0];
            int w = line1[1];

            int[] items = parseLine(br.readLine());

            int sum = 0;
            int count = 0;

            for(int item: items) {
                if(sum + item <= w) {
                    sum += item;
                    count++;
                }
            }
            System.out.println(count + " " + sum);
        } catch (IOException e) {}
    }

    public static int[] parseLine(String line) {
        List<String> line1 = Arrays.asList(line.split(" "));
        int[] ans = line1.stream().mapToInt(Integer::parseInt).toArray();
        return ans;
    }
}
