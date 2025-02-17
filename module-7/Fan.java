/*Mark White
CSD402
Mod7Assignment*/

import java.util.ArrayList;
import java.util.List;

public class Fan {
    // Constants for speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

  
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "White";
    }

    // Arguments setting values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Display method single fan
    public void displayFan() {
        System.out.println("Color: " + this.color);
        System.out.println("Radius: " + this.radius);
        System.out.println("Speed: " + getSpeedDescription());
        System.out.println("State: " + (this.on ? "on" : "off"));
        System.out.println();
    }

    // Display method collection of fans
    public static void displayFans(List<Fan> fans) {
        System.out.println("=== Collection of Fans ===");
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            fans.get(i).displayFan();
        }
    }

    private String getSpeedDescription() {
        switch (this.speed) {
            case STOPPED: return "Stopped";
            case SLOW: return "Slow";
            case MEDIUM: return "Medium";
            case FAST: return "Fast";
            default: return "Unknown";
        }
    }

    // Main method 
    public static void main(String[] args) {
        // Create a collection of fans
        List<Fan> fans = new ArrayList<>();
        
        // Add to the collection
        fans.add(new Fan()); // default fan
        fans.add(new Fan(FAST, true, 8, "Blue"));
        fans.add(new Fan(MEDIUM, true, 7, "Red"));
        fans.add(new Fan(SLOW, false, 5, "Green"));
        
        
        displayFans(fans);
        
        //individual fan display
        System.out.println("=== Individual Fan Display ===");
        Fan testFan = new Fan(MEDIUM, true, 10, "Yellow");
        testFan.displayFan();
    }
}