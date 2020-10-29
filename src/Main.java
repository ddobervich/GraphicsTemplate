import processing.core.PApplet;

public class Main extends PApplet {
    // declare your variables here

    public void settings() {
        size(800, 800);     // width and height of your window
    }

    public void setup() {
        // initialize your variables here
    }

    public void draw() {
        // your drawing commands go here.  This method is automatically run 30 times a second.
        ellipse(width/2, height/2, 60, 60);
    }

    // What's in quotes must match the name of your class
    public static void main(String[] args) {
        PApplet.main("Main");
    }
}