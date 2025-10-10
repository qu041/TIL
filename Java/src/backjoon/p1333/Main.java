package p1333;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt(); // 노래 개수
        int L = sc.nextInt(); // 노래 길이
        int D = sc.nextInt(); // 전화벨 주기

        // 앨범 전체 재생 시간 (마지막 곡 뒤엔 정적 없음)
        int totalTime = N * L + (N - 1) * 5;

        int time = 0;

        while (true) {
            // 전화벨이 울리는 시점 time
            // time이 노래 중인지 확인
            boolean isSongPlaying = false;

            for (int i = 0; i < N; i++) {
                int start = i * (L + 5); // 곡 시작
                int end = start + L;     // 곡 끝
                if (time >= start && time < end) {
                    isSongPlaying = true;
                    break;
                }
            }

            if (!isSongPlaying) {
                System.out.println(time);
                break;
            }

            time += D;
            // 모든 앨범 끝난 이후에도 전화벨이 계속 울리므로 무한 가능
            // time >= totalTime이면 바로 출력해도 됨
            if (time > totalTime) {
                System.out.println(time);
                break;
            }
        }
    }
}

