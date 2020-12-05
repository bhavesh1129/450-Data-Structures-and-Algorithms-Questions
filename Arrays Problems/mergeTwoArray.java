import java.util.*;

public class mergeTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sizeOfFirstArray = sc.nextInt();
        int sizeOfSecondArray = sc.nextInt();

        int[] arr1 = new int[sizeOfFirstArray];
        int[] arr2 = new int[sizeOfSecondArray];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        mergeTwoArray(arr1,arr2);
    }

    private static void mergeTwoArray(int[] arr1, int[] arr2) {

        int[] newMergedArray = new int[arr1.length+arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            newMergedArray[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            newMergedArray[count++] = arr2[j];
        }
        Arrays.sort(newMergedArray);
        for (int k = 0; k < newMergedArray.length; k++) {
            System.out.print(newMergedArray[k]+" ");
        }
    }
}
