public class watercontainer {
    public static int max_area(int height[]){
        int area = 0;
        int start = 0, end = height.length;
        while(start< end){
            int w = end - start;
            int h = Math.min(height[end], height[start]);
            int a = w*h;
            if(a > area){
                area = a;
            }
            if(height[start]<height[end])
            start++;
            else{
                end--;
            }

        }
        return area;

    }
    
    public static void main(String[] args) {
        int arr[] = {1,5,4,3};
      int  calc = max_area(arr);
      System.out.println(calc);
}
}
