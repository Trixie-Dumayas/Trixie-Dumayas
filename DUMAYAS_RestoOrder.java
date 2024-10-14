import java.util.Scanner;

public class DUMAYAS_RestoOrder {
    public static void main(String[] args){
        Scanner Order = new Scanner(System.in);
        int choice = 0;
        int quantity = 0;
        int total = 0;
        
        while (true){
            System.out.println("\nMENU \n1. Burger - PHP 100 \n2. Fries - PHP 50 \n3. Soda - PHP 30 \n4. Ice Cream - PHP 45 \n5. Exit \n");
            System.out.println("Enter the menu number of your choice: ");
            choice = Order.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter the quantity: ");
                    quantity = Order.nextInt();
                    total += quantity * 100;
                    System.out.println("You ordered Burger.");
                    System.out.println("Total amount: PHP " + total);
                    break;
                case 2:
                    System.out.println("Enter the quantity: ");
                    quantity = Order.nextInt();
                    total += quantity * 50;
                    System.out.println("You ordered Fries.");
                    System.out.println("Total amount: PHP " + total);
                    break;
                case 3:
                    System.out.println("Enter the quantity: ");
                    quantity = Order.nextInt();
                    total += quantity * 30;
                    System.out.println("You ordered Soda.");
                    System.out.println("Total amount: PHP "+ total);
                    break;
                case 4:
                    System.out.println("Enter the quantity: ");
                    quantity = Order.nextInt();
                    total += quantity * 45;
                    System.out.println("You ordered Ice Cream.");
                    System.out.println("Total amount: PHP " + total);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default: 
                    System.out.println("Invalid choice: Pick from 1-5");
                    break;
            }
            if(choice > 5){
                break;        
            }
        }
    }
}

                   

