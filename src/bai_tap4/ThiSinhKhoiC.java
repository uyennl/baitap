package bai_tap4;

public class ThiSinhKhoiC extends ThiSinh{
private float van;
private float su;
private float dia;

    public ThiSinhKhoiC(int id, String name, String address, int mucuutien, float van, float su, float dia) {
        super(id, name, address, mucuutien);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public ThiSinhKhoiC(float van, float su, float dia) {
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getSu() {
        return su;
    }

    public void setSu(float su) {
        this.su = su;
    }

    public float getDia() {
        return dia;
    }

    public void setDia(float dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +
                "van=" + van +
                ", su=" + su +
                ", dia=" + dia +
                '}';
    }
}
