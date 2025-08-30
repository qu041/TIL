package p2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  

        for (int t = 0; t < T; t++) {
            int R = sc.nextInt();   // 반복 횟수
            String S = sc.next();   // 문자열

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                for (int j = 0; j < R; j++) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}