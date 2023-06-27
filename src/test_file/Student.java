package test_file;

/**
 * @author Uyenne
 */
public class Student {
    private String name;
    private int age;
    private String address;
    private float average;

    public Student() {

    }

    public Student(String name, String address, float average) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

}

