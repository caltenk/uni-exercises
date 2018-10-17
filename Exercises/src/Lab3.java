import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
		List<List<String>> csvData = processCsv("P:/eclipse_workspace/Exercises/src/Variables.csv");
		int total = 0;
		for (List<String> sublist : csvData) {
		    total += sublist.size();
		}
		int noOfCars = total/5;
		int carNo = 0;
		for (int i=1; i<=noOfCars; i++){
			carNo = i - 1;
			double carCost = Double.parseDouble(csvData.get(carNo).get(0));
			double serviceCost = Double.parseDouble(csvData.get(carNo).get(1));
			double serviceInterval = Double.parseDouble(csvData.get(carNo).get(2));
			double kmPerLitre = Double.parseDouble(csvData.get(carNo).get(3));
			double fuelCostPerLitre = Double.parseDouble(csvData.get(carNo).get(4));
			for(int j = 2; j < 13; j++){
				int distanceKm = j * 25000;
				double runningCost = carCost + ((distanceKm / kmPerLitre) * fuelCostPerLitre) + ((distanceKm / serviceInterval) * serviceCost);
				System.out.format("Car %d: %dkm: %f \n",(carNo + 1), distanceKm, runningCost);
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
