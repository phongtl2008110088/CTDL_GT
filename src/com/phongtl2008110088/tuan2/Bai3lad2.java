package com.phongtl2008110088.tuan2;

import java.util.Scanner;

public class Bai3lad2 {
    public static void main(String[] args) {
        int soDien, tienDien;
        Scanner soLieu = new Scanner(System.in);
        System.out.print("Số điện sử dụng trong tháng là: ");
        soDien = soLieu.nextInt();
        if(soDien < 50){
            tienDien = soDien*1000;
            System.out.printf("Số tiền điện là %d", tienDien);
        }
        else{
            tienDien = 50*1000 + (soDien - 50)*1200;
            System.out.printf("Só tiền điện là %d", tienDien);
        }
        soLieu.close();
    }
    
}
