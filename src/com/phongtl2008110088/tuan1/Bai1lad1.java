package com.phongtl2008110088.tuan1;

import java.util.Scanner;


public class Bai1lad1 {
    public static void main(String[] args) {
        String hoVaTen;
        Double diemTB;
        Scanner thongTin = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        hoVaTen = thongTin.nextLine();
        System.out.print("Điểm trung bình: ");
        diemTB = thongTin.nextDouble();
        System.out.printf("%s: %.2f điểm", hoVaTen, diemTB);
        thongTin.close();
    }
    
} 
