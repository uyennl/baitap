package bai_tap_1;

import java.util.Scanner;

public class QuadraticEquation {
    private float a;
    private float b;
    private float c;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public float getDiscriminant(){
        return (float) (Math.pow(b,2)-4*a*c);
    }
    public float getRoot1(){
        return (float) (-b+Math.sqrt(getDiscriminant()))/2*a;
    }
    public float getRoot2(){
        return (float) (-b-Math.sqrt(getDiscriminant()))/2*a;
    }



}
