import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        // For loop
//        for(int i = 0;i<=10;i++){
//            System.out.println(i);
//        }


        // While loop
//        int i = 1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }


        // Do while loop
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);


        // Do while exercise
        int num = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            num = sc.nextInt();
            System.out.println("Here's your output : "+ num);
        }while(num >=0 );
        System.out.println("The End");
    }
}
