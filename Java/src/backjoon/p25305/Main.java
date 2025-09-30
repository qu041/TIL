package p25305;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 학생 수
        int k = sc.nextInt();  // 상을 받을 인원 수

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(scores);

        // 상위 k명 중 가장 낮은 점수 = 뒤에서 k번째 값
        System.out.println(scores[N - k]);
    }
}

