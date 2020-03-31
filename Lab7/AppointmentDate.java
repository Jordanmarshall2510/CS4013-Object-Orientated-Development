import java.util.StringTokenizer;

/**
   An appointment date.
*/
public class AppointmentDate
{  
   private int year;
   private int month;
   private int day;

   /*
   Add additional code here
   */

   public AppointmentDate(){

   }

   public AppointmentDate(String line){
	   	StringTokenizer st = new StringTokenizer(line);
	    day = Integer.parseInt(st.nextToken("/"));
	    month = Integer.parseInt(st.nextToken("/"));
	    year = Integer.parseInt(st.nextToken());
   }

   public void setYear(int year){
   		this.year = year;
   }

   public void setMonth(int month){
   		this.month = month;
   }

   public void setDay(int day){
   		this.day = day;
   }

   public int getYear(){
   		return year;
   }

   public int getMonth(){
   		return month;
   }

   public int getDay(){
   		return day;
   }

   public boolean equals (AppointmentDate date){
   		if(this.year == date.getYear()&& this.month == date.getMonth()&& this.day == date.getDay()){
   			return true;
   		}
   		return false;
   }

   @Override
   public String toString()
   {
   	return day + "/" + month + "/" + year;
   }
}