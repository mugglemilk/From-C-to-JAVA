
import java.util.Scanner;

public class thevoicesu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int a = k;
        int b = k;
        for (int i = 1; i <= n; ++i) {

            int sex = scan.nextInt();
            int director1 = scan.nextInt();
            int director2 = scan.nextInt();

            if (director1 >= 9 && director2 >= 9) {
                if (sex == 1 && a > 0) {
                    System.out.println(i + " " + 1);
                    a--;
                } else if (sex == 1 && b > 0) {
                    System.out.println(i + " " + 2);
                    b--;
                } else if (sex == 2 && b > 0) {
                    System.out.println(i + " " + 2);
                    b--;
                } else if (sex == 2 && a > 0) {
                    System.out.println(i + " " + 1);
                    a--;
                }
            } else if (director1 >= 9 && a > 0) {
                System.out.println(i + " " + 1);
                a--;
            } else if (director2 >= 9 && b > 0) {
                System.out.println(i + " " + 2);
                b--;
            }
        }
    }
}
