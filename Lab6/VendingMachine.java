import java.util.ArrayList;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      this.products = new ArrayList<Product>();
      this.coins = new CoinSet();
      this.currentCoins = new CoinSet();
   }
   
   /**
    * 
    * @return the list of products 
    */
   public ArrayList<Product> getProducts() {
        return products;
   }
   
   public Product[] getProductTypes(){
      ArrayList<Product> uniqueProducts  = new ArrayList<>();
      Product[] p =  new Product[10];
      if(products.size() != 0){
        uniqueProducts.add(products.get(0));
        for(int i = 1; i < products.size(); i++){
                 boolean added = false;
                 if(uniqueProducts.contains(products.get(i))){
                     added = true;
                 }
                 if(!added){
                     uniqueProducts.add(products.get(i));
                }
        }                  
      }
      return uniqueProducts.toArray(p);     
   }
   
   public void addProduct(Product product, int quantity){
      for(int i = 0; i < quantity; i++) {
          products.add(product);
      }   
   }
   
   public void buyProduct(Product aProduct){
       products.remove(aProduct);
   }
   
   public void addCoin(Coin aCoin){
       currentCoins.addCoin(aCoin);
   }
   
   public double removeMoney(){
       double removedValue = this.currentCoins.getValues();
       
       this.currentCoins.emptyCoins();  
       
       return removedValue;
   } 
}