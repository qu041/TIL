package p27866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();  
        int i = sc.nextInt();  

        //인덱스는 0부터 시작하므로 i-1
        System.out.println(S.charAt(i - 1));
    }
}