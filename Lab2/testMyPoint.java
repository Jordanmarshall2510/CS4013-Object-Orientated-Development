

public class testMyPoint{
	public static void main (String [] args){

		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(2,2);
		MyPoint point3 = new MyPoint(3,7);

		System.out.println(point1.distance(point2));
		System.out.println(point2.distance(point3));
		System.out.println(point3.distance(point1));

		System.out.println(point2.distance(7,3));
		System.out.println(point3.distance(0,0));
		System.out.println(point1.distance(1,6));
	}
}