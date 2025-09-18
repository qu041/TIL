package p27323;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();  // 세로 길이
        int B = sc.nextInt();  // 가로 길이

        System.out.println(A * B);
        
        sc.close();
    }
}