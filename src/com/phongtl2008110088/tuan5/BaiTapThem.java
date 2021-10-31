package com.phongtl2008110088.tuan5;

public class BaiTapThem {

    String ten;
    Double diem;
   BaiTapThem(String t, Double d){
        ten = t;
        diem = d;
    }
    void inthongtin(){
        System.out.println("Tên: "+ten);
        System.out.println("Điểm trung bình: "+diem);
    }
}
