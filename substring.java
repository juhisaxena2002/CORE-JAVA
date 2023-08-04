public class substring {
    public static void substrings(String str) {
        int length = str.length();
        for (int index = 0; index < length; index++) {
            for (int j = index; j <length; j++) {
                System.out.println(str.substring(index, j+1));
            }
        }
    }
    public static void main(String[] args) {
        substrings("abc");
    }
}
