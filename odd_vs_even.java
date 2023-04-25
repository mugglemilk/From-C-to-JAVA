
import java.util.Scanner;

public class odd_vs_even {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= 8; ++i) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                even += n;
            } else if (n % 2 != 0) {
                odd += n;
            }
        }
        if (even > odd) {
            System.out.println("even");
        } else if (odd > even) {
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
