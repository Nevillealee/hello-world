
import java.util.Scanner;

public class AgeCheck
{
    public static void main(String[] args) {
		
        Scanner reader = new Scanner(System.in);

        System.out.print("\nHow old are you? ");
		
		int userAge = Integer.parseInt(reader.nextLine());
		
		if ( userAge > 0 && userAge < 100 ) {
			
			System.out.println("OK");
			
		} else { 
			System.out.println("Impossible!");
			}
		
		
		
	
        
    }
}  