import java.util.Scanner;


public class ex4_25 {
	public static void main (String Args[]) {

		int sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String inputString = input.nextLine();
		int number = Integer.parseInt(inputString);


		if(number == 1){

			System.out.println("1");

		}else{
			
			for(int i = 2; i<number+1; i++){
			sum = i + (i -1);

			}

		}

		System.out.println("The Sum of the series is: " + sum);
	}

}
