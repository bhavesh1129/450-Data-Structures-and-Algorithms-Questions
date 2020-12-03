import java.util.*;

public class kthLargestInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print(k+" largest element in array is ");
        kthLargestElementInAnArray(arr,k);
    }

    private static void kthLargestElementInAnArray(int[] arr, int k) {
        if(k==0){
            k=k;
        }else{
            k=k-1;
        }
        Arrays.sort(arr);
        System.out.print(+arr[arr.length-k-1]+" ");        
    }
}
