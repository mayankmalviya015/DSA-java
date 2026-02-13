public class thirdmaximum {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // loop to find 1st, 2nd and 3rd maximum
        for (int i = 0; i < arr.length; i++) {

            int n = arr[i];

            if (n > first) {
                third = second;
                second = first;
                first = n;
            }
            else if (n > second && n != first) {
                third = second;
                second = n;
            }
            else if (n > third && n != first && n != second) {
                third = n;
            }
        }

        System.out.println("First maximum is: " + first);
        System.out.println("Second maximum is: " + second);
        System.out.println("Third maximum is: " + third);
    }
}
 
