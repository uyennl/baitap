package bai_tap_7;

public class Doctor extends Employer{
    private int level;
    private double positionall;


    public Doctor(String id, String name, String phone, String email, float coefficients, String possition, int level, double positionall) {
        super(id, name, phone, email, coefficients, possition);
        this.level = level;
        this.positionall = positionall;
    }

    public Doctor(int level, double positionall) {
        this.level = level;
        this.positionall = positionall;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getPosition() {
        return positionall;
    }

    public void setPosition(double positionall) {
        this.positionall = positionall;
    }

    public double salary(){
        return ((this.level+this.getCoefficients())*1650000+ positionall);
    }

    @Override
    public String toString() {
        return "Doctor{"+ super.toString() +
                "level=" + level +
                ", positionall=" + positionall +
                '}';
    }
}
