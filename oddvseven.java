
import java.util.Scanner;

public class oddvseven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= 8; ++i) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                sumEven += n;
            } else if (n % 2 != 0) {
                sumOdd += n;
            }           
        }
        if (sumEven > sumOdd) {
            System.out.println("even");
        } else if (sumEven < sumOdd) {
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }
        System.out.println(sumEven+"\n"+sumOdd);
    }
}
