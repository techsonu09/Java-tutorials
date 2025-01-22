import java.util.*;

public class buterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }

            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
