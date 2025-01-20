package classAssignment;

import java.util.Arrays;

public class Assignment11 {

	public static void main(String[] args) {
		
		int [] arrList = new int[] {10,24,50,30,60,40,90};
		
		 int n = arrList.length;
	        for (int i = 0; i < n - 1; i++) { 
	            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons
	                if (arrList[j] > arrList[j + 1]) { // Swap 
	                    int temp = arrList[j];
	                    arrList[j] = arrList[j + 1];
	                    arrList[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("sorted list "+Arrays.toString(arrList));
	        
	        System.out.println("1st Largest Number :"+arrList[n-1]);
	        System.out.println("2nd Largest Number :"+arrList[n-2]);
	        System.out.println("3rd Largest Number :"+arrList[n-3]);
	}

}
