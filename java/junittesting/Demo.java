package junittesting;

//class --> class --->extends
//class -> interface -->implements
//interface - interface --> extends 



//interface is not a class
//by default every method in java is public abstract . so no need for public abstract
//we cannot instantiate an object of a --> obj = new A();  ---->  but A obj; is possible.


interface A{
    // public abstract void Show();
    // public abstract void config();

    void show();
    void config();


    int age = 23;  //variables in interface should be by default static and final
    String area = "Iritty";
}

//to extend an interface use implements keyword
//and we have to define both the methods


interface X{
    void run();
}

//if u want to extend interface to interface -->use extends 

interface Y extends X{

}


// class B implements A,X { //1 class can implement multiple interfaces  . in abstract class we can extend only 1 class

//     public void show(){
//         System.out.println("in show....");
//     }
//     public void config(){
//         System.out.println("in config....");
//     }


//     public void run(){
//         System.out.println("in run....");
//     }
// }

class B implements A,Y { //1 class can implement multiple interfaces  . in abstract class we can extend only 1 class

    public void show(){
        System.out.println("in show....");
    }
    public void config(){
        System.out.println("in config....");
    }


    public void run(){    //even we havent specified the interface  x . we wants to define run method of  x. else it will throw error

        System.out.println("in run....");
    }
}

public class Demo {
    public static void main(String[] args) {
        

        A obj;
        // obj = new A();  --> not possible
        obj = new B();   //possible. since b implemnts methods of a
            
        obj.show();  //methods also we an acccess
        obj.config();

        
        //we can directly access static variables  from interface
        System.out.println(A.age);
        System.out.println(A.area);

        X obj1 = new B();
        obj1.run();

    }
}


//needof interface
