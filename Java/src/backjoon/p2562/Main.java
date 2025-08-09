package p2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // 최댓값 초기화
        int index = 0; // 위치 저장

        for (int i = 1; i <= 9; i++) { // 1번째부터 9번째까지
            int num = sc.nextInt();
            if (num > max) {
                max = num;
                index = i; // 현재 위치 저장
            }
        }

        System.out.println(max);
        System.out.println(index);

        sc.close();
    }
}