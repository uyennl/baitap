package bai_tap4;

public class ThiSinh {
    private int id;
    private String name;
    private String address;
    private int mucuutien;

    public ThiSinh(int id, String name, String address, int mucuutien) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mucuutien = mucuutien;
    }

    public ThiSinh() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMucuutien() {
        return mucuutien;
    }

    public void setMucuutien(int mucuutien) {
        this.mucuutien = mucuutien;
    }

    @Override
    public String toString() {
        return "ThiSinh" +
                "Id= " + id + '\'' +
                "Name= " + name + '\'' +
                "Address= '" + address + '\'' +
                "Muc do uu tien =" + mucuutien ;
    }
}
