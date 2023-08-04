public class square_root {
    public static void main(String[] args) {
        // int temp_Res = sq_root(36);
        // System.out.println(temp_Res);
        double res = precison(14, 3, 4);
        System.out.println(res);

    }

    public static int sq_root(int num){
        int start = 0;
        int end = num;
        int mid = start + (end-start)/2;
        int ans = -1;
        while(start<end){
        int square = mid*mid;
        if(square == num){
            return mid;
        }
        else if(square < num){
            ans = mid;
            start = mid+1;

        }
        else{
            end = mid-1;
        }
       mid = start + (end-start)/2;
        }
        return start;

    }

    public static double precison(int num, int pre, int temp_Res){
        double factor = 1;
        double ans = temp_Res;
        for(int i=0;i<pre;i++){
            factor = factor/10;
            for(Double j=ans; j*j<num;j=factor+j){
                ans = j;
            }
        }
        return ans;

    }
}
