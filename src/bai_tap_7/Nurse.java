package bai_tap_7;

public class Nurse extends Employer{
    private int timeOH;

    public Nurse(String id, String name, String phone, String email, float coefficients, String possition, int timeOH) {
        super(id, name, phone, email, coefficients, possition);
        this.timeOH = timeOH;
    }

    public Nurse(int timeOH) {
        this.timeOH = timeOH;
    }
    public double salary(){
        return this.getCoefficients()*1600000+this.timeOH*200000;
    }

    @Override
    public String toString() {
        return "Nurse {"+super.toString() +
                "time OH"
                + timeOH +
                '}';
    }
}
