package bai_tap_5;

import bai_tap4.ThiSinh;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class QuanLySach {
    Scanner sc = new Scanner(System.in);
    ArrayList<ThongTinSach> arrQuanLySach = new ArrayList<>();
    ThongTinSach in = new ThongTinSach();


    public void Menu() {
        int choice = 0;
        label:
        while (true) {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhập Thông Tin Sách");
            System.out.println("2. In ra màng hình tên sách");
            System.out.println("3. Cùng năm đó có quyển sách nào xuất bản nữa ko?");
            System.out.println("4. Gia sach sao khi giam x%");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("===========END===========");
            System.out.println("Nhap lua chon cua ban");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban phai nhap so. Moi ban Nhap lai!");
                continue;
            }
            switch (choice) {
                case 1:
                    addThongTinSach();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    displaySame();
                    break;
                case 4:
                    displayGiamGia();
                    break;
                case 5:
                    break label;
                default:
                    System.out.println("So phai tu 1-6 moi ban nhap lai!");
                    break;
            }
        }
    }

    public void addThongTinSach() {
        String name = addName();
        long priceBook = addPriceBook();
        int yearPrint = addNamXuatBan();
        String nameAu = addTenTacGia();
        Date birth = addBirth();
        TacGiaSach tg = new TacGiaSach(nameAu, birth);
        ThongTinSach tts = new ThongTinSach(name, priceBook, yearPrint, tg);
        arrQuanLySach.add(tts);
    }

    public ThongTinSach seachBook(String name) {
        for (ThongTinSach inf : arrQuanLySach) {
            if (inf.getNameBook().equals(name)) {
                return inf;
            }

        }
        return null;
    }

    public void displayBook() {
        String nameBook = addName();
        ThongTinSach seach = seachBook(nameBook);
        if (seach == null) {
            System.out.println("Khong tim thay ten sach");
        } else {
            System.out.println(seach);
        }
    }

    public boolean checkSameY(int year) {
        for (ThongTinSach inf : arrQuanLySach) {
            if (inf.getYearPrint() == year) {
                return true;
            }
        }
        return false;
    }

    public void displaySame() {
       int year = addNamXuatBan();
        for (ThongTinSach inf : arrQuanLySach) {
            if (checkSameY(year) == true) {
                System.out.println(inf);
            } else
                System.out.println("Khong tim thay sach co cung nam xuat ban");
        }
    }
//    public double giamGia(double x){
//        double giamgia = x*in.getPriceBook()/100;
//        return giamgia;
//    }
public void displayGiamGia(){
        double x = addX();
        for(ThongTinSach inf : arrQuanLySach){
            System.out.println(inf.getNameBook()+" sau khi giảm x% thì sach co gia la: "+(inf.getPriceBook()-x*inf.getPriceBook()/100));
        }
}
public double addX(){
        double x = 0;
        while (true){
            System.out.println("Moi nhap phan tram giam gia: ");
            try {
                x = Double.parseDouble(sc.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Khong duoc nhap ki tụ!");
                continue;
            }
           return x;
        }
}
    public String addName() {
        String nameBook = "";
        while (true) {
            System.out.println("Moi nhap Ten Sach");
            try {
                nameBook = sc.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Ten sach khong duoc de trong");
                continue;
            }
            return nameBook;
        }
    }

    public long addPriceBook() {
        long priceBook = 0;
        while (true) {
            System.out.println("Moi nhap gia sach");
            try {
                priceBook = Long.parseLong(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Gia sach khong duoc chua chu so");
                continue;
            }
            return priceBook;
        }
    }

    public int addNamXuatBan() {
        System.out.println("Moi Nhap Nam xuat ban");
        int yearPrint = 0;
        while (true) {
            try {
                yearPrint = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập số mời nhập lại");
                continue;
            }
            return yearPrint;
        }
    }

    public String addTenTacGia() {
        System.out.println("Moi nhap thong tin tac gia");
        String nameAu = "";
        while (true) {
            try {
                System.out.print("Nhập tên tac gia : ");
                nameAu = sc.nextLine();

                if (nameAu.matches(".*\\d.*") || nameAu.matches(".*[^a-zA-Z].*")) {
                    throw new Exception("Tên không được chứa số hoặc kí tự đặc biệt.");
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            return nameAu;
        }
    }

    public Date addBirth() {
        Date birth = null;
        while (true) {
            System.out.print("Nhập ngay sinh (dd/mm/yyyy): ");

            try {
                String dateString = sc.nextLine();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                birth = dateFormat.parse(dateString);

            } catch (ParseException e) {
                System.out.println("Không thể chuyển đổi ngày! Moi Nhap Lai");
            }
            return birth;
        }
    }

}
