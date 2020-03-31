import java.util.Scanner;

public class ex5_5{

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		String inputString1 = input1.nextLine();
		int number1 = Integer.parseInt(inputString1);

		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter Number 2: ");
		String inputString2 = input2.nextLine();
		int number2 = Integer.parseInt(inputString2);

		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter Number 3: ");
		String inputString3 = input3.nextLine();
		int number3 = Integer.parseInt(inputString3);

		displayLargestNumber(number1, number2, number3);

	}

	public static void displayLargestNumber(double num1, double num2, double num3){

		if((num1 > num2)&&(num1 >num3)){
			System.out.println("The Largest Number is: " + num1);
		}else if(num2>num3){
			System.out.println("The Largest Number is: " + num2);
		}else{
			System.out.println("The Largest Number is: " + num3);
		}
	}
}