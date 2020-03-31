import java.util.ArrayList;

/**
   A set of coins.
*/
public class CoinSet
{  

   
   private ArrayList<Coin> set;

   /**
      Constructs a CoinSet object.
   */
   public CoinSet(){  
      this.set = new ArrayList<Coin>();
   }
   
    public ArrayList<Coin> getSet() {
        return set;
    }

    public void setSet(ArrayList<Coin> set) {
        this.set = set;
    }
    
    public void emptyCoins(){        
       set.removeAll(set);             
    }
    
    public void addCoin(Coin aCoin){
        set.add(aCoin);
    }
   
    public double getValues(){
        double values = 0;
        for(int i = 0; i < set.size(); i++){
            values += set.get(i).getValue();
        }
        return values;
    }
}