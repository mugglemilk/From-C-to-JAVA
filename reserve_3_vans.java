
import java.util.Scanner;

public class reserve_3_vans {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < n; ++i) {
            int x = scan.nextInt();

            if (a <= b && a <= c) {
                System.out.println("A");
                a += x;
            } else if (b <= a && b <= c) {
                System.out.println("B");
                b += x;
            } else {
                System.out.println("C");
                c += x;
            }
        }
    }
}
