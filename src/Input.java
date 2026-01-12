import java.sql.SQLOutput;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        //inputs as integer
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your age : ");
//        int age = sc.nextInt();
//        System.out.println(age);

        // input as String

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name : ");
        String name = sc.nextLine();
        System.out.println(name);

    }
}
