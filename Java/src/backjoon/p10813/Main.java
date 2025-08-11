package p10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 교환 횟수

        int[] basket = new int[N + 1]; // 1번부터 사용

        // 초기 상태: 각 바구니 번호와 같은 공
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        // M번 교환
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }

        sc.close();
    }
}
