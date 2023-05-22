package Java_Proj;

public class Bicycle {
    int gear;
    int speed;

public Bicycle(int gear, int speed) {  //constructor wont hvae any return type
        this.gear = gear;
        this.speed = speed;
    }

public  Bicycle(){
    speed = 10;
    gear = 3;

}

int sum(int a, int b){
    int c= a+ b;
    return c;
}
// void Bicycle(int gea, int spee){
//     this.speed = spee;
//     this.gear = gea;
// }

}
