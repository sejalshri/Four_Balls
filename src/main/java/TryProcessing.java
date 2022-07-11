import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(x1,HEIGHT/5,20,20);
        ellipse(x2,(HEIGHT*2)/5,20,20);
        ellipse(x3,(HEIGHT*3)/5,20,20);
        ellipse(x4,(HEIGHT*4)/5,20,20);
        x1+=1;
        x2+=2;
        x3+=3;
        x4+=4;
        //super.draw();
    }

    public static void main(String[] args){
        PApplet.main("TryProcessing",args);
    }
}

