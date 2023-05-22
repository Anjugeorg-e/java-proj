package Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        res.addRating(3.4);
        res.addRating(4.6);
        res.addRating(2.8);

        System.out.println(res.rating);
        System.out.println(res.averageRating());
    }
}
