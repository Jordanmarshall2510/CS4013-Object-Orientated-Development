

public class MyPoint{
	
	private double x = 0;
	private double y = 0;	

	public MyPoint(){

	}

	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public double distance(MyPoint myPoint){
		double dist = Math.sqrt((Math.pow(myPoint.getX() - x,2))+(Math.pow(myPoint.getY() - y,2)));
		return dist;
	} 

	public double distance(double xCord, double yCord){
		double dist = Math.sqrt((Math.pow(xCord - x, 2))+(Math.pow(yCord - y, 2)));
		return dist;
	} 

}
