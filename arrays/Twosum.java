public class Twosum {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 8, 6, 2};
        int target = 10;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for( int j = i+1 ; j < n ; j++ ){
                if(arr[i] + arr[j] == target)
                    System.out.println(arr[i] +  " " +arr[j]);

            }
                }
            }
        }
    

