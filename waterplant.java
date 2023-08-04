public class waterplant {
    
    public static int wateringplants(int [] plant, int capacity){
        int no_of_steps = 0;
        int i=0;
        int can = capacity;
        while(i<=plant.length){
            if(can>=plant[i]){
                can = can-plant[i];
                ++no_of_steps;
                ++i;
            }
            else{
                can = capacity;
                no_of_steps = no_of_steps- i*2;
            }
        }
        return no_of_steps;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,3};
        int now = wateringplants(arr, 5);
        System.out.println(now);
    }
}
