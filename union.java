import java.util.Arrays;
import java.util.LinkedHashSet;

public class union {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,6,7,8};
        //union_arr(arr1, arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        intersection(arr1, arr2);
    }
    public static void union_arr(int arr1[], int arr2[]){
        LinkedHashSet <Integer> set = new LinkedHashSet<>();
        for(int i=0;i<=arr1.length-1;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        System.out.println(set.toString());
    }

    public static void intersection(int arr1[], int arr2[]){
        int i=0,j=0;
        if(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                // when both are equal
                System.out.println(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}

