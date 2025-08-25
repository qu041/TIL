package p11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      // 숫자의 개수 (안 써도 됨)
        String num = sc.next();    // 숫자들을 문자열로 입력

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += num.charAt(i) - '0';  // 문자 > 숫자
        }

        System.out.println(sum);
    }
}