

public class stringrev {
    public static void string_rev(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        string_rev(str, index-1);
    }
    public static void main(String[] args) {
        String s = "i am jugs baby okay bye !";
        string_rev(s, s.length()-1);
    }

}
