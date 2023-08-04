import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class rotatedArray{
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,2};
       System.out.println(findRotation(arr));
    }

    public static int findRotation(int arr[]){
         //int pivot = Collections.max((Collection<? extends T>) Arrays.asList(arr));
        int pivot = Arrays.stream(arr).max().getAsInt();
         //pivot = Math.max(0, 0);
         //System.out.println("rotation of the array is : " + pivot+1);
        return arr[pivot]+1;
    }
}
