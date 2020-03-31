public class ex2_13{
	public static void main (String Args[]){

		double bal = 100;
		double intRate = 1.00417;
		double monthBal = 100;

		for(int i = 0; i<7; i++){
			bal = (monthBal + bal) * intRate;
		}

		System.out.println("After the sixth month, the account value is "+ bal);
	}
}

