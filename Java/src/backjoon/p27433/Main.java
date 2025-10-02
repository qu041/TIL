package p27433;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long result = 1;

        for (int i = 2; i <= N; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}

