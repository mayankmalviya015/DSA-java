public class SelectionSort{
    public static void print(int[] arr){
        for(int ele :arr){
            System.err.print(ele+ " ");}
        System.err.println();
    }
    public static void swap(int[] arr, int i ,int j){
        int term =arr[i];
        arr[i] =arr[j];
        arr[j] =term;
    }

    public static void main(String[] args) {
        int[] arr = {4 ,-5 ,6 ,7 ,20 ,-9};
        int n =arr.length;
        print(arr);
         for(int x=0; x<n-1;x++){
            int min = Integer.MAX_VALUE;
            int idx =-1;
            for(int i = x; i<n; i++){
                if(arr[i]<min){
                    min = arr[i];
                    idx =i;
                }}
                swap(arr,x,idx);
            }
            print(arr);
         }
    }
