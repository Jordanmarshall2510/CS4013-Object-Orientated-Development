import java.util.StringTokenizer;

/**
   An appointment.
*/
public class Appointment
{ 
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

   /*
      Add additional code here
   */

      public Appointment(){

      }

      public Appointment(String line){
      	StringTokenizer st = new StringTokenizer(line);
      	description= st.nextToken();
       day =new AppointmentDate(st.nextToken());
        from= new AppointmentTime(st.nextToken());
       to = new AppointmentTime(st.nextToken());
      }

  	public AppointmentDate getDate(){
  		return day;
  	}
   
	public String format(){
	    return description + " " + day + " " + from + " " + to;
	}
}
