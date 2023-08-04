import javax.sql.rowset.spi.SyncResolver;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jugsss");
        System.out.println(sb);


        System.out.println(sb.charAt(3));
        //sb.setCharAt(2, 't');


       // System.out.println(sb);

        sb.insert(1, 'o');
        System.out.println(sb);


        // delete the extra 'o'character
        sb.delete(1, 2);
        System.out.println(sb);

        sb.append("jiiii");
        System.out.println(sb);

        //REVERSE THE STRING

        String s="juhi";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
                rev += s.charAt(i);
}           System.out.println(rev);    
        }
        
}
