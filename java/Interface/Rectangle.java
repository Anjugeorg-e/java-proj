package Interface;

 class Rectangle implements Polygon {  // a class can implement multiple interfaces          c implements a,b
    public void getArea(int length, int breadth){
        System.out.println("area of rectangle is: " + (length * breadth));
    }
}
