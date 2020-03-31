public class ex5_9{
	public static void main(String[] args) {

		System.out.println("Feet\t Meters");
		System.out.println("-------------");

		for(int i = 1; i< 11; i++){
			System.out.println(i + "\t"+ footToMeter(i));
		}

		System.out.println();

		System.out.println("Meters\t Feet");
		System.out.println("-------------");

		for (int j = 20; j<66; j+=5){
				System.out.println(j+ "\t" + meterToFoot(j));
			}
		
	}

	public static double meterToFoot(double meter){
		double foot = meter * 3.279;
		return foot;
	}

	public static double footToMeter(double foot){
		double meter = foot * 0.305;
		return meter;
	}
}