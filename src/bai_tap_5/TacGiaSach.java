package bai_tap_5;

import java.util.Date;

public class TacGiaSach{
    private String name;
    private Date birth;

    public TacGiaSach(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public TacGiaSach() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "TacGiaSach{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
