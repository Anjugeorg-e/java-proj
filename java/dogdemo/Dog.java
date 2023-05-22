package dogdemo;
public class Dog {
    private Dog[] dogs = new Dog[5];
    private int nextindex=0;



public void add(Dog d)
{
    if(nextindex < dogs.length){
        dogs[nextindex] = d;
        System.out.println("Dog added at " + nextindex);
        nextindex++;
    }
}
}
