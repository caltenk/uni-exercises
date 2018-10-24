import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a day:");
		int day = in.nextInt();
		System.out.println("Please enter a month:");
		int month = in.nextInt();
		System.out.println("Please enter a year:");
		int year = in.nextInt();
		in.close();
		boolean leapYear = false;
		
		String connective;
		
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		String monthWord = months[month-1];
		
		
		if (day % 10 == 1 && day!=11){
			connective = "st";
		} else if (day % 10 == 2 && day!=12) {
			connective = "nd";
		} else if (day % 10 == 3 && day!=13){
			connective = "rd";
		} else {
			connective = "th";
		}
		
		if ((year % 4) == 0){
			if ((year % 100) == 0) {
				if ((year % 400) == 0){
					leapYear = true;
				}
			}else{
				leapYear = true;
			}
		}
		
		
		if (day < 1 || day > 31 || month < 1 || month > 12) {
			System.out.println("This date cannot be legal");
		}
		else if ((day > 30) && (month == 4 || month == 6 || month ==9 || month == 11)){
			System.out.println("April, June, September and November only have 30 days");
		}
		else if (month == 2 && day > 28 && leapYear==false) {
			System.out.println("February only has 28 days in this year");
		}
		else{
			System.out.format("%d%s of %s %d",day,connective, monthWord ,year);
		}
		

	}

}
