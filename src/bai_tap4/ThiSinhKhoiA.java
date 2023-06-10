package bai_tap4;

public class ThiSinhKhoiA extends ThiSinh {
    private double hoa;
    private double toan;
    private double ly;

    public ThiSinhKhoiA(int id, String name, String address, int mucuutien, double hoa, double toan, double ly) {
        super(id, name, address, mucuutien);
        this.hoa = hoa;
        this.toan = toan;
        this.ly = ly;
    }

    public ThiSinhKhoiA(double hoa, double toan, double ly) {
        this.hoa = hoa;
        this.toan = toan;
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "hoa=" + hoa +
                ", toan=" + toan +
                ", ly=" + ly +
                '}';
    }
}
