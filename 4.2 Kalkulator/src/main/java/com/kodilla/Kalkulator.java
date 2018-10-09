package com.kodilla;

public class Kalkulator {
    private int a;
    private int b;

    public Kalkulator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int addition() {
        return a + b;
    }

    public int substraction() {
        return  a - b;
    }

    public static void main(String args[]) {
        Kalkulator k1 = new Kalkulator(8, 6);
        System.out.println(k1.substraction());
    }
}

