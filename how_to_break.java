
import java.util.Scanner;

public class how_to_break {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for(;;){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
