import java.util.Scanner;
public class  tablebeginner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            num = sc.nextInt();
            System.out.println("the table of a given number is:");

            System.out.println(num*1);
            System.out.println(num*2);
            System.out.println(num*3);
            System.out.println(num*4);
            System.out.println(num*5);
            System.out.println(num*6);
            System.out.println(num*7);
            System.out.println(num*8);
            System.out.println(num*9);
            System.out.println(num*10);
        }
    }

}
