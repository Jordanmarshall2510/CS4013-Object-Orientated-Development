import java.util.*;

public class ex4_16{
	public static void main (String args []){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String inputString = input.nextLine();
		int number = Integer.parseInt(inputString);

		for(int i = 2; i<20; i++){
			if((number % i == 0)&&(i == 2|| i==3|| i==5|| i ==7 || i==11)){
				System.out.print(i+"\t");
			}
		}

	}
}