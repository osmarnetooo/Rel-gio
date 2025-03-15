public class Main {

    public static void main(String[] args) throws Exception {
        Clock brlclock = new BRLClock();
        brlclock.setSecond(30);
        brlclock.setMinute(10);
        brlclock.setHour(16);

        System.out.println(brlclock.getTime());
        System.out.println(new USClock().convert(brlclock).getTime());

        
    }
}
