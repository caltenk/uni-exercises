import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab3 {

	public static List<List<String>> processCsv(String filePath) throws IOException {
		String line = null;
		BufferedReader stream = null;
		List<List<String>> csvData = new ArrayList<List<String>>();
		
		try {
			stream = new BufferedReader(new FileReader(filePath));
			while((line = stream.readLine()) != null) {
				String[] splits = line.split(",");
				List<String> dataLine = new ArrayList<String>(splits.length);
				for (String data : splits) {
					dataLine.add(data);
				}
				csvData.add(dataLine);
			}
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
		return csvData;
	}
	
	
	public static void main(String args []) throws IOException {
		Scanner in = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("###,###");
		DecimalFormat df2 = new DecimalFormat("£###,###.##");
		List<List<String>> csvData = processCsv("src/Variables.csv");
		int total = 0;
		for (List<String> sublist : csvData) {
		    total += sublist.size();
		}
		String[] rows = {"Distance travelled","Running cost"};
		
		int noOfCars = total/5;
		int carNo = 0;
		System.out.println("Please enter the starting distance for table in km: ");
		int startDistance = in.nextInt();
		System.out.println("Please enter the end distance for table in km: ");
		int endDistance = in.nextInt();
		System.out.println("Please enter the interval for the table in km: ");
		int disInterval = in.nextInt();
		System.out.format("%-15s: %-15s\n",rows);
		for (int i=1; i<=noOfCars; i++){
			carNo = i - 1;
			double carCost = Double.parseDouble(csvData.get(carNo).get(0));
			double serviceCost = Double.parseDouble(csvData.get(carNo).get(1));
			double serviceInterval = Double.parseDouble(csvData.get(carNo).get(2));
			double kmPerLitre = Double.parseDouble(csvData.get(carNo).get(3));
			double fuelCostPerLitre = Double.parseDouble(csvData.get(carNo).get(4));
			System.out.println("Car: " + (carNo + 1));

			for(int j = startDistance; j <= endDistance; j= j+disInterval){
				double distanceKm = j;
				double runningCost = carCost + ((distanceKm / kmPerLitre) * fuelCostPerLitre) + ((distanceKm / serviceInterval) * serviceCost);
				System.out.format(" %skm: %s \n", df1.format(distanceKm), df2.format(runningCost));
			}
		}	
		
	}
			

	/* TODO:
	 * Format decimals/ints in table
	 * Fix table to look nicer
	 * Better way to find noOfCars (lines in csv?)
	 * 
	 */
	

}
