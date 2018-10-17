import java.util.Scanner;
import java.util.Arrays;
public class ChessBoard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		String[] columns = {"A","B","C","D","E","F","G","H"};
		
		
		System.out.println("Enter the row(number)");
		int userRow = input.nextInt();
		System.out.println("Enter the column(letter)");
		
		String userCol = input2.nextLine();
		int userColNum = (Arrays.asList(columns).indexOf(userCol)) + 1;
		
		Boolean lightTile = (userRow % 2) != (userColNum % 2);
		
		
		if (lightTile) {
			System.out.println("This tile is light");
		}
		else {
			System.out.println("This tile is dark");
		}
	}

}
