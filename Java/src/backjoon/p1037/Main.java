package p1037;

import java.util.*;

public class Main {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 진짜 약수 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 정렬 후
        int result = arr[0] * arr[n - 1]; // 최소 × 최대
        System.out.println(result);
    }
}

