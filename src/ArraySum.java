public class ArraySum {

    static int getArraySum(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    // write a function which takes integer array as input
    // and return product of element in the array
    static int getArrayProduct(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        return prod;
    }

     public static void main(String[] args){
        int[] arr = new int[]{1,4,5,6};
        System.out.println(getArraySum(arr));
        System.out.println(getArrayProduct(arr));
     }
}

