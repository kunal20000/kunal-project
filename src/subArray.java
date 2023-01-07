public class subArray {

    public static int getSubArraySum(int[] arr,int startIndex,int endIndex){
        int sum =0;
        for(int i=startIndex;i<=endIndex;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
