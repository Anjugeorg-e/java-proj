package trafficlight;

public class Traffic {
    private String color;
    private  int duration=10;

    public void setColor(String color){
        this.color = color;
    }
    public String getColour(){
        return this.color;
    }
    public void changeColor(){

        
        if(duration == 10 && color =="red"){
                setColor("green");                
        }else if(duration == 10 && color =="yellow"){
            setColor("red");
        }else if(duration == 10 && color == "green"){
            setColor("yellow");
        }
    }
}
