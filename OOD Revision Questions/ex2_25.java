public class ex2_25{
	public static void main (String Args[]){

		String name = "Smith";
		double hours = 10;
		double payRate = 6.75;
		double fedTax = 0.2;
		double stateTax = 0.09;
		double gross = hours * payRate;
		double net = gross - (gross*fedTax)-(gross*stateTax);


		System.out.println("Emplyee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + gross);
		System.out.println("Net Pay: " + net);

	}
}

