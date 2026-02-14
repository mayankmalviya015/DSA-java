import java.util.*;
public class BuiltIn {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int[] arr={1 ,4 ,2 ,7 ,35 ,13 ,5};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
}
