package bai_tap_1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a ");
        float a = sc.nextFloat();
        System.out.println("Nhap b");
        float b = sc.nextFloat();
        System.out.println("Nhap c");
        float c = sc.nextFloat();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if(qe.getDiscriminant()>0){
            System.out.println("Phuong trinh co 2 nghiem: " +qe.getRoot1()+"   "+ qe.getRoot2());
        } else if (qe.getDiscriminant()==0) {
            System.out.println("Phuong trinh co 1 nghiem "+ qe.getRoot1());
        }
        else {
            System.out.println("Phuong trinh deo co nghiem");
        }
    }
}
