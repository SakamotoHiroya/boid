import processing.core.PApplet;

public class BoidApplet extends PApplet {

    @Override
    public void settings(){
        size(700, 400);
    }

    @Override
    public void setup(){
        background(0);
    }

    @Override
    public void draw(){
        stroke(255);
        ellipse(width/2f, height/2f, width/2f, height/2f);
    }

}
