package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void divideByZero(){

        //throw an exception -- to explicitly throw a single  arithematic exception
        throw new ArithmeticException("Trying to divide by zero");
    }

    public static void findFile() throws IOException{
        //throws - to declare the type of exceptions that might occur with in the method .it is sed in the method declarartion.

        //code which may caue the ioexception
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }


    public static void main(String[] args) {

        // divideByZero();   //throw

        try{                   //throws
            findFile();
        }catch(IOException e){
            System.out.println(e);
        }


        // try{                   
        //     int divideByZero = 5/0;
        //     System.out.println("Rest of code in try block");
        // }catch(ArithmeticException e){
        //             System.out.println("ARithematicException => " + e.getMessage());
        // }finally{
        //     System.out.println("always prints ");
        // }
    }
}
