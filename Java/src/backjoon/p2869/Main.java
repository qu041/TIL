package p2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int days = (V - A) / (A - B) + 1;
        if ((V - A) % (A - B) != 0) {
            days++;
        }

        System.out.println(days);
    }
}
