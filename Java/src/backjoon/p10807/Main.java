package p10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 정수의 개수
        int[] numbers = new int[N];

        // N개의 정수를 배열에 저장
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int v = sc.nextInt();  
        int count = 0;

        
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count++;
            }
        }

        System.out.println(count);  

        sc.close();
    }
}

