import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i]=sc.nextInt();
        }
        minElementInAnArray(arr);
        System.out.println();
        maxElementInAnArray(arr);
    }

    private static void maxElementInAnArray(int[] arr) {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print(min);
    }

    private static void minElementInAnArray(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
