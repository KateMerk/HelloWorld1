public class HelloWorld1 {
    public static void main(String[]args)
    {
        int s = 3700;
        int sec;
        int m;
        int min;
        int h;
        sec = s%60;
        m= (s-sec)/60;
        min=m%60;
        h=(m-min)/60;
        System.out.println(h+"часов"+min+"минут"+sec+"секунд");
        int hours= 1176;
        int day;
        int week;
        day= 1176/24;
        week= day/7;
        System.out.println(day+"дней"+week+"недель");



    }
}
