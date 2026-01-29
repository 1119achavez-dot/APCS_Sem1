/*
 *	Author: Abigail Chavez 
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee(9622,"michael","scott",6583.33);
		michael.employeeToString();
		michael.raiseSalary(90);
		double x = michael.getAnnualSalary();
		System.out.println( "michael's annual salarie:" +x);
		/////////////////////////////////////////////////////////////////////////
		
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Dwight.employeeToString();
		Dwight.raiseSalary(10);
		double y = Dwight.getAnnualSalary();
		System.out.println( "Dwight's annual salarie:" +y);
		/////////////////////////////////////////////////////////////////////////
		
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Jim.employeeToString();
		Jim.raiseSalary(30);
		double z = Jim.getAnnualSalary();
		System.out.println( "Jim's annual salarie:" +z);
		/////////////////////////////////////////////////////////////////////////
		
		Employee Pam = new Employee(2011,"Pam","Beesly",2250);
		Pam.employeeToString();
		Pam.raiseSalary(100);
		double a = Pam.getAnnualSalary();
		System.out.println( "Pam's annual salarie:" +a);
		/////////////////////////////////////////////////////////////////////////
		
		Employee Mars = new Employee(2008,"Mars","Bars",4250);
		Mars.employeeToString();
		Mars.raiseSalary(10);
		double aa = Mars.getAnnualSalary();
		System.out.println( "Mars's annual salarie:" +aa);
		/////////////////////////////////////////////////////////////////////////
	}
	
}
