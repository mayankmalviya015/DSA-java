
import java.util.Scanner;
public class Ap2 {

public static void main(String[] args) {
    // problem : display this airthmatic progession - 4 , 7 , 10 , 13 , 16 ..... upto 'n' number of term 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n :");
    int n = sc.nextInt();
    for(int i=4; i<= n*3+1 ; i +=3){
        System.out.println(i);
    }
    sc.close();
}
}