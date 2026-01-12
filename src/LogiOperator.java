import java.util.Scanner;
public class LogiOperator {
    public static void main(String[] args){
        // && || operators

//        int a = 60;
//        int b = 40;
//        if(a<50 && b<50)
//            System.out.println("Both are less than 50");
//
//        int c = 70;
//        if (a < 50 || b < 50 || c < 50)
//            System.out.println("atleast one is less than 50");
//
//        boolean IsSunUp = false;
//        if(IsSunUp == true)
//            System.out.println("Day");
//        else
//            System.out.println("Night");


         /////// Wrong code

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How much money do you have : ");
//        int PenAmount = sc.nextInt();
//        int BookAmount = sc.nextInt();
//        if(PenAmount > 10 && BookAmount> 40)
//            System.out.println("You can buy both");
//        if(PenAmount >= 10 && BookAmount <= 40)
//            System.out.println("You can buy Pen only");
//        if(PenAmount>=10 && BookAmount >= 40)
//            System.out.println("You can buy the book");
//        else
//            System.out.println("You don't have enough money");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount : ");

        int cash = sc.nextInt();

        if(cash<10){
            System.out.println("You don't have enough money");}
        else if(cash>10 && cash < 40){
            System.out.println("You can buy only pen");}
        else{
            System.out.println("You can buy both");}

    }
}
