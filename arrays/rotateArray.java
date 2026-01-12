
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {58 ,1 ,4 , 2, 6 ,4 ,25 };
        int n = nums.length;
        System.out.println("enter k");
        int k = sc.nextInt();
        k = k%n;
        int index =0 ;
        int[] arr = new int[n];
        for (int i = n-k; i < n; i++) {
            arr[index] = nums[i];
            index++;
        }
         for (int i = 0; i < n-k; i++) {
            arr[index] = nums[i];
            index++;
    }
           for(int ele : arr ){
            System.out.print(ele + " ");
        }
}}
