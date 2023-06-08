package lap4;

import lap4.NhanVien;
import lap4.NhanVienChinhThuc;
import lap4.NhanVienThoiVu;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Date;

public class QuanLyNhanVien {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanVien> arrNhanVien = new ArrayList<>();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        int choice = 0;
        label:
        while (true)// vong lap vo han
        {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhập danh sách Nhân viên");
            System.out.println("2. Xuất danh sách nhân viên mặc định");
            System.out.println("3. Xuất danh sách nhân viên theo lương");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Hiển thị lương trung bình");
            System.out.println("6. Thoát chương trình");
            System.out.println("===========END===========");
            System.out.println("Nhap lua chon cua ban");
            try {
                choice = Integer.parseInt(sc.nextLine()); //nhan vao string trả ve interger

            } catch (NumberFormatException e) {
                System.out.println("Sai roi,nhap so tu 1-6 nheeeee");
                continue;//
            }
            switch (choice) {
                case 1:
                    Menucon();
                    break;
                case 2:
                    Menucon2();
                    break;
                case 3:
                    sortNhanVien();
                    break;
                case 4:
                    deleteNV();
                    break;
                case 5:
                    Menucon5();
                    break;
                case 6:

                    break label;
                default:
                    System.out.println("Làm ơn nhập số từ 1-6 nheeee. Iuuuuuu");
                    break;
            }
       /*if(choice==6){
           break;
       }*/
        }

    }

    public static void Menucon() {
        int choice = 0;
        labelcon:
        while (true)// vong lap vo han
        {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhan vien thoi vu ");
            System.out.println("2. Nhan vien chinh thuc");
            System.out.println("3. Thoát chương trình");
            System.out.println("===========END===========");
            System.out.println("Nhap lua chon cua ban");
            try {
                choice = Integer.parseInt(sc.nextLine()); //nhan vao string trả ve interger

            } catch (NumberFormatException e) {
                System.out.println("Sai roi , Nhâp lại đi!");
                continue;
            }
            switch (choice) {
                case 1:
                    addNhanVienTV();
                    break;
                case 2:
                    addNhanVienCT();
                    break;
                case 3:
                    break labelcon;
                default:
                    System.out.println("Sai rồi. Nhập 1 tới 3 ");
                    break;
            }
        }
    }

    public static void addNhanVienCT() {
        int id = enterId();
        String name = enterName();
        int tuoi = enterTuoi();
        Date birth = enterBirth();
        int daysWork = enterdaysWork();
        int soGioOT = entersoGioOT();
        NhanVienChinhThuc newnv = new NhanVienChinhThuc(id, name, tuoi, birth, daysWork, soGioOT);
        newnv.setSaLary(newnv.saLary());

        arrNhanVien.add(newnv);

    }

    public static void addNhanVienTV() {
        int id = enterId();
        String name = enterName();
        int tuoi = enterTuoi();
        Date birth = enterBirth();
        int daysWork = enterdaysWork();
        NhanVienThoiVu nvtv = new NhanVienThoiVu(id, name, tuoi, birth, daysWork);
        nvtv.setSaLary(nvtv.saLary());


        // Thêm đối tượng lap4.NhanVien này vào ArrayList
        arrNhanVien.add(nvtv);
    }


    public static int enterId() {
        int id = 0;
        while (true) {
            System.out.println("Nhập id nhân viên");
            try {
                id = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Sai rồi, nhập lại số đi mới đúng!");
                continue;
            }
            if (id > 0) {
                boolean flag = false;
                for (NhanVien nv : arrNhanVien) {
                    if (nv.getId() == id) {
                        flag = true;
                    }
                }
                if (!flag) {
                    return id;
                } else {
                    System.out.println("Id đã tồn tại. Mời nhập lại!");
                }
            } else {
                System.out.println("Id phải lớn hơn 0");
            }

        }
    }

    public static void checkNhanVien() {

    }

    public static String enterName() {
        String name;
        while (true) {
            System.out.println("Nhập tên nhân viên");
            try {
                name = sc.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Sai rồi, đừng để rỗng. Mời nhập lại!");
                continue;
            }
            return name;
        }
    }

    public static int enterTuoi() {
        int tuoi = 0;
        while (true) {
            System.out.println("Nhập tuoi nhân viên");
            try {
                tuoi = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai rồi, Mời Nhập số: ");
                continue;
            }
            if (tuoi >= 18 && tuoi <= 50) {
                return tuoi;
            } else {
                System.out.println("Tuoi phải lon hon 18 va nho hon 50");
            }

        }
    }

    public static Date enterBirth() {

        Date birth = null;
        while (true) {
            System.out.print("Nhập ngay sinh (dd/mm/yyyy): ");

            try {
                String dateString = sc.nextLine();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                birth = dateFormat.parse(dateString);
                System.out.println("Ngày tháng năm sinh của bạn: " + dateFormat.format(birth));
            } catch (ParseException e) {
                System.out.println("Không thể chuyển đổi ngày! Moi Nhap Lai");
            }
            return birth;
        }
    }

    public static int enterdaysWork() {
        int daysWork = 0;
        while (true) {
            System.out.println("Nhập ngay lam cua nhân viên");
            try {
                daysWork = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai gòi, chỉ được nhập số thuiii. Moi Nhap Lại!");
                continue;
            }
            if (daysWork >= 0 && daysWork <= 31) {
                return daysWork;
            } else {
                System.out.println("Ngay lam trong thang phải lon hon 0 va nho hon 31");
            }

        }
    }

    public static int entersoGioOT() {
        int soGioOT = 0;
        while (true) {
            System.out.println("Nhập Gio OT");
            try {
                soGioOT = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai gòi chỉ nhập số thôi, Moi Nhap so");
                continue;
            }
            return soGioOT;
        }
    }

    public static void Menucon2() {
        int choice = 0;
        labelcon2:
        while (true)// vong lap vo han
        {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhan vien thoi vu ");
            System.out.println("2. Nhan vien chinh thuc");
            System.out.println("3. Thoát chương trình");
            System.out.println("===========END===========");
            System.out.println("Nhap lua chon cua ban");
            try {
                choice = Integer.parseInt(sc.nextLine()); //nhan vao string trả ve interger

            } catch (NumberFormatException e) {
                System.out.println("Sai roi , Nhap lại di!");
                continue;
            }
            switch (choice) {
                case 1:
                    displayNVTV();
                    break;
                case 2:
                    displayNVCT();
                    break;
                case 3:

                    break labelcon2;
                default:
                    System.out.println("Nhap so tu 1-3 di ba noi!");
                    break;
            }
        }
    }

    public static void displayNVTV() {
        int count = 0;
        for (NhanVien nv : arrNhanVien) {
            if (nv instanceof NhanVienThoiVu) {
                //viet hoa chu thuong

                String capitalized = capitalizeFirstLetter(nv.getHoTen());
                nv.setHoTen(capitalized);
                System.out.println(nv);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Danh sách rỗng");
        }
    }

    public static void displayNVCT() {
        int count = 0;
        for (NhanVien nv : arrNhanVien) {
            if (nv instanceof NhanVienChinhThuc) {
                String capitalized = capitalizeFirstLetter(nv.getHoTen());
                nv.setHoTen(capitalized);
                System.out.println(nv);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Danh sách rỗng");
        }
    }

    public static void sortNhanVien() {
        Collections.sort(arrNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getSaLary() >= o2.getSaLary()) {
                    return -1;
                } else
                    return 1;
            }
        });
        for (NhanVien nv : arrNhanVien) {
            System.out.println(nv);
        }

    }

    public static NhanVien seachName(String name) {
        for (NhanVien nv : arrNhanVien) {
            if (nv.getHoTen().equals(name)) {
                return nv;
            }
        }
        return null;
    }

    public static void deleteNV() {
        String name = enterName();
        NhanVien seach = seachName(name);
        if (seach == null) {
            System.out.println("Khong tim thấy dữ liệu của nhân viên! Moi ban Kiểm tra Lại");
        } else {
            arrNhanVien.remove(seach);
            System.out.println("Đã xóa");
        }
    }

    public static void luongTrungBinhtv() {
        float average = 0;
        int count = 0;

        for (NhanVien nv : arrNhanVien) {
            if (nv instanceof NhanVienThoiVu) {
                average += nv.getSaLary();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Danh sách rỗng");

        } else
            System.out.println("Lương Trung Bình Của Nhân Viên Thời vụ là: " + average / count);

    }

    public static void luongTrungBinhct() {
        float average = 0;
        int count = 0;

        for (NhanVien nv : arrNhanVien) {
            if (nv instanceof NhanVienChinhThuc) {
                average += nv.getSaLary();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Danh Sách rỗng");
        } else
            System.out.println("Lương Trung Bình Của Nhân Viên Chính Thức là: " + average / count);
    }

    public static void Menucon5() {
        int choice = 0;
        labelcon5:
        while (true)// vong lap vo han
        {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhan vien thoi vu ");
            System.out.println("2. Nhan vien chinh thuc");
            System.out.println("3. Thoát chương trình");
            System.out.println("===========END===========");
            System.out.println("Nhap lua chon cua ban");
            try {
                choice = Integer.parseInt(sc.nextLine()); //nhan vao string trả ve interger

            } catch (NumberFormatException e) {
                System.out.println("Sai roi , Nhap lại di!");
                continue;
            }
            switch (choice) {
                case 1:
                    luongTrungBinhtv();
                    break;
                case 2:
                    luongTrungBinhct();
                    break;
                case 3:

                    break labelcon5;
                default:
                    System.out.println("Nhap so tu 1-3 di ba noi!");
                    break;
            }
        }
    }

    public static String capitalizeFirstLetter(String str) {
        StringBuilder sb = new StringBuilder();

        boolean isSpace = true;
        for (char c : str.toCharArray()) {
            if (isSpace) {
                sb.append(Character.toUpperCase(c));
                isSpace = false;
            } else {
                sb.append(c);
            }

            if (Character.isWhitespace(c)) {
                isSpace = true;
            }
        }

        return sb.toString();
    }


}

