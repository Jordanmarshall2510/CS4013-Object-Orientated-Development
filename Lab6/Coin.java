/**
   A coin with a monetary value.
*/
public class Coin
{
   private double value;  
   private String name;

   /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName){ 
      this.value = aValue; 
      this.name = aName;
      toString();
   }
   
   public double getValue(){
        return value;
   }

   public String getName(){
      return name;
   }

   public String toString(){
      return name + " \t " + value;
   }
}