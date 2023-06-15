package progress_test_1;

import java.util.Scanner;

public class QuanLy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do diem A: ");
        Point B = new Point(0, 0);
        Point A = new Point(3, 4);
//        double xA = scanner.nextDouble();
//        double yA = scanner.nextDouble();
//        Point A = new Point(xA, yA);
        A.display();
//        Point B = new Point();
        double distanceAB = A.distance(B);
        System.out.println("Khoang cach AB la: " + distanceAB);
        Circle circleA = new Circle(A, 2);
        Circle circleB = new Circle(B, 3);
        if (circleA.isOuterContact(circleB)) {
            System.out.println("Two circles " + circleA.toString() + " and " + circleB.toString() + " are in outer contact");
        }
    }
}