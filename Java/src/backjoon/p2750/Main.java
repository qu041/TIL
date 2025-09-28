package p2750;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순 정렬

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
