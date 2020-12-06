//Reverse Of An Array
import java.util.*;

class DSAQuestions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i]=sc.nextInt();
        }
        reverseOfArray(arr);
    }
    public static void reverseOfArray(int[] arr) {
        for (int i = arr.length-1; i >= 0 ;i--) {
            System.out.println(arr[i]);
        }
    }
}