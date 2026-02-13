
import java.util.Scanner;

public class rotateusingAarray {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        int[] nums = {45 ,12 ,78 ,65 ,25 ,74, 1,4};
         int n = nums.length;
       k = k%n ;
       reverse(nums, 0 , n-k-1);
       reverse(nums, n-k , n-1);
       reverse(nums, 0 ,n-1);
       for(int i = 0; i < n; i++){
    System.out.print(nums[i] + " ");
}         
        }
            public static void reverse(int[] nums , int i , int j){
        while(i<=j){
            int temp = nums [i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++ ; j-- ;

        }
    }
}
