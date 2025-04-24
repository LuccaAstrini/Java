package com.mycompany.mavenproject1;

public class Ext {

    private int a;

    static class Int {

        private int b;

        public void c() {
            new Ext().a = 2;
            b = 3;
        }
    }

    public void d() {
        a = 4;
        new Int().b=5;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
