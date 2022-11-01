package res;
import javax.swing.JLabel;
import java.awt.*;

public class CarModule extends JLabel {
    // Private attributes
    private int Acceleration;   // speed m/s
    private int Breaks;         // breaks m/s
    private int MaxSpeed;       // max speed car can be
    private String name;        // car name
    
    // auto constructor
    public CarModule() {
        super("Car");
        this.Acceleration = 8;
        this.Breaks = 4;
        this.MaxSpeed = 80;
        this.name = "Car";
    }

    // constructor
    public CarModule(int Acceleration, int Breaks, int MaxSpeed, String name) {
        super("Car");
        this.Acceleration = Acceleration;
        this.Breaks = Breaks;
        this.MaxSpeed = MaxSpeed;
        this.name = name;
    }

    // event handler for key press event UP-DOWN-LEFT-RIGHT
    public void keyPressed(int key) {
        switch (key) {
            case 38: // UP
                // read x and y position
                int x = this.getX();
                int y = this.getY();
                // set new position
                this.setLocation(x + this.Acceleration, y);
                break;
            case 40: // DOWN
                // read x and y position
                x = this.getX();
                y = this.getY();
                // set new position
                this.setLocation(x - this.Breaks, y);
                break;
            case 37: // LEFT
                // rotate car 1 degree to left
                Graphics2D g2d = (Graphics2D) this.getGraphics();
                g2d.rotate(Math.toRadians(-1), this.getX(), this.getY());
                break;
            case 39: // RIGHT
                System.out.println("RIGHT");
                break;
        }
    }
}
