import java.util.StringTokenizer;

/**
   An appointment time.
*/
public class AppointmentTime
{ 
   private int hours;
   private int minutes;

   /*
     Add additional code here 
       */

   public AppointmentTime(){

   }

   public AppointmentTime(String line){
      StringTokenizer st = new StringTokenizer(line);
       hours = Integer.parseInt(st.nextToken(":"));
       minutes = Integer.parseInt(st.nextToken());
   }

   public void setHours(int hours){
   		this.hours = hours;
   }

   public void setMinutes(int minutes){
   		this.minutes = minutes;
   }

   public int getHours(){
   		return hours;
   }

   public int getMinutes(){
   		return minutes;
   }

   @Override
   public String toString()
   {
      if(minutes<10){
               return hours + ":0" + minutes;
      }
      return hours + ":" + minutes;
   }
}

//'doctors ap' 11/11/19 13:00 14:00