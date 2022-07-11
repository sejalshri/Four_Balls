import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    int x=0;
    int y=0;
    int z=0;
    int m=0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(x,HEIGHT/5,20,20);
        ellipse(y,(HEIGHT*2)/5,20,20);
        ellipse(z,(HEIGHT*3)/5,20,20);
        ellipse(m,(HEIGHT*4)/5,20,20);
        x++;
        y=y+2;
        z=z+3;
        m=m+4;
        //super.draw();
    }

    public static void main(String[] args){
        PApplet.main("TryProcessing",args);
    }
}

