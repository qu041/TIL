package p15894;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();  // n이 최대 10^9 → int 범위 초과 가능 → long 사용
        System.out.println(4 * n);
        
        sc.close();
    }
}
