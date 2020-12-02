import java.util.*;

public class kadaneAlgorithm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = kadaneAlgorthim(arr);
        System.out.print(result);
    }

    private static int kadaneAlgorthim(int[] arr) {
        int initialSumOfArray=0;
        int finalSumOfArray=0;

        for (int i = 0; i < arr.length; i++) {
            finalSumOfArray+=arr[i];
            if(finalSumOfArray<0){
                finalSumOfArray=0;
            }
            if(initialSumOfArray<finalSumOfArray){
                initialSumOfArray=finalSumOfArray;
            }
        }
        return initialSumOfArray;
    }
}