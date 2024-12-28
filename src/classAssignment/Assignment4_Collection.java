package classAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment4_Collection {

	public static void main(String[] args) {

		// Store the students1 details into Map.

		Map<String, String> StudentDetails1 = new HashMap<String, String>();
		Map<String, String> StudentDetails2 = new HashMap<String, String>();
		Map<String, String> StudentDetails3 = new HashMap<String, String>();

		StudentDetails1.put("Name", "John Doe");
		StudentDetails1.put("Age", "20");
		StudentDetails1.put("Gender", "Male");
		StudentDetails1.put("Roll Number", "S12345");
		StudentDetails1.put("Grade", "A");
		StudentDetails1.put("Major", "Computer Science");
		StudentDetails1.put("GPA", "3.8");
		StudentDetails1.put("Email", "john@example.com");
		StudentDetails1.put("Contact Number", "9999997777");
		StudentDetails1.put("Address", "333 delhi");

		System.out.println("Student1 :" + StudentDetails1);

		// Store the students2 details into Map.

		StudentDetails2.put("Name", "Jane Smith");
		StudentDetails2.put("Age", "21");
		StudentDetails2.put("Gender", "Female");
		StudentDetails2.put("Roll Number", "S12346");
		StudentDetails2.put("Grade", "B");
		StudentDetails2.put("Major", "Mathematics");
		StudentDetails2.put("GPA", "3.5");
		StudentDetails2.put("Email", "jane@example.com");
		StudentDetails2.put("Contact Number", "9999997776");
		StudentDetails2.put("Address", "222 delhi");

		System.out.println("Student2 :" + StudentDetails2);

		// Store the students3 details into Map.

		StudentDetails3.put("Name", "Mike Brown");
		StudentDetails3.put("Age", "22");
		StudentDetails3.put("Gender", "Male");
		StudentDetails3.put("Roll Number", "S12347");
		StudentDetails3.put("Grade", "A");
		StudentDetails3.put("Major", "Physics");
		StudentDetails3.put("GPA", "3.9");
		StudentDetails3.put("Email", "mike@example.com");
		StudentDetails3.put("Contact Number", "9999997775");
		StudentDetails3.put("Address", "111 delhi");

		System.out.println("Student3 :" + StudentDetails3);

		// Store the all students values into single list.

		List<Map<String, String>> allStudentlist = new ArrayList<Map<String, String>>();
		allStudentlist.add(StudentDetails1);
		allStudentlist.add(StudentDetails2);
		allStudentlist.add(StudentDetails3);
		/* Print all Students data */
		System.out.println("All Students details: " + allStudentlist);

		Map<String, String> EmployeeDetails1 = new HashMap<>();
		Map<String, String> EmployeeDetails2 = new HashMap<>();
		Map<String, String> EmployeeDetails3 = new HashMap<>();

		// Store the Employee1 details into Map.
		EmployeeDetails1.put("Employee ID", "E001");
		EmployeeDetails1.put("Name", "Alice Green");
		EmployeeDetails1.put("Age", "30");
		EmployeeDetails1.put("Gender", "Female");
		EmployeeDetails1.put("Department", "Engineering");
		EmployeeDetails1.put("Position", "Software Engineer");
		EmployeeDetails1.put("Salary", "75000");
		EmployeeDetails1.put("Email", "alice@example.com");
		EmployeeDetails1.put("Contact Number", "123456789");

		// Store the Employee2 details into Map.

		EmployeeDetails2.put("Employee ID", "E002");
		EmployeeDetails2.put("Name", "Bob jonshon");
		EmployeeDetails2.put("Age", "35");
		EmployeeDetails2.put("Gender", "Male");
		EmployeeDetails2.put("Department", "Marketing");
		EmployeeDetails2.put("Position", "Marketing Manager");
		EmployeeDetails2.put("Salary", "85000");
		EmployeeDetails2.put("Email", "bob@example.com");
		EmployeeDetails2.put("Contact Number", "123456788");

		// Store the Employee3 details into Map.

		EmployeeDetails3.put("Employee ID", "E003");
		EmployeeDetails3.put("Name", "Carol White");
		EmployeeDetails3.put("Age", "40");
		EmployeeDetails3.put("Gender", "Female");
		EmployeeDetails3.put("Department", "Sales");
		EmployeeDetails3.put("Position", "Sales Executive");
		EmployeeDetails3.put("Salary", "65000");
		EmployeeDetails3.put("Email", "carol@example.com");
		EmployeeDetails3.put("Contact Number", "123456787");

		List<Map<String, String>> allEmployeelist = new ArrayList<Map<String, String>>();

		allEmployeelist.add(EmployeeDetails1);
		allEmployeelist.add(EmployeeDetails2);
		allEmployeelist.add(EmployeeDetails3);

		Map<String, String> ProductDetails1 = new HashMap<>();
		Map<String, String> ProductDetails2 = new HashMap<>();
		Map<String, String> ProductDetails3 = new HashMap<>();

		// Store the Product1 details into Map.
		ProductDetails1.put("Product ID", "P001");
		ProductDetails1.put("Name", "Laptop");
		ProductDetails1.put("Category", "Electronics");
		ProductDetails1.put("Price", "$1200");
		ProductDetails1.put("Stock Qty", "50");
		ProductDetails1.put("Supplier", "Tech Supplies");
		ProductDetails1.put("Warranty", "2 year");
		ProductDetails1.put("Rating", "4.5");
		ProductDetails1.put("Manufacturing Date", "15-01-2023");
		ProductDetails1.put("Expiry Date", "15-01-2025");

		// Store the Product2 details into Map.

		ProductDetails2.put("Product ID", "P002");
		ProductDetails2.put("Name", "Desk Chair");
		ProductDetails2.put("Category", "Furniture");
		ProductDetails2.put("Price", "$150");
		ProductDetails2.put("Stock Qty", "200");
		ProductDetails2.put("Supplier", "Office Depot");
		ProductDetails2.put("Warranty", "1 year");
		ProductDetails2.put("Rating", "4");
		ProductDetails2.put("Manufacturing Date", "10-02-2023");
		ProductDetails2.put("Expiry Date", "10-02-2025");

		// Store the Product3 details into Map.

		ProductDetails3.put("Product ID", "P003");
		ProductDetails3.put("Name", "Coffee Maker");
		ProductDetails3.put("Category", "Kitchen");
		ProductDetails3.put("Price", "$75");
		ProductDetails3.put("Stock Qty", "100");
		ProductDetails3.put("Supplier", "Kitchen World");
		ProductDetails3.put("Warranty", "6 months");
		ProductDetails3.put("Rating", "4.2");
		ProductDetails3.put("Manufacturing Date", "20-03-2023");
		ProductDetails3.put("Expiry Date", "20-03-2025");

		List<Map<String, String>> allProductlist = new ArrayList<Map<String, String>>();

		allProductlist.add(ProductDetails1);
		allProductlist.add(ProductDetails2);
		allProductlist.add(ProductDetails3);

		Map<String, List<Map<String, String>>> allData = new HashMap<String, List<Map<String, String>>>();
		allData.put("StudentRecords", allStudentlist);
		allData.put("EmployeeRecords", allEmployeelist);
		allData.put("ProductRecords", allProductlist);
		
              /*********Expected Result************/
		
		System.out.println("\nDisplaying product details of Supplier Name : "
				+ allData.get("ProductRecords").get(1).get("Supplier"));
		
		System.out.println("\nDisplaying Student details Name : "
				+ allData.get("StudentRecords").get(1).get("Name"));
	}

}
