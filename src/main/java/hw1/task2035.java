package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by bakla410 on 24.09.17.
 */
public class task2035 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String n = br.readLine();

//            List<String> parsedLine = Arrays.asList(br.readLine().split(" "));
//            List<Integer> line = parsedLine.stream().map(Integer::parseInt).collect(Collectors.toList());

            String[] parsedLine = br.readLine().split(" ");
            List<Integer> line = new LinkedList<>();
            for (String str: parsedLine) {
                line.add(Integer.parseInt(str));
            }

            Integer size = line.size();
            List<List<Integer>> matrix = new ArrayList<>(size);
            matrix.add(line);
            int count = 0;
            for (int i = 1; i < size; i++) {
//                List<Integer> prevLine = new LinkedList<>(matrix.get(i - 1));
//
//                Integer num = prevLine.get(0);
//                prevLine.remove(0);
//                prevLine.add(num);

                matrix.add(new LinkedList<>(matrix.get(i - 1)));
                List<Integer> prevLine = matrix.get(i);
                Integer num =  prevLine.get(0);
                prevLine.remove(0);
                prevLine.add(num);

                if (compareLists(line,  prevLine)) {
                    count++;
                }
            }
            System.out.println(size / (count + 1));
        } catch (IOException e) {
        }
    }

    public static boolean compareLists(List<Integer> a, List<Integer> b) {
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return false;
            }
        }
        return true;
    }
}
