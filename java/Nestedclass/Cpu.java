package Nestedclass;

class Cpu {
    double price;

    class processor{
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    protected class RAM{
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
    
}
