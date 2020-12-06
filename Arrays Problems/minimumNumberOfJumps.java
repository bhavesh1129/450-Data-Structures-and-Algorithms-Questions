//Minimum Number of Jumps to Reach End of the Array
import java.util.Scanner;

public class minimumNumberOfJumps{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int result=minimumNumberOfJumps(arr);
        System.out.print(result);
    }

    private static int minimumNumberOfJumps(int[] arr) {
        int maxReachable=arr[0];
        int jumps=1;
        int stepsPossible=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(i==arr.length-1){
                return jumps;
            }
            maxReachable=Math.max(maxReachable,i+arr[i]); 
            stepsPossible--;
            if(stepsPossible==0){
                jumps++;
                if(i>=maxReachable){
                    return -1;
                }
                stepsPossible=maxReachable-i;
            }
        }
        return jumps;
    }
}