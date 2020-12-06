import java.util.*;

public class negativeElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i]=sc.nextInt();
        }
        negativeElementToOneSideOfArray(arr);
    }

    private static void negativeElementToOneSideOfArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
