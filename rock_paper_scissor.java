import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rock = 1, paper = 0, scissor = 2");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(userInput == computerInput ){
            System.out.println("DRAW!!");
        }
        else if (( userInput == 0 && computerInput == 1) || (userInput == 1 && computerInput == 2 ) ||
         (userInput == 2 && computerInput == 0) ){
        System.out.println("USER WINS!!"); 
         }
         else if(userInput>3 || userInput<0){
            System.out.println("invalid input number hatho yaha se !");
         }
      

        else{
            System.out.println("COMPUTER WINS!!");
         }
}
}
