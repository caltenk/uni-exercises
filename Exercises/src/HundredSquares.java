public class HundredSquares {

	public static void main(String[] args) {
		double sum = 0;
		for (int i=1; i<=100; i++) {
			double squares = Math.pow(i, 2);
			sum += squares;
			
		}
		System.out.println(sum);
	

	}

}
