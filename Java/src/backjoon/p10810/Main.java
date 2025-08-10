package p10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 

        int[] basket = new int[N + 1]; // 1번부터 사용, 초기값은 0

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // 시작
            int j = sc.nextInt(); // 끝
            int k = sc.nextInt(); // 공 번호

            for (int idx = i; idx <= j; idx++) {
                basket[idx] = k; 
            }
        }

        for (int x = 1; x <= N; x++) {
            System.out.print(basket[x] + " ");
        }

        sc.close();
    }
}
