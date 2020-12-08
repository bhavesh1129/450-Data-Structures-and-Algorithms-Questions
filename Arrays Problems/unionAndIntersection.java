import java.util.*;

public class unionAndIntersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sizeOfArray1=sc.nextInt();
        int sizeOfArray2=sc.nextInt();
        int[] arr1=new int[sizeOfArray1];
        int[] arr2=new int[sizeOfArray2];
        for (int i = 0; i < sizeOfArray1-1; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int j = 0; j < sizeOfArray2-1; j++) {
            arr2[j]=sc.nextInt();
        }
        unionOfArrays(arr1,sizeOfArray1,arr2,sizeOfArray2);
        System.out.println();
        intersectionOfArrays(arr1,sizeOfArray1,arr2,sizeOfArray2);

    }

    private static void intersectionOfArrays(int[] arr1, int sizeOfArray1, int[] arr2, int sizeOfArray2) {
        int i=0;
        int j=0;
        while(i<sizeOfArray1 && j<sizeOfArray2){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                System.out.print(arr1[i++]+" ");
                j++;
            }
        }
    }

    private static void unionOfArrays(int[] arr1, int sizeOfArray1, int[] arr2, int sizeOfArray2) {
        int i=0;
        int j=0;
        while(i<sizeOfArray1 && j<sizeOfArray2){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i++]+" ");
            }else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j++]+" ");
            }else{
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }
        while(i<sizeOfArray1){
            System.out.print(arr1[i++]+" ");
        }
        while(j<sizeOfArray2){
            System.out.print(arr2[j++]+" ");
        }
    }
}
