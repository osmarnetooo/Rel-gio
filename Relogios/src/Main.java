
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {
    public static void main(String[] args) throws Exception {
         Clock brlclock = new BRLClock();
         brlclock.setSecond(00);
         brlclock.setMinute(00);
         brlclock.setHour(25);

         System.out.println(brlclock.getTime());
         System.out.println(new USClock().convert(brlclock).getTime());
    }
}
