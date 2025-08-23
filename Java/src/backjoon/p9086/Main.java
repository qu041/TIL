package p9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 개수
        for (int t = 0; t < T; t++) {
            String S = sc.next();  
            // 첫 글자 + 마지막 글자
            System.out.println("" + S.charAt(0) + S.charAt(S.length() - 1));
        }
    }
}