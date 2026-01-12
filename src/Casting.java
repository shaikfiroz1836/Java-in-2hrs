public class Casting {
    public static void main(String[] args){
        // Implicit casting
        double price = 100.0;
        double FinalPrice = price + 18;
        System.out.println(FinalPrice);

        // Explicit casting
        int p = 100;
        int fp = p + (int)18.99;
        System.out.println(fp);
    }
}
