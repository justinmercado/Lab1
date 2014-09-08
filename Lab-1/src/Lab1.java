// Cory Cutsail
// Justin Mercado
// Lab 1
import java.util.Scanner;

public class Lab1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Constant amount for Social Security
		double SocialSecurity= 2642.00;
		
		System.out.println("Desired monthly income during retirement: ");
		double MonthlyIncome = input.nextDouble();
		
		double NetMonthlyIncome= MonthlyIncome- SocialSecurity;
		
		System.out.println("Number of years expected to be retired: ");
		double YearsRetired = input.nextDouble();
		
		//
		double t = YearsRetired * 12;
		
		System.out.println("Expected annual return (post-retirement) (enter as a whole number): ");
		double r = input.nextDouble();
		
		//Formula: PV= NetMonthlyIncome[(1-(1/(1+r)^t))/r]
		
		// Converts to percentage of Annual Return
		r = r * .01;
		
		// Converts into Monthly
		r= r/12;
		
		// Combine (1+r)^t
		double CompoundInterest = Math.pow((1+r), t);
		
				
		double PV= NetMonthlyIncome * ((1-(1/CompoundInterest))/r);
		
		System.out.println("Expected annual return PRIOR to retirement (enter as a whole number): ");
		double AnnualReturnPrior= input.nextDouble();
		
		System.out.println("Enter length of time remaining as a work (in years): ");
		double RemainWork= input.nextDouble();
		
		//Formula: Save= (AnnualReturnPrior * PV) / ((1+AnnualReturnPrior)^RemainWork) - 1)
		
		// Convert into Monthly of RemainWork
		RemainWork= RemainWork *12;
		
		// Converts to percentage of AnnualReturnPrior
		AnnualReturnPrior= AnnualReturnPrior *.01;
		
		// Converts to Monthly of AnnualReturnPrior
		AnnualReturnPrior= AnnualReturnPrior / 12;
		
		// Combine (1+AnnualReturnPrior)^RemainWork)
		double CompoundR= Math.pow((1+AnnualReturnPrior), RemainWork);
		
		double save= (AnnualReturnPrior * PV) / (CompoundR -1);
		
		System.out.printf("You need to save a total of: $");
		System.out.printf("%.2f",PV);
		System.out.printf("\nYou should save $");
		System.out.printf("%.2f",save);
		System.out.printf(" per month");
		input.close();
		
		
		

		
		
		
		
		
	
		
		
	}
	
}