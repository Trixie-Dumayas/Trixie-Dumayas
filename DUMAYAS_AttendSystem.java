import java.util.Scanner;

public class DUMAYAS_AttendSystem {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int number;
        int present = 0;
        int absent = 0;
        String yn;
        
        
        System.out.println("Enter the total number of students: ");
        number = myObj.nextInt();
        myObj.nextLine();
            
        for(int i = 1; i <= number; i++){
            System.out.println("Is student " + i + " present? (Y/N): ");
            yn = myObj.nextLine();
                
            if (yn.equals("Y")){
                present++;
            } else if (yn.equals("N")){
                absent++;
            } else {
                System.out.println("Invalid input, please enter 'Y' or 'N'.");
                i--;
            }
        }
        
        System.out.println("Total present: " + present);
        System.out.println("Total absent: " + absent);
        
        myObj.close();
    }  
}
