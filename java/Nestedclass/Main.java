package Nestedclass;

import Nestedclass.Cpu.RAM;

public class Main {
    public static void main(String[] args) {

        //reate obect of outer  classs CPU
        Cpu cpu = new Cpu();

        //create object of processor using outer class
        Cpu.processor processor = cpu.new processor();

        //create object of ram using cpu
        Cpu.RAM ram =  cpu.new RAM();

        System.out.println("processer cache= " + processor.getCache());
        System.out.println("Ram clock speed: " + ram.getClockSpeed());

    }
    
//non-static nested class(inner class)
    //this class has access to memebers of the outer class.


    //static nessssted class
}
