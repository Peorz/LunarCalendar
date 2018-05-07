package com.xhinliang.lunarcalendar;

/**
 * @author xhinliang
 */
@SuppressWarnings("WeakerAccess")
public class Lunar extends Gregorian {
    public boolean isLeap;

    Lunar(int y, int m, int d) {
        super(y, m, d);
    }

    @Override
    public String toString() {
        return "Lunar{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
