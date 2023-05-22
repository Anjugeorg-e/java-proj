package trafficlight;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        Traffic tr = new Traffic();
        tr.setColor("red");

        tr.changeColor();
        System.out.println(tr.getColour());
        tr.changeColor();
    }
}
