package p15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수 입력

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" "); // 공백 기준으로 split
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            bw.write((A + B) + "\n"); // 출력 줄바꿈은 \n
        }

        bw.flush(); // 출력 한 번에
        bw.close();
        br.close();
    }
}
