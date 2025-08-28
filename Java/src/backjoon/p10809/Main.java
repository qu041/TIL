package p10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();  
        int[] alphabet = new int[26];

        // 전부 -1로 초기화
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        // 문자열 순회
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int idx = c - 'a';   // 알파벳을 0~25로 변환
            if (alphabet[idx] == -1) { // 처음 등장했을 때만 기록
                alphabet[idx] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}