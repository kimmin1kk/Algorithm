package backjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Coin_0 {
    public void run() throws IOException { //11047
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (coin[i] <= K) {
                count += (K / coin[i]);
                K = K % coin[i];
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}

