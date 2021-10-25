package com.phongtl2008110088.kiemtragiuaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhoApple {
    public List<Apple> list ;

    public KhoApple(){
        list = new ArrayList<Apple>();
    }
    public void them(){
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Nhập khối lượng sản phẩm Táo : ");
        double khoiluong = bienNhap.nextDouble();

        System.out.println("Nhập vào màu sản phẩm táo :");
        bienNhap.nextLine();
        String mau =bienNhap.nextLine();

        list.add(new Apple(list.size(),khoiluong,mau));
        System.out.println();

    }
    public void output(){
        for (Apple x : list) {
            x.inThongTin();
        }
        System.out.println();
        System.out.println("----------------");
        System.out.println();
    }
    public void search(String mau){
    int  bienDem = 0 ;
    for (Apple x : list) {
        if(x.mau.equals(mau)){
            bienDem ++ ;
            x.inThongTin();
        }
    }
    if(bienDem == 0){
        System.out.println("Danh sách tìm không ra màu này "+mau);
    }
    System.out.println();
    System.out.println("--------------------");
    System.out.println();
    }
}
