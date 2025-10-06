package p1075;

import java.util.Scanner;

public class Main {
   
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
        int F = sc.nextInt();

        N = (N / 100) * 100; // 뒤 두 자리 00으로 만들기

        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((N + i) % F == 0) {
                result = i;
                break;
            }
        }

        System.out.printf("%02d\n", result); // 항상 두 자리 출력
    }
}
