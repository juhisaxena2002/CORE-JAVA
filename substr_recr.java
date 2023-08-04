public class substr_recr{
    public static void main(String[] args) {
        sub_str("", "abc");
    }

    public static void sub_str(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sub_str(p+ch, up.substring(1));
        sub_str(p, up.substring(1));

}
}