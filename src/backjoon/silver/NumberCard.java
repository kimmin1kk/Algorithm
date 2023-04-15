package backjoon.silver;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCard { //10815
    private static int N;
    private static int[] nArr;
    private static int M;
    private static StringBuilder sb = new StringBuilder();

    public void run() {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nArr = new int[N];
        for (int i = 0; i < N; i++) {
            nArr[i] = sc.nextInt();
        }
        Arrays.sort(nArr);
        M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int m = sc.nextInt();
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int n = nArr[mid];
                if (n == m) {
                    sb.append(1 + " ");
                    break;
                }
                if (n > m) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    sb.append(0 + " ");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
