package bai_tap_6;

import bai_tap_5.ThongTinSach;
import checked_input.Input;
import lap4.NhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> arrPd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void Menu() {
        int choice = 0;
        label:
        while (true) {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhập Thông Tin Sanr phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa thông tin sản phẩm");
            System.out.println("4. In thôn tin sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("7. Thoat chuong trinh");
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
                    addProduct();
                    break;
                case 2:

                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    displayProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    break label;
                default:
                    System.out.println("So phai tu 1-7 moi ban nhap lai!");
                    break;
            }
        }
    }

    public void addProduct() {
        int id = Input.enterValidInteger("Mời nhập id sản phẩm: ", true, true);
        String name = Input.enterValidName("Mời nhập tên sản phẩm: ", true);
        double price = Input.enterValidDouble("Mời nhập giá trị sản phẩm");
        Product pr = new Product(id, name, price);
        arrPd.add(pr);
    }

    public void display() {
        for (Product pr : arrPd) {
            System.out.println(pr);
        }
    }

    public Product seachProduct(String name) {
        for (Product pr : arrPd) {
            if (pr.getName().equals(name)) {
                return pr;
            }
        }
        return null;
    }

    public void displayProduct() {
        String name = Input.enterValidName("Mời nhập tên sản phẩm: ", false);
        Product seach = seachProduct(name);
        if (seach == null) {
            System.out.println("Khong tim thay ten sản phẩm");
        } else {
            System.out.println(seach);
        }
    }

    public void deleteProduct() {
        String name = Input.enterValidName("Mời nhập tên sản phẩm: ", false);
        Product seach = seachProduct(name);
        if (seach == null) {
            System.out.println("Khong tim thấy dữ liệu của Sản phẩm! Moi ban Kiểm tra Lại");
        } else {
            arrPd.remove(seach);
            System.out.println("Đã xóa");
        }
    }

    public void sortProduct() {
        Collections.sort(arrPd, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getId() >= o2.getId()) {
                    return -1;
                } else
                    return 1;
            }
        });
        for (Product pr : arrPd) {
            System.out.println(pr);
        }

    }

}
