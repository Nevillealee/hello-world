
import java.util.Scanner;

public class ComputeTax
{
    public static void main(String[] args) {
		//Create scanner
        Scanner input = new Scanner(System.in);
		
		// prompt user to enter filing status
		System.out.print(
		"(0-single filer, 1-married jointly,\n" + 
		"2-married seperately, 3-head of household)\n" +
		"Enter the filing status: ");
		int status = input.nextInt();
		
		// prompt user to enter taxabke income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		// Compute Tax
		
		
		
	}
	
}