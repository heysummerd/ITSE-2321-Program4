package program4;
//********************************************************************
//
//Author:        Summer Davis 
//
//Program #:     Four
//
//File Name:     Program4.java
//
//Course:        ITSE 2321 Object-Oriented Programming
//
//Description:   Program4 calculates & displays an employee's weekly gross pay
//				 - User enters: employee ID #, hourly pay rate,
//				   and number of hours worked for the week
//				 - Overtime hours: any hours over 40 are paid 1.5x regular rate
//				 - Deductions: 12.75% of income (IF > $750), $35 parking charge
//				 - All monetary values formatted to 2 decimal places
//				*** formatting hours as doubles in case of input like: 2.5 hours
//
//
//********************************************************************

import java.util.Scanner;

public class Program4 {
//***************************************************************
//
//Method:       main
//
//Description:  The main method of the program
//
//Parameters:   String array
//
//Returns:      N/A 
//
//**************************************************************
	public static void main(String[] args) {
	   
		// display developer info
		developerInfo();
		
		// create Scanner to obtain input
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int employeeID;
		double hourlyPayRate;
		double weeklyHoursWorked;
		double regularHoursWorked;
		double overtimeHoursWorked;
		double regularPay;
		double overtimePay;
		double grossPay;
		double incomeTaxRate = 0.1275;
		double taxOwed;
		double parkingCharge = 35;
		double deductions;
		double netPay;
		
		// collect employee ID number
		System.out.print("Enter employee ID #: ");
		employeeID = input.nextInt();
		
		// collect employee hourly pay rate
		System.out.print("Enter employee hourly pay rate: $");
		hourlyPayRate = input.nextDouble();
		
		// collect employee hours worked for the week
		System.out.print("How many hours has the employee worked this week? ");
		weeklyHoursWorked = input.nextDouble();
		
		// calculate regular/overtime hours
		if (weeklyHoursWorked > 40) {
			overtimeHoursWorked = weeklyHoursWorked - 40;
			regularHoursWorked = 40;
		}
		else {
			overtimeHoursWorked = 0;
			regularHoursWorked = weeklyHoursWorked;
		}
		
		// calculate regular/overtime pay
		regularPay = regularHoursWorked * hourlyPayRate;
		overtimePay = overtimeHoursWorked * (hourlyPayRate * 1.5);
		
		// calculate gross pay
		grossPay = regularPay + overtimePay;
		
		// calculate tax
		if (grossPay > 750) {
			taxOwed = grossPay * incomeTaxRate;
		}
		else {
			taxOwed = 0;
		}
		
		// calculate deductions
		deductions = taxOwed + parkingCharge;
		
		// calculate net pay
		netPay = grossPay - deductions;
		
		// display employee pay information table
		System.out.printf("%nID Number:         %-15d%n", employeeID);
		System.out.printf("Pay Rate:         $%,-15.2f%n", hourlyPayRate);
		System.out.printf("Regular Hours:     %-15.2f%n", regularHoursWorked);				   
		System.out.printf("Overtime Hours:    %-15.2f%n", overtimeHoursWorked);				   
		System.out.printf("Total Hours:       %-15.2f%n", weeklyHoursWorked);				   
		System.out.printf("Regular Pay:      $%,-15.2f%n", regularPay);				   
		System.out.printf("Overtime Pay:     $%,-15.2f%n", overtimePay);				   
		System.out.printf("Gross Pay:        $%,-15.2f%n", grossPay);				   
		System.out.printf("Tax:              $%,-15.2f%n", taxOwed);				   
		System.out.printf("Deductions:       $%,-15.2f%n", deductions);				   
		System.out.printf("Net Pay:          $%,-15.2f%n", netPay);				   
						

} // End of main method
	
//***************************************************************
//
//Method:       developerInfo
//
//Description:  The developer information method of the program
//
//Parameters:   None
//
//Returns:      N/A 
//
//**************************************************************
public static void developerInfo() {
 System.out.println("Name:    Summer Davis");
 System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
 System.out.println("Program: Four \n");

} // End of developerInfo method
} 
