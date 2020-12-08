import java.util.*;

public class sortingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i]=sc.nextInt();
        }
        sortingAnArray(arr);
    }

    private static void sortingAnArray(int[] arr) {
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.println(arr[j]);
            }
        }
    }
}
