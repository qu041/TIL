package p9506;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break; // 입력 종료

            List<Integer> divisors = new ArrayList<>();

            // 1부터 n-1까지의 약수 구하기
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                }
            }

            // 약수의 합이 n과 같은지 확인
            int sum = 0;
            for (int d : divisors) {
                sum += d;
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        sc.close();
    }
}
