package time;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(4, 34, 32);
        System.out.println(t1.getHour());

        System.out.println(t1.getMinute());
        System.out.println(t1.getSecond());
    }

}
