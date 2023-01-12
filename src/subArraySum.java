public class subArraySum {



    static int getSubArraySum(int[] arr,int startIndex,int endIndex){
        int sum =0;
        for(int i=startIndex;i<=endIndex;i++){
            sum=sum+arr[i];
        }
        return sum;
    }


   //public static void main(String[] args){
    //int[] arr=  int[], int,int;
    //System.out.println(getSubArraySum(arr));
    //}

    public static void main(String[] args){
        int a=13;
        int b=14;
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        System.out.println(max);
        System.out.println(min);
    }



}
