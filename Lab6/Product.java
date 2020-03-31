/**
   A product in a vending machine.
*/
public class Product
{  
   private String description;
   private double price;

   /**
      Constructs a Product object
      @param aDescription the description of the product
      @param aPrice the price of the product
   */
   public Product(String aDescription, double aPrice){  
      this.description = aDescription;
      this.price = aPrice;
      toString();
   }

   public double getPrice() {
       return price;
   }

   public void setPrice(double price) {
        this.price = price;
   }
   
   public boolean isEqual(Product p){
       if(this.price == p.price){
           if(this.description == p.description){
               return true;
           }
       }
       return false;
   }

   public String getDescription() {
       return description;
   }

   public void setDescription(String description) {
       this.description = description;
   }

    public String toString(){
      return "Description: " + description +" \t " + "Price: "+ price;
   }
   
}
