package com.phongtl2008110088.tuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Bai3lad4 {
    static Scanner nhap = new Scanner(System.in);
    static ArrayList<SanPham> DSSP = new ArrayList<>();
    static double gia;
    public static void main(String[] args) {
        int luaChon;
        do{
            System.out.println("---MENU---");
            System.out.println("1. Nhập danh sách sản phẩm.");
            System.out.println("2. Sắp xếp giá tăng dần và xuất ra màn hình.");
            System.out.println("3. Nhập và xóa sản phẩm.");
            System.out.println("4. Xuất giá trung bình của các sản phẩm.");
            System.out.print("- Nhập vào sự lựa chọn(1>4): ");
            luaChon = nhap.nextInt();
            switch(luaChon){
                case 1: nhap(); break;
                case 2: sapXepVaXuat(); break;
                case 3: timVaXoa(); break;
                case 4: xuatGiaTriTB(); break;
                default: System.out.println("-Lựa chọn không hợp lệ!");
            }
            System.out.print("- Quay lại MENU(1:Y(yes)/0:N(No)): ");
            luaChon = nhap.nextInt();
        }
        while(luaChon == 1);

    } 
    static void nhap(){
        int n;
        String tenSP;
        do{
            nhap.nextLine();
            System.out.print("Nhập tên sản phẩm: ");
            tenSP = nhap.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            gia = nhap.nextDouble();
            System.out.println("_________________________________");
            SanPham sp = new SanPham(tenSP, gia);
            DSSP.add(sp);
            System.out.print("nhập thêm:(1:Y(yes)/0:N(no)): ");
            n = nhap.nextInt();
        }
        while(n == 1);
        
    }  
    static void sapXepVaXuat(){
        Comparator<SanPham> comparator = new Comparator<SanPham>(){

            @Override
            public int compare(SanPham o1, SanPham o2) {

                return Double.compare(o1.gia, o2.gia);
            }
            
        };
        Collections.sort(DSSP, comparator);
        System.out.println("---Danh sách sản phâm sau khi xếp---");
        for(SanPham x : DSSP){
            x.inThongTin();
        }

    }
    static void timVaXoa(){
        System.out.print("Nhập sản phẩm muốn xóa: ");
        nhap.nextLine();
        String ten = nhap.nextLine();
        for(SanPham x : DSSP){
           if((x.tenSP).equals(ten)){
               DSSP.remove(x); 
               System.out.println("ĐÃ XÓA XONG");
               break;
           }
        }
        System.out.println("---Danh sách sản phâm sau khi xóa---");
        for(SanPham x : DSSP){
             x.inThongTin();
        }
    }
    static void xuatGiaTriTB(){
        double tong = 0;
        for(SanPham x : DSSP){
            tong += x.gia;
        }
        System.out.println("Giá trị trung bình của các sản phẩm là: "+tong/DSSP.size());
    }
}
