package com.phongtl2008110088.tuan4;

import java.util.Scanner;

public class SanPham {
    String tenSP;
    double gia;
    int nhap;
    Scanner n = new Scanner(System.in);

    SanPham(String t, double g){
        tenSP = t;
        gia = g;
    }
    void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Giá: " +gia);
        System.out.println("__________________________________");
    }
    
}
