import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer A");
		int intA = in.nextInt();
		System.out.println("Enter integer B");
		int intB = in.nextInt();
		//System.out.format("%d %d",intA,intB);
		while(intB != 0) {
			int R = intA % intB;
			intA = intB;
			intB = R;
		}
		System.out.format("The GCD of A and B is %d", intA);
	}

}
