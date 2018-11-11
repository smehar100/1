import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

   public static void main(String args[]) {
      Enumeration days;
      Vector dayNames = new Vector();
      
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      
      days = dayNames.elements();

      	int a=1;
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
         if(a==1){
             dayNames.add("SaturdayNight");
             a=2;
         }
        
      }
   }
}