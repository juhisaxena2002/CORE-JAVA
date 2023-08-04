import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println("you entered:"+ name);

        //concatenation function

        // String firstname = "juhi";
        // String lastname = "Saxena";
        // String fullname = firstname + lastname;
        // System.out.println(fullname); //length function



        //charAt function
        // String fullName = "juhi saxena ";
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fulllName.charAt(i));
        // }

        //COMPARSION OF TWO STRINGS FFUNCTION

        //if
        // str1>str2 --> +ve value
        // str1==str2--> zero yaa 0
        // str1<str2 --> -ve value

        //hello wello --> wello is greater one because of w yaa
        // aahelllo aabello --> aa are ssame but aafter that hello and bllo then beello will won 

        
         // String str1 = "good";
         // String str2 = "good";
         // if(str1.compareTo(str2)==0){
         //    System.out.println("matched");
         // }
         // else{
         //    System.out.println("not matched");
         // }


         // STRINGS ARE IMMUTABLE 

         String sentence = "my name is juhi saxena ";
         // substring(beg string, end string)

         String name = sentence.substring(10, sentence.length());
         String name2 = sentence.substring(10, 14);
         System.out.println(name);
         System.out.println(name2);
    }
}
