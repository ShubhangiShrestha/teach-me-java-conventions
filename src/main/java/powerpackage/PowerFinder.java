package main.java.powerpackage;

public class PowerFinder {
    public static int OF(int base, int power) {
        int value = 1;
        for (int i = 0; i<power; i++) {
            value *= base;
        }
        return value;
    }
}
