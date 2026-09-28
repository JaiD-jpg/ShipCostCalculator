import java.util.Scanner;
public class ShipCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter item price.");
        int itemPrice = 0;
        final double shippingTax= 0.02;

        if (in.hasNextInt()){
            itemPrice= in.nextInt();
            if (itemPrice>=100){
                System.out.println("Your price for the item is "+ itemPrice);
            }
            else{
                double tax= itemPrice * 0.02;
                double totalPrice= itemPrice + tax;
                System.out.println("Your price for the item is "+ totalPrice);
            }
        }
    }

}
