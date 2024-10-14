import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args){
        numberProcessor();
    }
    public static void numberProcessor(){
        Scanner even = new Scanner(System.in);
        int sum = 0, number;
        System.out.print("Input: ");
        number = even.nextInt();
        // check the val if it 2 digits or less
        if (number < 100) {
            System.out.println("The number has two digits or less, no sum calculated.");
        } 
        else {
            // calculate the sum of even digits
            while (number > 0) {
                int digit = number % 10; // get the last digit
                if (digit % 2 == 0) { // check if the digit is even
                    sum += digit;
                }
                number /= 10; // remove the last digit
            }
            System.out.println("Sum of even digits: " + sum);
        }
    }
}