package p25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 입력받은 바이트 크기

        int count = N / 4;  // 4바이트당 long 하나

        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }

        System.out.println("int");  // 마지막에 int 붙이기

        sc.close();
    }
}
