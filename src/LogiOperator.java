public class LogiOperator {
    public static void main(String[] args){
        // && || operators

        int a = 60;
        int b = 40;
        if(a<50 && b<50)
            System.out.println("Both are less than 50");

        int c = 70;
        if (a < 50 || b < 50 || c < 50)
            System.out.println("atleast one is less than 50");

    }
}
