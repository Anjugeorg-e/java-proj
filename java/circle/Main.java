package circle;

public class Main {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.setRadius(5); // hence insrtance variable is private we have to use getter and setter .if it was public we can access directly like circle.radius
                
        System.out.println(c1.getRadius());

       System.out.println(c1.getArea());
       System.out.println(c1.getCircumference());

       
    }


}
