package bai_tap4;

public class ThiSinhKhoiB extends ThiSinh {
    private float toan;
    private float hoa;
    private float sinh;

    public ThiSinhKhoiB(int id, String name, String address, int mucuutien, float toan, float hoa, float sinh) {
        super(id, name, address, mucuutien);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public ThiSinhKhoiB(float toan, float hoa, float sinh) {
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getSinh() {
        return sinh;
    }

    public void setSinh(float sinh) {
        this.sinh = sinh;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "toan=" + toan +
                ", hoa=" + hoa +
                ", sinh=" + sinh +
                '}';
    }
}
