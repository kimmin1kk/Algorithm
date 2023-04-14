package backjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Atm { //11399
    public void run() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int[] arr = new int [a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int total = 0, sum = 0;
        for (int i = 0; i < a; i++) {
            total += sum + arr[i];
            sum += arr[i];
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        }
}
