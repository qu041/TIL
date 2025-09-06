package p10798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lines = new String[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder();

        // 최대 15글자까지 확인
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < lines[j].length()) { 
                    sb.append(lines[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
