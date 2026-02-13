
import java.util.Scanner;
// problem : display this GP-  3 , 12 , 48......... upto 'n' terms
public class GP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a = 3, r = 4 ;
        for (int i =  1 ; i <=n ; i++) {
            System.out.println(a);
            a*=r;
        }
    }
}
