package rowboat;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);
        System.out.println(b2.getLength());
        System.out.println(b1.getLength());
        b1.move();
        b3.move();
        b2.move();
    }




}
