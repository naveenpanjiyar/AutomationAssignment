package classAssignment;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {

		String[] Employee_Names = new String[3];
		int[] EmployeeID = new int[3];

		Assignment3_Employee obj = new Assignment3_Employee();

		Employee_Names[0] = obj.EmpName;
		Employee_Names[1] = obj.EmpName1;
		Employee_Names[2] = obj.EmpName2;

		EmployeeID[0] = obj.EmpId;
		EmployeeID[1] = obj.EmpId1;
		EmployeeID[2] = obj.EmpId2;

		System.out.println("Employee Name : " + Employee_Names[0] + ",Employee ID: " + EmployeeID[0]);
		System.out.println("Employee Name : " + Employee_Names[1] + ",Employee ID: " + EmployeeID[1]);
		System.out.println("Employee Name : " + Employee_Names[2] + ",Employee ID: " + EmployeeID[2]);

	}

}
