package Baekjoon._2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int total = A * 60 + B + C; // 분으로 환산
		
		int hour = (total / 60) % 24; // 24시로 환산
		int minute = total % 60;	// 분으로 환산
		
		System.out.println(hour + " " + minute);
		
		
	}

}
