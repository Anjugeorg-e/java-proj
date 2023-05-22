package Java_Proj;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {


        Dog d1 = new Dog();
        System.out.println(d1 instanceof Animal);  //true--checks d1 also an instance of th einterface animal

        // Bicycle bmk = new Bicycle();
        // System.out.println(bmk.gear);
        Dogs dogs = new Dogs();
        // dogs.eat();
        dogs.display();



        Bicycle name = new Bicycle(2, 2);
        System.out.println(name.speed);

        Bicycle names = new Bicycle();
        System.out.println(names.gear);
        System.out.println(name.sum(3, 4));


        // System.out.println("hello world!");


        // int days = 29;
        // String result;

        // result = (days == 39) ? "leap" : " not leap";
        // System.out.println(result);

        // int percentage = 45;
        // if(percentage > 90){
        //     System.out.println("Grade = A ");
        // }else if(percentage > 75){
        //     System.out.println("Grdae is= B ");
        // }else{
        //     System.out.println("Grade is = C ");
        // }

        // int day =3;
        // switch (day){
        //     case 1:
        //       System.out.println("day is: 1 ");
        //       break;
        //     case 2:
        //        System.out.println("day is 2 ");
        //        break;
        //     case 3:
        //        System.out.println("day is 3 ");
        //        break;
        //     default:
        //     System.out.println("day is not in this range");         
        // }

        // Scanner Scanner =new Scanner(System.in);
        // System.out.print("enter a num: ");
        // int num = Scanner.nextInt();
        // System.out.println("Entered number is: " + num);
        // int sum = 0;
        // for(int i =0; i <num; i++){
        //     sum += i;
        // }
        // System.out.println("Sum is: " + sum);


        // int[] numbers = {2,3,4,1,6,5,8};
        // int summ = 0;
        // for(int values: numbers){
        //     summ += values;

        // }
        // System.out.println(summ);

        // for(int items : numbers){
        //     System.out.println(items);
        // }

        // int i =6;
        // while(i<10){
        //     System.out.println("i is: "+ i);
        //     i++;
        // }

    //    String[] names = {"anju","ann"};
    //    System.out.println(numbers[1]);
    //    for(int k=0;k<numbers.length;k++){
    //     System.out.println("item is: " + numbers[k]);
    //    }

    //    int [][] a = {{2,9},{6,7}};
    //    for(int i =0;i<a.length;i++){
    //     for(int j =0; j<a.length;j++)
    //         System.out.print(a[i][j]);
        
    //    }

    //   int[] n1 = {1,3,2,5,4};
    //   System.out.println(Arrays.toString(n1));

    //   int[] n2 = new int[9];
    //   System.arraycopy(n1, 0, n2, 0, n1.length);
    //   System.out.println(Arrays.toString(n2));


    }
}
