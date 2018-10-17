
public class Ex6 {

	public static void main(String[] args) {
		double sum = 0;
		int x = 30;
		for (int i = 1; i<=x; i++) {
			double div = (((double)i)/((x+1)-i));
			sum += div;
			System.out.println(sum);
		}
		
	}

}
