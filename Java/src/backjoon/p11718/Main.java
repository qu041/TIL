package p11718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {   // 입력이 남아있을 동안
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
