public class Armstrong {
	public static void main(String[] args) {
		for (int i = 100; i<1000; i++) {
			int num = i;
			int sum = 0;
			int d = 0;
			while (num > 0) {
				d = num % 10;
				sum = (int) (sum + Math.pow(d, 3));
				num = num /10;
			}
			if (i == sum) {
				System.out.format("%d is an armstrong number \n", i);
			}	
		}
	}
}