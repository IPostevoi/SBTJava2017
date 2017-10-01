package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by bakla410 on 29.09.17.
 */
public class task2042 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line = br.readLine();
            String pattern = br.readLine().replace("?", ".");

            Map<String, String> map = new HashMap<>();
            
            List<String> substrings = new ArrayList<>();
            for (int i = 0; i < line.length(); i++) {
                for (int j = i + 1; j <= line.length(); j++) {
                    map.put(i + "," + j, line.substring(i, j));
                }
            }

            Map<String, String> filteredMap = map.entrySet().stream().filter(item -> item.getValue().matches(pattern))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            Set<String> keySet = filteredMap.keySet();
            List<String> keyList = new ArrayList<>(keySet);
            List<Integer> sortedKeyList = keyList.stream().map(item -> Integer.parseInt(item.split(",")[0])).collect(Collectors.toList());
            Collections.sort(sortedKeyList);

            sortedKeyList.forEach(item -> System.out.println(item + 1));

        } catch (IOException e) {}
    }
}
