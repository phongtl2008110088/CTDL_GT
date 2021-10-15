package com.phongtl2008110088.tuan1;

import java.util.Scanner;


public class Bai3lad1 {
    public static void main(String[] args) {
        double delta;
        int a, b, c;
        Scanner heSo = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất = ");
        a = heSo.nextInt();
        System.out.print("Nhập số thứ hai = ");
        b = heSo.nextInt();
        System.out.print("Nhập sô thứ ba = ");
        c = heSo.nextInt();
        delta = Math.pow(b, 2) - 4*a*c;
        System.out.printf("Delta = %.2f", delta);
        heSo.close();
    }
     
}
