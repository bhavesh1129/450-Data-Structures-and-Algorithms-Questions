import java.util.*;

public class cyclicRotationOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int numberOfRotation=1;
        cyclicRotationOfArray(arr,numberOfRotation);
        for (int val : arr) {
            System.out.print(val+" ");
        }
    }

    private static void cyclicRotationOfArray(int[] arr,int numberOfRotation) {
        reverseOfFirstArray(arr,0,arr.length-numberOfRotation-1);
        reverseOfFirstArray(arr,arr.length-numberOfRotation,arr.length-1);
        reverseOfFirstArray(arr,0,arr.length-1);
    }

    private static void reverseOfFirstArray(int[] arr, int leftindex, int rightIndex) {
        int i=leftindex;
        int j=rightIndex;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
}
