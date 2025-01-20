package classAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment8_HikePercentagevalue {

	public static void main(String[] args) {

		Double[] empDetails1 = { 75000.00, 5.0, 4.2 };
		Double[] empDetails2 = { 68000.00, 3.0, 3.8 };
		Double[] empDetails3 = { 82000.00, 7.0, 4.5 };
		Double[] empDetails4 = { 90000.00, 10.0, 2.0 };
		Double[] empDetails5 = { 60000.00, 2.0, 3.5 };

		Map<String, Double[]> empData = new HashMap<String, Double[]>();
		empData.put("Alice Johnson", empDetails1);
		empData.put("Bob Smith", empDetails2);
		empData.put("Carol Davis", empDetails3);
		empData.put("David Brown", empDetails4);
		empData.put("Eva Green", empDetails5);

		int highBonus = 1500;
		int mediumBonus = 1200;
		int lowBonus = 300;

		double HighVP = 0.15;
		double MediumVP = 0.10;
		double LowVP = 0.03;

		int reward = 5000;
		Set<String> employeedetail = empData.keySet();
		//System.out.println("employeedetail " + employeedetail);
		Map<String, Double> HikePercentagevalue = new HashMap<String, Double>();

		for (String empName : employeedetail) {
			System.out.println("  " + empData.get(empName)[2]);
			double hike = 0;
			double hikePercentage = 0;
			if (empData.get(empName)[2] >= 4) {
				hike = (empData.get(empName)[0] * HighVP) + highBonus;
				System.out.println("Hike " + hike);
			}

			else if (empData.get(empName)[2] >= 3 && empData.get(empName)[2] < 4) {
				hike = (empData.get(empName)[0] * MediumVP) + mediumBonus;
				System.out.println("Hike " + hike);
			} else if (empData.get(empName)[2] < 3) {
				hike = (empData.get(empName)[0] * LowVP) + lowBonus;
				System.out.println("Hike " + hike);
			}
			if (empData.get(empName)[1] >= 5) {
				hike = hike + reward;
			}
			hikePercentage = hike / empData.get(empName)[0];
			//System.out.println("hikePercentage "+hikePercentage);
			
			HikePercentagevalue.put(empName, hikePercentage*100);
		}
		System.out.println("\n"+HikePercentagevalue);
	}

}
