package dog;

public class Dog {
    public static void main(String[] args) {
        Dog d = new Dog();
        int orig = 42;
        int y = d.go(orig);
        System.out.println(orig + " " + y);
        // d.bark(5);
        // d.takeTwo(3,5);
    }
    // public void bark(int numOfBarks){
    //     while(numOfBarks > 0){
    //         System.out.println("ruff");
    //         numOfBarks = numOfBarks -1;
    //     }
    // }
    // public void takeTwo(int x, int y){
    //     int z = x+y;
    //     System.out.println("Total is: " + z);
    // }

    int go(int arg){
        arg = arg * 2;
        return arg;
    }


}


