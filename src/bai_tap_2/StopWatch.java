package bai_tap_2;

import java.util.Calendar;

public class StopWatch {
    private int startTime;
    private int endTime;

    public StopWatch(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public static int start() {
        Calendar now = Calendar.getInstance();
        int m = now.get(Calendar.MINUTE);
        int s = now.get(Calendar.SECOND);
        return m * 60 + s;
    }
    public static int end() {
        Calendar now = Calendar.getInstance();
        int m = now.get(Calendar.MINUTE);
        int s = now.get(Calendar.SECOND);
        return m * 60 + s;
    }

    public static int getElapsedTime(int a[]) {
        int indexMin, i, j;
        start();
        // lap qua ta ca cac so
        for (i = 0; i < a.length - 1; i++) {
            // thiet lap phan tu hien tai la min
            indexMin = i;

            // kiem tra phan tu hien tai co phai la nho nhat khong
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {

                // Trao doi cac so
                int temp = a[indexMin];
                a[indexMin] = a[i];
                a[i] = temp;
            }



        }
        end();
        return end();
    }


}
