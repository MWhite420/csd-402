/*Mark White
CSD402
Mod6Assignment*/

public class Fan {

    // Constants for speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
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

    // Arguments for setting values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        String state = (on) ? "on" : "off";
        String speedDescription = "";
        switch (speed) {
            case STOPPED:
                speedDescription = "Stopped";
                break;
            case SLOW:
                speedDescription = "Slow";
                break;
            case MEDIUM:
                speedDescription = "Medium";
                break;
            case FAST:
                speedDescription = "Fast";
                break;
        }
        return "Fan [Color: " + color + ", Radius: " + radius + ", Speed: " + speedDescription + ", State: " + state + "]";
    }

    // Main method 
    public static void main(String[] args) {
        // two instances of the Fan class
        Fan fan1 = new Fan(); // default constructor
        Fan fan2 = new Fan(FAST, true, 8, "Blue"); 
        // Display the initial states of both fans
        System.out.println("Fan 1 (default constructor): " + fan1.toString());
        System.out.println("Fan 2 (argument constructor): " + fan2.toString());

        
    }
}
