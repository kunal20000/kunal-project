package array.sorting;

public class InsertionSort {
    //input: int[] arr;
    //output: void
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int j = 0;
            int k = i;
            int temp = arr[i];



            while(j<i && arr[j]<temp){
                j++;
            }

            while(k!=j){
                arr[k]=arr[k-1];
                k--;
            }
            arr[j]=temp;
        }



        }

         public static void main(String[] args) {
             int[] arr= new int[]{4,3,2,10,12,1,5,6};
             insertionSort(arr);
         }


}
