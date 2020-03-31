import java.util.ArrayList;
import java.util.StringTokenizer;

/**
   An appointment calendar.
*/
public class AppointmentCalendar
{  
   private ArrayList<Appointment> appointments;

   /*
      Add additional code here.
   */

    public AppointmentCalendar(){
    	appointments = new ArrayList <>();
    }

    public void add(Appointment newAppointment){
    	appointments.add(newAppointment);
    }

    public void cancel(Appointment newAppointment){
    	appointments.remove(newAppointment);
    }

    public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate day){
    	ArrayList<Appointment> equalAppointments = new ArrayList<>();
    	for(Appointment appoint:appointments){
    		if(appoint.getDate().equals(day)){
    			equalAppointments.add(appoint);
    		}
    	}
    	return equalAppointments;
    }
}
