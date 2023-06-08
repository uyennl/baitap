package bai_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean tunonoff = false ;
    private double radius = 5.0  ;
    private String color = "blue";

    public Fan(int speed, boolean tunonoff, double radius, String color) {
        this.speed = speed;
        this.tunonoff = tunonoff;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isTunonoff() {
        return tunonoff;
    }

    public void setTunonoff(boolean tunonoff) {
        this.tunonoff = tunonoff;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", tunonoff=" + tunonoff +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Fan[] fan = new Fan[];
        fan[0] = new Fan(1, true, 10.0, "yellow");
        fan[1] = new Fan(2, false, 5.0, "blue");
        for (int i = 0; i < 2; i++) {
            if (tunonoff() == false) {
                System.out.println(fan.toString());
                System.out.println("Fan is on");
            } else {
                System.out.println(fan.toString());
                System.out.println("Fan is off");
            }


        }
    }
}
