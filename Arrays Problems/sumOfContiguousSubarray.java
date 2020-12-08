//Largest Sum Of Contiguous Subarray
import java.util.*;
public class sumOfContiguousSubarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int largestSum=largestSumOfContiguousSubarray(arr);
        System.out.print(largestSum);
    }

    private static int largestSumOfContiguousSubarray(int[] arr) {
        int sumOfStartingArray=0;
        int sumOfLastArray=0;
        for (int i = 0; i < arr.length; i++) {
            sumOfLastArray+=arr[i];
            if(sumOfLastArray<0){
                sumOfLastArray=0;
            }
            if(sumOfStartingArray<sumOfLastArray){
                sumOfStartingArray=sumOfLastArray;
            }
        }
        return sumOfLastArray;
    }
}