package player;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y){
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp, float yDisp){
     
        x = xDisp;
        y = yDisp;
    }
    public void move(float zDisp){
        
    }
}
