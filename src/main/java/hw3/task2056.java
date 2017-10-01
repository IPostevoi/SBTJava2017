package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by bakla410 on 29.09.17.
 */
public class task2056 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder text = new StringBuilder();

        try {

            String line = br.readLine();

            while (line!= null) {
                text.append(line.toLowerCase() + " ");
                line = br.readLine();
            }

            List<String> words = Arrays.asList(text.toString().split(" "));

            Map<String, Integer> wordsMap = new HashMap<>();

            for (String word: words) {
                Integer value = wordsMap.get(word);
                if (value == null)
                    value = 0;
                wordsMap.put(word, value + 1);
            }

            List<Integer> values = new ArrayList<>(wordsMap.values());
            Collections.sort(values);
            Integer max = values.get(values.size() - 1);

            List<String> ans = new ArrayList<>();

            for (Map.Entry<String, Integer> entry: wordsMap.entrySet()) {
                if (entry.getValue() >= max) {
                    ans.add(entry.getKey());
                }
            }

            Collections.sort(ans);
            ans.forEach(System.out::println);

        } catch (IOException e) {}
    }
}
