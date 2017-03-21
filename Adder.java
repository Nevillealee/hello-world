
import java.util.Scanner;

public class Adder 
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("\nType a number: ");
		
        int number1 = Integer.parseInt(reader.nextLine());   // Reads a line of input from the user and assigns it
															//     to the variable called number1
		
		System.out.print("\nType another number: ");		// Reads a line of input from the user and assigns it
															//     to the variable called number2
		
		int number2 = Integer.parseInt(reader.nextLine());
		
		System.out.println("\nSum of your two entries = " + (number2 + number1));
		
        
    }
}
    