package p1408;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        String now = sc.next();      // 현재 시간
        String start = sc.next();    // 임무 시작 시간

        String[] n = now.split(":");
        String[] s = start.split(":");

        int nowSec = Integer.parseInt(n[0]) * 3600
                    + Integer.parseInt(n[1]) * 60
                    + Integer.parseInt(n[2]);

        int startSec = Integer.parseInt(s[0]) * 3600
                      + Integer.parseInt(s[1]) * 60
                      + Integer.parseInt(s[2]);

        int diff = startSec - nowSec;
        if (diff < 0) diff += 24 * 3600; // 하루(24시간) 더하기

        int h = diff / 3600;
        int m = (diff % 3600) / 60;
        int sec = diff % 60;

        System.out.printf("%02d:%02d:%02d\n", h, m, sec);
    }
}
