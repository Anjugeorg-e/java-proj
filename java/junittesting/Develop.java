package junittesting;


class Computer{
    public void code(){

    }
}

// class Laptop{
//     public void code(){
//         System.out.println("code, combile, run");
//     }
// }

// class Desktop{
//     public void code()
//     {
//         System.out.println("code, compile, run: faster");
//     }
// }

class Laptop extends Computer{
    public void code(){
        System.out.println("code, combile, run");
    }
}

class Desktop extends Computer{
    public void code()
    {
        System.out.println("code, compile, run: faster");
    }
}

class Developer {
    // public void devApp(Laptop lap){
        public void devApp(Computer lap){
        lap.code();
        // System.out.println("coding....");
    }
}
public class Develop{
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();

        Computer lap = new Laptop();
        Computer desk = new Desktop();



        Developer anju = new Developer();
        anju.devApp(lap);
        // anju.devApp(desk); --> also possible  once we extend computer class 
    }
}