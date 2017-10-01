package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * Created by bakla410 on 29.09.17.
 */
public class task2057 {

    private PriorityQueue<Integer> heap = new PriorityQueue<>();

    public void add(Integer e) {
        heap.add(e);
    }

    public Integer get() {
        return heap.poll();
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        task2057 multiset = new task2057();

        try {

            int count = Integer.parseInt(br.readLine());
            String line;
            String[] operation;

            for (int i = 0; i < count; i++) {
                line = br.readLine();
                operation = line.split(" ");

                int operNum = Integer.parseInt(operation[0]);

                switch (operNum) {
                    case 1:
                        multiset.add(Integer.parseInt(operation[1]));
                        break;
                    case 2:
                        System.out.println(multiset.get());
                        break;
                }
            }
        } catch (IOException e) {}
    }
}
