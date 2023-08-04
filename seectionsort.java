import java.util.Arrays;

public class seectionsort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,7};
        slelection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void slelection(int arr[]){
        for(int i=0;i<arr.length;i++){
        int end = arr.length-i-1;
        int max = find_maxIndex(arr,0,end);
        swap(arr,max,end);
        }

    }
    static int find_maxIndex(int []arr, int start, int end){
         int max = start;
         for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
         }
         return max;
    }
    static void swap(int a[], int first, int second){
        int temp;
        temp = a[first];
        a[first] = a[second];
        a[second] =  temp;
    }
    
}
