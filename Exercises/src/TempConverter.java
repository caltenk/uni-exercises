import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConverter {
	public static void main(String[] args) {
		boolean i = true;
		while(i)
		{
			DecimalFormat df = new DecimalFormat("#.##");
			Scanner reader = new Scanner(System.in);
			System.out.println("Please enter 'C' if you want to convert C-->F or 'F' for the opposite: ");
			System.out.println("Enter 'Q' to close the program");
			String userChoice = reader.nextLine();
			boolean menu = true;
		
			while(menu)
			{
				if (userChoice.equals("C")) {
					Scanner reader2 = new Scanner(System.in);
					System.out.println("Please enter temperature in Celsius: ");
					double inputC = reader.nextDouble();
					double convertedF = ((inputC * 9/5) + 32);
					System.out.println(inputC + " degrees in Celsius is " + df.format(convertedF) + " degrees in Farenheit");
					menu = false;
				}
				if (userChoice.equals("F")) {
					Scanner reader3 = new Scanner(System.in);
					System.out.println("Please enter temperature in Farenheit: ");
					double inputF = reader.nextDouble();
					double convertedC = ((inputF - 32) * 5/9);
					System.out.println(inputF + " degrees in Farenheit is " + df.format(convertedC) + " degrees in Celsius");
					menu = false;
				}
				if (userChoice.equals("Q")) {
					System.exit(0);
				}
				//else {
					//System.out.println("Please enter a valid input and try again");
					//menu = false;
				//}
			}
		}
	}
}