package Baekjoon._11382;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a,b,c; //10^12는 int로 처리 안됨 long으로 처리 10^18까지 가능.
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
			
		System.out.println(a + b + c);
		
		
	}

}
