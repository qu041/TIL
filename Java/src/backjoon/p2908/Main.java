package p2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        // 문자열 뒤집기
        String reverseA = new StringBuilder(A).reverse().toString();
        String reverseB = new StringBuilder(B).reverse().toString();

        int numA = Integer.parseInt(reverseA);
        int numB = Integer.parseInt(reverseB);

        System.out.println(Math.max(numA, numB));
    }
}