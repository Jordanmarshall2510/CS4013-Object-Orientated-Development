public class Rectangle{

	double height = 1;
	double width = 1;
	
	Rectangle(){
		System.out.println("The height is: " + height);
		System.out.println("The height is: " + width);
		System.out.println("The area of the Rectangle is: " + getArea());
		System.out.println("The perimeter of the Rectangle is: " + getPerimeter());
	}

	Rectangle(double height2, double width2) {
		width = width2;
		height = height2;
		System.out.println("The height is: " + height2);
		System.out.println("The height is: " + width2);
		System.out.println("The area of the Rectangle is: " + getArea());
		System.out.println("The perimeter of the Rectangle is: " + getPerimeter());
	}

	public double getArea(){
		double area = height * width;
		return area;
	}

	public double getPerimeter(){
		double perimeter = (height * 2) + (width * 2);
		return perimeter;
	}
}