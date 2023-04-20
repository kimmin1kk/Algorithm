package backjoon.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumber2 { //2751
    public void run() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
