package com.phongtl2008110088.tieuluancuoiki;

import java.util.Scanner;

public class HangHoa {
    String loai;
    int mahang;
    String tenhanghoa;
    double gianhap;
    int soluongtonkho;
    String ngaynhapkho;
    public HangHoa next;

    Scanner sc = new Scanner(System.in);

    HangHoa(){
    }
    HangHoa(String l, int id, String ten, double gia, int tonkho, String date){
          loai = l;
          mahang = id;
          tenhanghoa = ten;
          gianhap = gia;
          soluongtonkho = tonkho;
          ngaynhapkho = date;
    }

    void nhapthongtin(){
        System.out.println("Nhập loai: ");
        loai = sc.nextLine();
        System.out.println("Nhập ID: ");
        mahang = sc.nextInt();
        System.out.println("Nhap ten : ");
        sc.nextLine();
        tenhanghoa = sc.nextLine();
        System.out.println("Nhập gía: ");
        gianhap = sc.nextDouble();
        System.out.println("Nhập số lượng tồn kho: ");
        soluongtonkho = sc.nextInt();
        System.out.println("Ngày nhap : ");
        sc.nextLine();
        ngaynhapkho = sc.nextLine();

    }

    void inThongTin(){
        System.out.println("type: " + loai);
        System.out.println("ID: " + mahang);
        System.out.println("name: " + tenhanghoa);
        System.out.println("price: " + gianhap);
        System.out.println("invertory quantity: " + soluongtonkho);
        System.out.println("date of entry into the warehouse: " + ngaynhapkho);
    }

}
