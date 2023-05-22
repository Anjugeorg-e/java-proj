package Java_Proj;

public class Dogs extends Animals {
    public void eat()
    {
        // super.eat();  //to access the parent class method
        //super keyword is used to call constructor of the superclass from the constructor of the subclass.
               System.out.println("i can eat dog food");  //child class obj will betaken if same method mentioned
    }
}
