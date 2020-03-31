public class Square implements Colorable extends GeometricObject{
	private double side;

	public Rectangle(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return side*side;
  }

  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return side * 4;
  }

  @Override
  public boolean equals(Object obj){
  	if(this.side == obj.getSide()){
  		return true;
  	}else{
  		return false;
  	}
  }
  
  @Override
  public String toString(){
  	return "Side: "+ side;
  }

  @Override
  public void  howToColor(){
  	System.out.print("Colour all four sides");
  }
}
 