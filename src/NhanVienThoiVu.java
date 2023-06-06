import java.util.Date;

public class NhanVienThoiVu extends NhanVien {
    private float mucChietKhau;

    public NhanVienThoiVu(int id, String hoTen, int tuoi, Date birth, int daysWork) {
        super(id, hoTen, tuoi, birth, daysWork);
        this.mucChietKhau = 0.5f;
    }
public NhanVienThoiVu(){

}
    public NhanVienThoiVu(float mucChietKhau) {
        this.mucChietKhau = mucChietKhau;
    }

    public NhanVienThoiVu(int id, String name, int tuoi, Date birth, int daysWork, float mucChietKhau) {
        super(id, name, tuoi, birth, daysWork);
        this.mucChietKhau = mucChietKhau;
    }

    public float getMucChietKhau() {
        return mucChietKhau;
    }

    public void setMucChietKhau(float mucChietKhau) {
        this.mucChietKhau = mucChietKhau;
    }

    public double saLary() {
        return this.getDaysWork() * 1000000 * 0.5;
    }

    @Override
    public String toString() {
        return "Nhan Vien Thoi Vu\n"+super.toString()  +"\nSalary= "+getSaLary()
                ;
    }
}
