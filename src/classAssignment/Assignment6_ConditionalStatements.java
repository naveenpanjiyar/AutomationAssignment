package classAssignment;

public class Assignment6_ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		if(creditScore>750) {
			System.out.println("Loan Approved automatically");
		}
		else if(creditScore>650 && creditScore<750) {
			if(income>=50000) {
				if(isEmployed==true) {
					if(debtToIncomeRatio<40.0) {
						System.out.println("Loan approved");
					}
					else {
						System.out.println("Loan denied due to debtToIncomeRatio is below 40%");
						}}
				else {
				        System.out.println("Loan denied due to unemployed");
				}
				}
			
			else {
				System.out.println("Loan is not approved due income is below 50,000");
				}
	    }
		else if(creditScore<650){
			System.out.println("Loan denied due to credScore below 650");
		}
}
}
