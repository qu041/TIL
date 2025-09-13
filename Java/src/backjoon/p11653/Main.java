package p11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        // 마지막에 소수가 남아있을 수 있음
        if (N > 1) {
            System.out.println(N);
        }
    }
}
