package myexercise3;


import java.util.*;
import java.text.*;

public class DayDateCalulator {

    public String[] getFirstLastDay(){
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EE dd/MM/yyyy");
       String[] date=new String[2];
               date[0]=df.format(c.getTime());
//    for (int i = 0; i <6; i++)
        {
            c.add(Calendar.DATE, 6);
        }
        date[1]=df.format(c.getTime());
        return date;
    }
}


