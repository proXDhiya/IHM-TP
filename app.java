import res.*;
import javax.swing.*;

public class app {
    public static void main(String[] argc) {
        // Create JFrame
        JFrame frame = new JFrame("Car Simulator");
        
        // Create car
        CarModule car = new CarModule();
        car.setBounds(0, 0, 50, 20);

        // event listener
        frame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                car.keyPressed(evt.getKeyCode());
            }
        });

        // Add car to frame
        frame.add(car);

        // Set frame size
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
