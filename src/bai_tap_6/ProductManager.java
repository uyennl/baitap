package bai_tap_6;

import bai_tap_5.ThongTinSach;
import checked_input.Input;
import lap4.NhanVien;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductManager {
    ArrayList<Product> arrPd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void AddMacDinh() {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Pen");
//        names.add("Book");
//        names.add("Banana");
        arrPd.add(new Product(1, "Pen", 2));
        arrPd.add(new Product(2, "Book", 2));
        arrPd.add(new Product(3, "Hat", 1));
        arrPd.add(new Product(4, "Hat", 3));
//        names.stream().map((stringName)-> {
//            for(Product p:arrPd){
//                if(p.getName().equals(stringName)){
//                    return  p;
//                }
//            }
//            return null;
//        }).forEach(p -> System.out.println(p));

    }

    public void addName() {
        System.out.println("Nhập mảng tên cần tìm");
        String checkName = sc.nextLine();
        String[] arr = checkName.split(" ");
        List<Product> lp = Arrays.stream(arr).map(s -> {
            for (Product pr : arrPd) {
                if (pr.getName().equals(s)) {
                    return pr;
                }
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
        if (lp.isEmpty()) {
            System.out.println("Không có sản phẩm phù hợp");
        } else {

            lp.forEach(p -> System.out.println(p));
        }

    }

    public void Menu() {
        int choice = 0;
        AddMacDinh();
        label:
        while (true) {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhập Thông Tin Sanr phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa thông tin sản phẩm");
            System.out.println("4. In thôn tin sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("7. Tìm danh sách sản phẩm theo mảng tên");
            System.out.println("8. Thoat chuong trinh");
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
                    Menu2();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    addName();

                    break;
                case 8:
                    break label;
                default:
                    System.out.println("So phai tu 1-7 moi ban nhap lai!");
                    break;
            }
        }
    }

    public void Menu2() {
        int choice = 0;
        label:
        while (true) {
            System.out.println("===========MENU===========");
            System.out.println("1. Tìm bằng tên");
            System.out.println("2. Tìm bằng id");
            System.out.println("3. Tìm bằng giá tiền");
            System.out.println("4. Thoat chuong trinh");
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
                    displayName();
                    break;
                case 2:
                    displayId();
                    break;
                case 3:
                    displayPrice();
                    break;

                case 4:
                    break label;
                default:
                    System.out.println("So phai tu 1-4 moi ban nhap lai!");
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
        arrPd.forEach(product -> System.out.println(product));
    }

    public ArrayList<Product> search(Predicate<Product> p) {
        ArrayList<Product> pr = new ArrayList<>();
        for (Product prc : arrPd) {
            if (p.test(prc)) {
                pr.add(prc);
            }
        }
        return pr;
    }

    public void displayName() {
        String name = Input.enterValidName("Moi nhập tên cần tìm", true);
        ArrayList<Product> search = search(p -> p.getName().equals(name));
        if (search.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu");
        } else {
            search.forEach(p -> System.out.println(p));
        }
    }

    public void displayId() {
        int id = Input.enterValidInteger("Mời nhập id cần tìm", true, true);
        ArrayList<Product> search = search(p -> p.getId() == id);
        if (search.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu");
        } else {
            search.forEach(p -> System.out.println(p));
        }
    }

    public void displayPrice() {
        double price = Input.enterValidDouble("Mời nhập giá tiền cần tìm");
        ArrayList<Product> search = search(p -> p.getPrice() == price);
        if (search.isEmpty()) {
            System.out.println("Không tồn tại dữ liệu");
        } else {
            search.forEach(p -> System.out.println(p));
        }
    }

    //    public Product seachProduct(String name) {
//        for (Product pr : arrPd) {
//            if (pr.getName().equals(name)) {
//                return pr;
//            }
//        }
//        return null;
//    }
//
//    public void displayProduct() {
//        String name = Input.enterValidName("Mời nhập tên sản phẩm: ", false);
//        Product seach = seachProduct(name);
//        if (seach == null) {
//            System.out.println("Khong tim thay ten sản phẩm");
//        } else {
//            System.out.println(seach);
//        }
//    }
//
    public void deleteProduct() {
        String name = Input.enterValidName("Mời nhập tên sản phẩm: ", false);
        ArrayList<Product> search = search(p -> p.getName().equals(name));
        if (search.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu");
        } else {
            search.forEach(p-> arrPd.remove(p));
            System.out.println("Đã xóa");
        }
    }

//        if (seach == null) {
//            System.out.println("Khong tim thấy dữ liệu của Sản phẩm! Moi ban Kiểm tra Lại");
//        } else {
//            arrPd.remove(seach);
//            System.out.println("Đã xóa");
//        }
//    }

  public void sortProduct() {
        arrPd.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        arrPd.forEach(p-> System.out.println(p));
//        Collections.sort(arrPd, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                if (o1.getId() >= o2.getId()) {
//                    return 1;
//                } else
//                    return -1;
//            }
//        });
////        for (Product pr : arrPd) {
////            System.out.println(pr);
////        }
//        arrPd.forEach(p-> System.out.println(p));
//
   }

}
