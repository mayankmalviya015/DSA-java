public class mergeTwoShortedArray {
    public static void main(String[] args) {
        int[] arr ={12 , 34 , 45 ,58 ,68 ,79 };
        int[] nums ={ 0 , 1 , 42 ,56 ,85 ,97 };
        int a = arr.length;
        int b = nums.length;
        int[] br = new int[a +b];
        int i=0, j =0 , k= 0 ;
        while(i< a && j<b){
            if(arr[i] <= nums[j]){
                br[k] = arr[i];
                k++;
                i++;
            }
            else {
                br[k] = nums[j];
               k++;
               j++;
        }
        }
        if(i== a){
            while(j<b){
                br[k]= nums[j];
                k++;
                j++;
            }
        }
          if(j==b){
            while(i<a){
                br[k]= arr[i];
                k++;
                i++;
            }
        }
        for(int ele : br){
            System.out.print(ele+ " ");
        }
    }
}
