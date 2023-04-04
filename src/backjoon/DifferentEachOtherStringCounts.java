package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DifferentEachOtherStringCounts { //11478
    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        HashSet<String> list = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j =i; j <= s.length(); j++) {
                list.add(s.substring(i, j));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.size() - 1).append("\n");
        System.out.println(sb);
    }
}

