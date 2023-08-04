import java.util.HashMap;

public class targetsum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 15;
        subarray(arr, sum);

    }
    public static void subarray(int nums [], int target){
        int cur_sum = 0 ;
        int start = 0;
        int end = -1;

        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            cur_sum += nums[i];
        
        if(cur_sum == target){
            start = 0; end = i;
            break;
                }
        if(hm.containsKey(cur_sum - target)){
            start = hm.get(cur_sum - target)+1;
            end = i; break;
        }
        hm.put(cur_sum, i);
    }
    if(end == -1){
        System.out.println("not found");
    }
    else{
        System.out.println(start + " " + end);
    }

    }
}
