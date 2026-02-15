public class BubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }    
    public static void main(String[] args) {
        int[] arr={ 5 ,52 ,3 ,2 ,1};
        int n =arr.length;
        for (int j = 0; j <= n-1; j++) {
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int term = arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1] =term;
                }
            }
            
        }
        print(arr);
    }
}
