import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld { 
   public static void main(String[] args) { 
      Calendar now = Calendar.getInstance();
      System.out.println(now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
   }
}