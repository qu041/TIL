package p2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();  
        int B = sc.nextInt();  

        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';      // 숫자일 경우
            } else {
                digit = ch - 'A' + 10; // 알파벳일 경우
            }

            result = result * B + digit;
        }

        System.out.println(result);
    }
}
