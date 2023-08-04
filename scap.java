import java.util.Scanner;

public class scap {
    public static void printswaparr(int arr[]){
        for(int i=0;i<arr.length-1;i+=2){
            int temp;
            temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1]= temp;
        }
    }

    public static void main(String[] args) {
        
       int arr[] = {9,3,6,12,14,16};
       System.out.println("beforre swapping");
       for(int i: arr){
        System.out.print(" "+ i);
       }
       System.out.println();
       printswaparr(arr);
       System.out.println("after swapping:");
       for(int x:arr){
        System.out.print(" " + x);
       }
    }
}
