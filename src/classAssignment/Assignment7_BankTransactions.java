package classAssignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment7_BankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> transactionList = new ArrayList<Integer>();
		transactionList.add(50000);
		transactionList.add(-2000);
		transactionList.add(3000);
		transactionList.add(-15000);
		transactionList.add(-200);
		transactionList.add(-300);
		transactionList.add(4000);
		transactionList.add(-3000);

		int creditcount = 0;
		int debitcount = 0;
		int creditSum = 0;
		int debitSum = 0;
		int SuspiciouscreditCount =0;
		int SuspiciouscreditAmount =0;
		
		int Suspiciousdebitcount=0;
		int SuspiciousdebittAmount =0;
		for (int i : transactionList) {
			if (i > 0) {
				if(i>10000) {
					SuspiciouscreditCount++;
					SuspiciouscreditAmount+=i;
				}
				creditcount++;
				creditSum +=i;
			}
			
			else {
				if(i<-10000) {
					Suspiciousdebitcount++;
					SuspiciousdebittAmount=+i;
				}
				debitcount++;
				debitSum +=i;
			}
		}
		int sum = debitSum+creditSum;
		System.out.println("Total number of credit transactions completed : " + creditcount);
		System.out.println("Total number of debit transactions completed : " + debitcount);
		System.out.println("total amount remaining at the end in Bank Account " + sum);
		System.out.println("SuspiciouscreditCount "+SuspiciouscreditCount);
		System.out.println("SuspiciouscreditCount "+SuspiciouscreditAmount);
		System.out.println("\nSuspiciousdebitcount "+Suspiciousdebitcount);
		System.out.println("SuspiciousdebittAmount "+SuspiciousdebittAmount);
	}
}
