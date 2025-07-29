package Baekjoon._2884;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int H,M;
		H = scan.nextInt();
		M = scan.nextInt();
	
		if (M < 45) {
			H--;
			M = M - 45 + 60;
			
			if (H < 0) {
				H = 23;
			}
		} else {
			M = M - 45;
		}
		
		System.out.println(H + " " + M);

	}
	
}