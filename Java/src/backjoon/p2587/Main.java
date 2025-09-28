package p2587;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        int avg = sum / 5;      // 평균
        int median = arr[2];    // 중앙값 (0,1,2,3,4 중 2번째)

        System.out.println(avg);
        System.out.println(median);
    }
}
