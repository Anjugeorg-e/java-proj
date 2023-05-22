package sampleprograms;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println("hello");
        // System.out.println("anju ");

        // Scanner input = new Scanner(System.in);
        // System.out.print("enter first number: ");
        // int n1 = input.nextInt();

        // Scanner inpu = new Scanner(System.in);
        // System.out.print("enter second number: ");
        // int n2 = input.nextInt();

        // int sum = n1 + n2;
        // System.out.println("sum is: " + sum);

        // Scanner input = new Scanner(System.in);
        // System.out.print("enter number: ");
        // int n1 = input.nextInt();

        // Scanner inpu = new Scanner(System.in);
        // System.out.print("enter number");
        // int n2 = inpu.nextInt();

        // int div = n1*n2;
        // System.out.println("answer is: " + div);

        // Main main = new Main();
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter num1: ");
        // int num1 = input.nextInt();
        
        // Scanner input1 = new Scanner(System.in);
        // System.out.print("Enter num2:");
        // int num2 = input1.nextInt();
        
        // main.equal(25, 39);
        // main.lessThan(25, 39);
        // main.lessThanEqual(25, 39);



        
    // }
    // public void equal(int num1, int num2){
    //     if(num1 == num2){
    //         System.out.println("num1 == num2");
    //     }else{
    //         System.out.println("num1 != num2");
    //     }
    // }

    // public void lessThan(int num1, int num2){
    //     if(num1<num2){
    //         System.out.println(num1 < num2);

    //     }else{
    //         System.out.println(num1 > num2);
    //     }
    // }
    // public void lessThanEqual(int num1 , int num2){
    //     if(num1<= num2){
    //         System.out.println( num1 <= num2);
    //     }else{
    //         System.out.println(num1 >num2);
    //     }


        // Scanner input = new Scanner(System.in);
        // System.out.print("enter a num: ");
        // int n1 = input.nextInt();

        // int n2 = (n1*10)+n1;
        // int sum = n1 + n2 + (n1*100 + n2)  ;
        // System.out.println("Sum is:  " + sum);


        // for(int i =1; i<=99 ; i++){
        //     if(i%2 != 0){

        //         System.out.println(i);
        //     }
        // }


        // Scanner input = new Scanner(System.in);
        // System.out.print("enter a num: ");
        // int n = input.nextInt();

        // if(n%2 == 0){
        //     System.out.println(1);
        // }else{
        //     System.out.println(0);
        // }

        // for(int i =1; i<=100; i++){
        //     if(i%3 == 0){
        //         System.out.print(" " + i + " ");
        //     }
           
        //     if( i% 5 ==0){
        //         System.out.println(" " + i + " ");
        //     }
            
            // if((i%3 ==0) && (i%5 == 0)){
            //     System.out.println(" " + i + " ");
            // }
        // }


        // String original,reverse ="";
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter a string ro check palindrome or not : ");
        // original = in.nextLine();
        // int length = original.length();
        // for(int i=length-1; i>=0;i--)
        //         reverse = reverse + original.charAt(i);
        // if(original.equals(reverse))
        //    System.out.println("The string is a palindrome ");        
        // else
        //    System.out.println("The string is not a palindrome");     
           
        // int day, month, year;
        // int second, minute,hour;

        // GregorianCalendar date = new GregorianCalendar();
        // day = date.get(Calendar.DAY_OF_MONTH);
        // month = date.get(Calendar.MONTH);
        // year = date.get(Calendar.YEAR);
        // second = date.get(Calendar.SECOND);
        // minute = date.get(Calendar.MINUTE);
        // hour = date.get(Calendar.HOUR);

        // System.out.println("Current date is " + day + "/" + (month+1) + "/" + year);
        // System.out.println("Current time is: " + hour+ ":" +minute+":"+second);


        // int count =7, num1=0,num2 =1;
        // System.out.print("Fibinocci series of " + count + "numbers: ");
        // for(int i =1; i<= count;i++){
        //     System.out.print(num1+"");
        //     int sumOfPrevTwo = num1+num2;
        //     num1 = num2;
        //     num2 = sumOfPrevTwo;
        // }
       

        // List<String>cityList = new ArrayList<String>();
        // cityList.add("Delhi");
        // cityList.add("MUmbai");
        // cityList.add("KOlkata");

        // System.out.println("original list: " + cityList);
        // cityList.remove(1);
        // // cityList.remove("Mumbai");
        // System.out.println("LIst after removin elemnts: " + cityList);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();

        int factorial = fact(num);
        System.out.println("factorial pf entered number is : " + factorial);

        }
        static int fact(int n){
            int output;
            if(n==1){
                return 1;
            }
            output = fact(n-1)*n;
            return output;
        
    }
}
