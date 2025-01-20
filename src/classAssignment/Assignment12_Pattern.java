package classAssignment;

public class Assignment12_Pattern {

	public static void main(String[] args) {
		/*       
	1	 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 

		 */
		
		int n = 5;
		for (int i = 1; i <=n; i++) {
			//printing the space firstly
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			//print the value
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//reverse time
		for (int i = n-1; i >=1; i--) {
			//printing the space firstly
			for (int j =n; j > i; j--) {
				System.out.print(" ");
			}
			//print the value
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		/*
		 *     1
		 *    12
		 *   123
		 *  1234
		 * 12345   
		 */
		System.out.println("\n");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("\n");
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=5;i<=1;i--) {
			for(int j=1;j<=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n");
		/*
		 
    *
   **
  ***
 ****
*****   	
		
		 */
		int p=5;
		for(int i=0;i<p;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
