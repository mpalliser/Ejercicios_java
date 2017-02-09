package org.foobarspam.Arrays;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		try {
			double[] userValues = scanValues();
			double payment = calculatePayment(userValues);
			DecimalFormat df = new DecimalFormat("0.##");
			System.out.println("Monthly payment: $" + df.format(payment));
		} catch (InputMismatchException ime) {
			System.out.println("You must enter double values. "
					+ "Please restart program.");
			System.exit(0);
		} catch (ArithmeticException ae) {
			System.out.println("Years must be greater than 0. "
					+ "Please restart program.");
			System.exit(0);
		} catch (IndexOutOfBoundsException ioob) {
			System.out.println("Three doubles are required. "
					+ "Please restart program.");
			System.exit(0);
		}
	}
	public static double[] scanValues() throws InputMismatchException {
		double[] values = new double[3];
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the loan amount: ");
			values[0] = scan.nextDouble();
			System.out.print("Enter the interest rate: ");
			values[1] = scan.nextDouble();
			System.out.print("Enter the loan term (in years): ");
			values[2] = scan.nextInt();
		}
		return values;
	}
	public static double calculatePayment(double[] values)
			throws ArithmeticException, IndexOutOfBoundsException {
		double principle = values[0];
		double rate = values[1];
		double years = values[2];
		double interest = principle * rate * years;
		double total = principle + interest;
		return total / years / 12;
	}
}