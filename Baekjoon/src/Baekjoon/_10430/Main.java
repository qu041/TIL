package Baekjoon._10430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a,b,c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}

}
