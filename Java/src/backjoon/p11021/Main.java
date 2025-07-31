package p11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // 테스트 케이스 수 입력

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();  // A 입력
            int B = sc.nextInt();  // B 입력
            int sum = A + B;
            System.out.println("Case #" + i + ": " + sum);
        }

    }
}