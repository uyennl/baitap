package bai_tap_2;

import java.util.Calendar;
import java.util.Random;

public class Test {



    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        int a[] = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < 100000; i++) {
            a[i] = rand.nextInt(1000000);
        }

    }



}
