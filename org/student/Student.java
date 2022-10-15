package org.student;
//Child2 of Parent College
import org.department.Department;

public class Student extends Department{
public void studentName() {
	System.out.println("Name of the Student - Tamilarasi Ramasamy");
}
public void studentDept() {
	System.out.println("Department - Information Technology");
}
public void studentId() {
	System.out.println("Student ID - IT0100");
}
public static void main(String[] args) {
	Student s1 = new Student();
	//Inherited all methods of all classes using object
	s1.collegeName();
	s1.collegeCode();
	s1.collegeRank();
	s1.deptName();
	s1.studentName();
	s1.studentDept();
	s1.studentId();
	
}
}
