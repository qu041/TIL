package p5073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            
        	int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            int max = Math.max(a, Math.max(b, c));

            if (a + b + c - max <= max) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}

