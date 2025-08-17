package p10811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[N + 1]; // 1번부터 사용
        for (int i = 1; i <= N; i++) a[i] = i;

        for (int t = 0; t < M; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            // 구간 [i..j] 뒤집기
            int l = i, r = j;
            while (l < r) {
                int tmp = a[l];
                a[l] = a[r];
                a[r] = tmp;
                l++; r--;
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (i > 1) sb.append(' ');
            sb.append(a[i]);
        }
        System.out.println(sb.toString());

        sc.close();
    }
}
