package backjoon.silver;

import java.util.Scanner;

public class DirectorSyom { //1436

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = 666;
        int count = 1;

        while (count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
