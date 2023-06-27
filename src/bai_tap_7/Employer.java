package bai_tap_7;

public class Employer {
private String id;
private String name;
private String phone;
private String email;
private float coefficients;
private double salary;
private String possition;

    public Employer(String id, String name, String phone, String email, float coefficients, String possition) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.coefficients = coefficients;
        this.possition = possition;
    }

    public Employer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(float coefficients) {
        this.coefficients = coefficients;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPossition() {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", coefficients=" + coefficients +
                ", salary=" + salary +
                ", possition=" + possition +
                '}';
    }
}
