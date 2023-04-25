
import java.util.Scanner;

public class reserve3vans {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        for (int i = 1; i <= n; ++i) {
            int day = scan.nextInt();

            if (A <= B && A <= C) {
                A += day;
                System.out.println("A");
            } else if (A > B && B <= C) {
                B += day;
                System.out.println("B");
            } else if (A > C && B > C) {
                C += day;
                System.out.println("C");
            }
        }
    }
}
