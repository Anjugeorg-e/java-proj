package rectangle;

import javax.print.DocFlavor.READER;

public class Main {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
       System.out.println(r1.getLength());
       System.out.println(r1.getWidth());

       System.out.println(r1.getArea());
       System.out.println(r1.getPerimeter());
    }
    
}
