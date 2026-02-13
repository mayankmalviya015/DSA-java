//write the program to cheack if a number is composite or not?
import java.util.Scanner;
public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for( int i= 2 ; i<= n-1; i++){
            if(n%i==0){
                System.out.println("This is composite number");
                break;    
            }
            else System.out.println("This is not composite number");
        }
    }   
}
