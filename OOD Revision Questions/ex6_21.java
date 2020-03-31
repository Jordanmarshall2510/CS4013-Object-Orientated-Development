import java.util.*;

public class ex6_21{
	public static void main(String[] args) {

		Scanner inputBalls = new Scanner(System.in);
		System.out.println("Enter No. of Balls: ");
		String stringBalls = inputBalls.nextLine();
		int balls = Integer.parseInt(stringBalls);

		Scanner inputSlots = new Scanner(System.in);
		System.out.println("Enter No. of Slots: ");
		String slotsString = inputSlots.nextLine();
		int slots = Integer.parseInt(slotsString);

		/*int direct = (int)(Math.random()*2);
		if(dirct == 0){
			char charDirection = 'L';
		}else{
			char charDirection = 'R';
		}*/

		char [][] array = new char [balls] [slots];
		for(int i = 0; i <= slots; i++){
            for(int j = 0; j <= slots; j++){
                int direct = (int)(Math.random()*2);
				if(direct == 0){
					array [balls-1] [slots-1] = 'L';
				}else{
					array [balls-1] [slots-1] = 'R';
				}
           	}
        }

        for(int k = 0; k < 3; k++){
            for(int l = 0; l < 3; l++){
                System.out.print(array[k][l] + " ");
            }


		System.out.println();

	}
}
}