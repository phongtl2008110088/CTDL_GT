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
        System.out.println("Nhap loai: ");
        loai = sc.nextLine();
        System.out.println("Nhap ID: ");
        mahang = sc.nextInt();
        System.out.println("Nhap ten : ");
        sc.nextLine();
        tenhanghoa = sc.nextLine();
        System.out.println("Nhap gia: ");
        gianhap = sc.nextDouble();
        System.out.println("Nhap so luong ton kho: ");
        soluongtonkho = sc.nextInt();
        System.out.println("Ngay nhap hang : ");
        sc.nextLine();
        ngaynhapkho = sc.nextLine();

    }

    void inThongTin(){
        System.out.println("loai: " + loai);
        System.out.println("id: " + mahang);
        System.out.println("ten hang: " + tenhanghoa);
        System.out.println("gia san pham: " + gianhap);
        System.out.println("ton kho: " + soluongtonkho);
        System.out.println("ngay nhap kho: " + ngaynhapkho);
    }

}
