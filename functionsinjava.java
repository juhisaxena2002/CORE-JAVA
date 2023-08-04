import java.util.Scanner;

public class functionsinjava {
    public static void myName(String name){
        System.out.println("your name is :" + name);
        return;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your name:");
            String name = sc.next();
            myName(name);
        }
    }
    
}
