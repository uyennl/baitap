package vi_du_1;

import checked_input.Input;

import java.util.ArrayList;

public class Control {
    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void addNhanVien() {
        int age = Input.enterValidInteger("Nhâp tuổi Nhân viên: ", true, true);
        String name = Input.enterValidName("Nhập tên nhân viên : ", true);
        String birth = Input.enterValidDate("Nhập Ngày sinh");

        NhanVien nv = new NhanVien(name, age, birth);

        danhSachNhanVien.add(nv);
    }

    public void display() {
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }

}
