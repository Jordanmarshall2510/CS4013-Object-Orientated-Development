import java.util.*;

public class ex3_17{
	public static void main (String Args[]){

		Scanner input = new Scanner(System.in);
		System.out.println("Rock [0], Paper [1], Scissors [2]");
		String inputString = input.nextLine();
		int intInput = Integer.parseInt(inputString);


		int random = (int) (Math.random()*(4));

		if((intInput == 0)&&(random == 1)){
			System.out.println("Computer Wins");
		}else if((intInput == 0)&&(random == 2)){
			System.out.println("Player Wins");
		}else if((intInput == 1)&&(random == 0)){
			System.out.println("Player Wins");
		}else if((intInput == 1)&&(random == 2)){
			System.out.println("Computer Wins");
		}else if((intInput == 2)&&(random == 0)){
			System.out.println("Computer Wins");
		}else if((intInput == 2)&&(random == 1)){
			System.out.println("Player Wins");
		}else if(intInput == random){
			System.out.println("Draw");
		}
		
	}
}

