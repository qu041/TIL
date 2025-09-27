import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr); // 정렬해서 arr[2]가 가장 긴 변

        if (arr[2] < arr[0] + arr[1]) {
            // 삼각형 가능
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            // 가장 긴 변을 줄여야 함
            System.out.println((arr[0] + arr[1]) * 2 - 1);
        }
    }
}
