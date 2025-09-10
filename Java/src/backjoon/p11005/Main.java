package p11005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 10진법 수
        int B = sc.nextInt();  // 변환할 진법

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;

            if (remainder < 10) {
                sb.append((char) (remainder + '0'));   // 0~9
            } else {
                sb.append((char) (remainder - 10 + 'A')); // A~Z
            }

            N /= B;
        }

        System.out.println(sb.reverse().toString());
    }
}

