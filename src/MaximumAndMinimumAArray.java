public class MaximumAndMinimumAArray {

    static int getMinimumFromArray(int[] arr){
       int min=arr[0];
       for(int i=0;i<arr.length;i++){
           min= Math.min(min,arr[i]);
       }
       return min;
    }

    static int getMaximumFromArray(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.next();
    }

}
