package test_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Uyenne
 */
public class TestFile {
    public static void testLuuFile() {
        ArrayList<Student> stdList = new ArrayList<Student>();
        stdList.add(new Student("Nguyen Van An", "DN", (float) 7.0));
        stdList.add(new Student("Nguyen Van Binh", "DN", (float) 8.0));
        stdList.add(new Student("Nguyen Van Hanh", "DN", (float) 9.0));
        stdList.add(new Student("Nguyen Van Phuc", "DN", (float) 6.0));
        boolean kq = FileIO.luuFile(stdList, "D:\\Student.txt");
        if (kq == true) {
            System.out.println("Luu file thanh cong");
        } else {
            System.out.println("Luu file that bai");
        }
    }

    public static void testReadFile() {
        String filePath = "D:\\Student1.txt";
        ArrayList<Student> stdList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String name = parts[0];
                    String address = parts[1];
                    float average = Float.parseFloat(parts[2]);
                    stdList.add(new Student(name, address, average));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student student : stdList) {
            System.out.println("Name: " + student.getName());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Average: " + student.getAverage());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        testLuuFile();
        testReadFile();
    }

}
