package bai_tap_7;

import checked_input.Input;
import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class EmployerManager {
    ArrayList<Employer> arrE = new ArrayList<Employer>();
    Scanner sc = new Scanner(System.in);
    public void addNurse() {
        String id = Input.enterValidId("Mời nhập id Nhân viên", true);
        String name = Input.enterValidName("Mời nhập tên nhan viên", true);
        String phone = Input.enterValidPhoneNumber("Mời nhập số điện thoại chủa bạn", true);
        String gmail = Input.enterGmail("Mời nhập gmail của bạn");
        float coefficients = Input.enterValidFloat("Mời nhập hệ số lương");
        String possition = Input.enterValidName("Mời nhập position của y tá",true);
        int timeOH = Input.enterValidInteger("Mời nhâph time OH",false,false);
        Nurse n = new Nurse(id, name, phone, gmail, coefficients,possition,timeOH);
        n.setSalary(n.salary());
        arrE.add(n);

    }

    public void addDocter() {
        String id = Input.enterValidId("Mời nhập id Nhân viên", true);
        String name = Input.enterValidName("Mời nhập tên nhan viên", true);
        String phone = Input.enterValidPhoneNumber("Mời nhập số điện thoại chủa bạn", true);
        String gmail = Input.enterGmail("Mời nhập gmail của bạn");
        float coefficients = Input.enterValidFloat("Mời nhập hệ số lương");
        int level = Input.enterValidInteger("Nhập level của nhân viên",false,false);
        String possition = Input.enterValidName("Mời nhập position của bác sĩ",true);
        double possitionall = Input.enterValidDouble("Nhập possition allowance");
        Doctor d = new Doctor(id, name, phone, gmail, coefficients,possition,level,possitionall);
        d.setSalary(d.salary());
        arrE.add(d);
    }
public void display(){
    System.out.println("Thông tin y tá");
    arrE.forEach(e -> {
        if (e instanceof Nurse) {
            System.out.println(e.toString());
        }
    });
    System.out.println("Thông tin bác sĩ");
    arrE.forEach(e -> {
        if (e instanceof Doctor) {
            System.out.println(e.toString());
        }
    });
}
    public void printHighestSalaryEmployee() {
        if (arrE.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }

        Employer highestSalaryEmployee = arrE.stream().max(Comparator.comparing(e -> Double.valueOf(e.getSalary()).doubleValue())).get();

        System.out.println("Thông tin nhân viên có mức lương cao nhất:\n" + highestSalaryEmployee.toString());
    }
    public void create() {
        String[] op = {"Create Doctor", "Create Nurse", "3. Exit"};
        MenuGeneric<String> otherMenu = new MenuGeneric<String>("Create", op) {
            @Override
            public boolean execute(int choice) {
                switch (choice) {
                    case 1:
                        addDocter();
                        break;
                    case 2:
                        addNurse();
                        break;
                    case 3:
                        return true;
                    default:
                        break;
                }
                return false;
            }
        };
        otherMenu.run();


    }
}
