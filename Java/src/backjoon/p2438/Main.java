package p2438;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 출력할 줄 수 입력

        for (int i = 1; i <= N; i++) {
            // i개의 별을 한 줄에 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        sc.close();
    }
}