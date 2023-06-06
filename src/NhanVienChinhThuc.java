import java.util.Date;

public class NhanVienChinhThuc extends NhanVien {

    private float soGioOT;

    public NhanVienChinhThuc(int id, String hoTen, int tuoi, Date birth, int daysWork, float soGioOT) {
        super(id, hoTen, tuoi, birth, daysWork);
        this.soGioOT = soGioOT;
    }

    public float getSoGioOT() {
        return soGioOT;
    }

    public void setSoGioOT(float soGioOT) {
        this.soGioOT = soGioOT;
    }

    public double saLary() {
        return this.getDaysWork() * 1000000 + soGioOT * 100000;
    }

    @Override
    public String toString() {
        return "Nhan Vien Chinh Thuc\n"+super.toString()  +"\nSalary= "+getSaLary()+
                "\nsoGioOT=" + getSoGioOT()
                ;
    }
}

