
import java.util.Scanner;

public class GroceryShoppingCalculator {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        
        int item1price = 0;
        int item2price = 0;
        int item3price = 0;
        
        int item1qty = 0;
        int item2qty = 0;
        int item3qty = 0;
        
        System.out.println("Enter the price of item 1: ");
        item1price = myObj.nextInt();
        
        System.out.println("Enter the quantity of item 1: ");
        item1qty = myObj.nextInt();
        
        int total1 = item1price * item1qty;
        
        System.out.println("Enter the price of item 2: ");
        item2price = myObj.nextInt();
        
        System.out.println("Enter the quantity of item 2: ");
        item2qty = myObj.nextInt();
        
        int total2 = item2price * item2qty;
        
        System.out.println("Enter the price of item 3: ");
        item3price = myObj.nextInt();
        
        System.out.println("Enter the quantity of item 3: ");
        item3qty = myObj.nextInt();
        
        int total3 = item3price * item3qty;
        
        int subtotal = total1+ total2 + total3;
        
        System.out.println("Subtotal: " + subtotal);
        
        double discount = subtotal * 0.05;
        System.out.println("Discount: " + discount);
        
        double salestax = (subtotal - discount) * 0.12;
        System.out.println("Sales Tax: " + salestax);
        
        double finaltotal = (subtotal - discount + salestax);
        System.out.print("Final Total: " + finaltotal);
    }
}
