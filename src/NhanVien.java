import java.util.Date;

public class NhanVien {
    private int id;
    private String hoTen;
    private int tuoi;
    private Date birth;
    private int daysWork;
    private double saLary;

    public NhanVien(int id, String hoTen, int tuoi,Date birth, int daysWork) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.birth = birth;
        this.daysWork = daysWork;
    }

    public NhanVien() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getDaysWork() {
        return daysWork;
    }

    public void setDaysWork(int daysWork) {
        this.daysWork = daysWork;
    }

    public double getSaLary() {
        return saLary;
    }

    public void setSaLary(double saLary) {
        this.saLary = saLary;
    }

    @Override
    public String toString() {
        return
                "\nId=" + id +
                "\nHoTen=" + hoTen  +
                "\nTuoi=" + tuoi +
                "\nBirth=" + birth +
                "\nDaysWork=" + daysWork
                ;
    }
}
