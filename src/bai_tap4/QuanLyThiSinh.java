package bai_tap4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThiSinh {
    Scanner sc = new Scanner(System.in);
    ArrayList<ThiSinh> arrThiSinh = new ArrayList<>();
    public void Menu() {
        int choice = 0;
        label:
        while (true) {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhập danh sách thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoát chương trình");
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break label;
                default:
                    System.out.println("So phai tu 1-6 moi ban nhap lai!");
                    break;
            }
        }

    }

    public void Menucon1() {
        int choice = 0;
        label:
        while (true) {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhập Thi sinh khoi A");
            System.out.println("2. Nhap Thi sinh khoi B");
            System.out.println("3. Nhap Thi sinh khoi C");
            System.out.println("4. Thoát chương trình");
            System.out.println("===========END===========");
            System.out.println("Nhap lua chon cua ban");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so. Moi nhap lai!");
                continue;
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break label;
                default:
                    System.out.println("Nhap so tu 1-4. Moi ban nhap lai!");
            }

        }
    }

    public int addThiSinhKhoiA() {
        int id=0;
        while (true){
            try {
                id = Integer.parseInt(sc.nextLine());
            }
        catch (NumberFormatException e){
            System.out.println("Id phai la so. Moi nhap lai!");
        }

        return id;
    }
}

}


