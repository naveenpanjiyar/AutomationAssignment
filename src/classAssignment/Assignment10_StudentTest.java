package classAssignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment10_StudentTest {

	public static void main(String[] args) {
		Assignment10_StudentGrades studentGrades = new Assignment10_StudentGrades();

		// Adding some initial students
				studentGrades.addNewStudentGrades("John", 85);
				studentGrades.addNewStudentGrades("Alice", 92);
				studentGrades.addNewStudentGrades("Bob", 78);

				// Removing student
				studentGrades.removeGrades("Alice");
				
				// View student record
				studentGrades.viewGrades("Alice");
				studentGrades.viewGrades("John");
				
				// Display all student records
				studentGrades.studentGrades();
	}

}
