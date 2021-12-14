package com.phongtl2008110088.kiemtragiaki;

public class Apple {
    int id ;
    double khoiLuong ;
    String mau ;
    public Apple (int i , double k , String m){
        id = i ;
        khoiLuong = k ;
        mau = m ;
    }

    void inThongTin(){
        System.out.println("Mã sản phẩm Táo : "+id);
        System.out.println("Khối Lượng sản phẩm Táo : "+khoiLuong);
        System.out.println("Màu sắc sản phẩm táo : "+mau);
    }
}
