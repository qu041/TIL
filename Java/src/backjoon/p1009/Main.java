package p1009;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = 1;

            for (int i = 0; i < b; i++) {
                result = (result * a) % 10;
            }

            if (result == 0) result = 10; // 0이면 10번 컴퓨터
            System.out.println(result);
        }
    }
}

