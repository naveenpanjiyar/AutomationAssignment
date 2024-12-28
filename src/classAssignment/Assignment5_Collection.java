package classAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_Collection {

	public static void main(String[] args) {

		// Create a list of the top 5 most populated countries in the world and print
		// 2nd Country.

		List<String> populatedCountriesList = new ArrayList<String>();
		populatedCountriesList.add("INDIA");
		populatedCountriesList.add("PAKISTAN");
		populatedCountriesList.add("BANGLADESH");
		populatedCountriesList.add("SRILANKA");
		populatedCountriesList.add("NEPAL");

		System.out.println("Second Country: " + populatedCountriesList.get(1));

		// 2. Create a set of the top 10 most visited tourist attractions in the world
		// and print out its size.

		Set<String> touristLocation = new HashSet<String>();
		touristLocation.add("India1");
		touristLocation.add("India2");
		touristLocation.add("India3");
		touristLocation.add("India4");
		touristLocation.add("India5");
		touristLocation.add("India6");
		touristLocation.add("India7");
		touristLocation.add("India8");
		touristLocation.add("India9");
		touristLocation.add("India10");
		System.out.println("\nSize of visited tourist in the world : " + touristLocation.size());

		// 3. Create a map of the 5 largest cities in the United States and their
		// populations.

		Map<String, String> largeCityList = new HashMap<String, String>();
		largeCityList.put("INDIA", "50,000000");
		largeCityList.put("PAKISTAN", "40,000000");
		largeCityList.put("BANGLADESH", "30,000000");
		largeCityList.put("SRILANKA", "20,000000");
		largeCityList.put("NEPAL", "10,000000");

		System.out.println("\nSecond Largest city: " + largeCityList.get("PAKISTAN"));

		// 4. Create an array of 10 random integers and print out the sum of 3rd and 5th
		// Value.

		int[] arrlist = new int[10];
		arrlist[0] = 10;
		arrlist[1] = 20;
		arrlist[2] = 10;
		arrlist[3] = 30;
		arrlist[4] = 40;
		arrlist[5] = 50;
		arrlist[6] = 60;
		arrlist[7] = 70;
		arrlist[8] = 80;
		arrlist[9] = 90;

		int thirdValue = arrlist[2];
		int fifthValue = arrlist[4];
		int sum = (thirdValue + fifthValue);
		System.out.println("\nSum of two value : " + sum);

		// 5. Create a list of the top 5 highest-grossing movies of all time and print
		// out the third movie on the list.

		String[] moviesList = new String[5];
		moviesList[0]="DON";
		moviesList[1]="PUSHPA";
		moviesList[2]="KGF";
		moviesList[3]="DON-2";
		moviesList[4]="HERO";
		String movieName = moviesList[2];
		System.out.println("\nThird movie out of top 5: " + movieName);
	}

}
