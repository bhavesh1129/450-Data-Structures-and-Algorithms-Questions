import java.util.Scanner;

public class findDuplicateInArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[]  arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findDuplicatesInArray(arr);
    }

    private static void findDuplicatesInArray(int[] arr) {
        int duplicateElement=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    duplicateElement=arr[i];
                }
            }
        }
        System.out.println(duplicateElement);
    }
}