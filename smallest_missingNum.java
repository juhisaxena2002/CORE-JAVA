public class smallest_missingNum {
    public static void main(String[] args) {
        
    }

    
    static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            } else{
                i++;
            }

        }
    }
    static void swap(int[] arr, int first, int second) {
       int temp;
       temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
       
   }

}
