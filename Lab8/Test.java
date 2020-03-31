public class Test {
	public static void main (Sting args []){
		GeometricObject test = new GeometricObject();

		Circle c1 = new Circle (5);
		Rectangle r1 = new Rectangle(10 , 5);
		Square s1 = new Square(5);
		Circle c2 = new Circle (7.5);
		Rectangle r2 = new Rectangle(2 , 9);

		GeometricObject [] array = {c1, r1, s1, c2, r2};
	}
}