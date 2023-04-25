
import java.util.Scanner;

public class howtobreak {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (;;) {
            int x = scan.nextInt();
            if (x == 0) {
                break;
            } else {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
