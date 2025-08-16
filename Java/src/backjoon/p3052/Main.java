package p3052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] remainder = new boolean[42]; // 나머지 0~41 체크
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int r = num % 42;
            remainder[r] = true; // 해당 나머지가 나왔음을 표시
        }

        for (int i = 0; i < 42; i++) {
            if (remainder[i]) { // true인 것만 카운트
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}