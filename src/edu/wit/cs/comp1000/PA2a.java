package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		
		// TODO: write your code here
		        Scanner input = new Scanner(System.in);
		        
		        System.out.print("Enter five whole numbers: ");
		        int num1 = input.nextInt();
		        int num2 = input.nextInt();
		        int num3 = input.nextInt();
		        int num4 = input.nextInt();
		        int num5 = input.nextInt();
		        
		        
		        int sumPositive = 0;
		        int sumNonPositive = 0;
		        int sumAll = num1 + num2 + num3 + num4 + num5;
		        
		        int countPositive = 0;
		        int countNonPositive = 0;

		       
		        if (num1 > 0) {
		            sumPositive += num1;
		            countPositive++;
		        } else {
		            sumNonPositive += num1;
		            countNonPositive++;
		        }

		        if (num2 > 0) {
		            sumPositive += num2;
		            countPositive++;
		        } else {
		            sumNonPositive += num2;
		            countNonPositive++;
		        }

		        if (num3 > 0) {
		            sumPositive += num3;
		            countPositive++;
		        } else {
		            sumNonPositive += num3;
		            countNonPositive++;
		        }

		        if (num4 > 0) {
		            sumPositive += num4;
		            countPositive++;
		        } else {
		            sumNonPositive += num4;
		            countNonPositive++;
		        }

		        if (num5 > 0) {
		            sumPositive += num5;
		            countPositive++;
		        } else {
		            sumNonPositive += num5;
		            countNonPositive++;
		        }

		        
		        double averagePositive = countPositive > 0 ? (double) sumPositive / countPositive : 0.0;
		        double averageNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0.0;
		        double averageAll = (double) sumAll / 5;

		        System.out.println("The sum of the " + countPositive + " positive numbers: " + sumPositive);
		        System.out.println("The sum of the " + countNonPositive + " non-positive numbers: " + sumNonPositive);
		        System.out.println("The sum of the 5 numbers: " + sumAll);
		        System.out.printf("The average of the %d positive numbers: %.2f%n", countPositive, averagePositive);
		        System.out.printf("The average of the %d non-positive numbers: %.2f%n", countNonPositive, averageNonPositive);
		        System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);
		        
		}
}




