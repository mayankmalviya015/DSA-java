public class sortzeroesones {
    public static void main(String[] args ){
        int[] arr = {0 ,1 ,0 ,0 ,1 , 0 ,0};
        int n = arr.length;
        int i= 0 , j= n;
        while(i<= j){
            if (i>j){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp ;
                i++;
                j--;
            }
            for( int ele : arr){
                System.out.println(ele+ " ");
            }

        }

    }
}
