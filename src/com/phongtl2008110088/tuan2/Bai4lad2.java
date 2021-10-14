package com.phongtl2008110088.tuan2;

import java.util.Scanner;

public class Bai4lad2 {
  public static void main(String[] args) {
        int d;
        Scanner luaChon = new Scanner(System.in);
        System.out.println("----------MENU----------");
        System.out.println(">>1: Giải phương trình bậc 1.");
        System.out.println(">>2: Giải phương trình bậc 2.");
        System.out.println(">>3: Tính tiền điện.");
        System.out.print("Nhập vào sự lựa chọn(1>>3): " );
        d = luaChon.nextInt();
        switch(d) {
            case 1: giaiPTBac1(); break;
            case 2: giaiPTBac2(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Lựa chọn không hợp lệ!!!");
        }
        luaChon.close();
    } 

    static void giaiPTBac1() {
        Scanner bien = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = bien.nextInt();
        System.out.print("Nhập b = ");
        int b = bien.nextInt();
        if(a == 0){
            if(b == 0)
                System.out.print("Phương trình vô số nghiệm");
            else 
                System.out.print("Phương trình vô nghiệm");
        } 
        else{
            double x = (double)-b/a;
            System.out.printf("Nghiệm của phương trình %dx + %d = 0 là %.2f", a, b, x);
        }
        bien.close();
    }
    static void giaiPTBac2() {
        double x1, x2, delta;
        Scanner heSo = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = heSo.nextInt();
        System.out.print("Nhập b = ");
        int b = heSo.nextInt();
        System.out.print("Nhập c = ");
        int c = heSo.nextInt();
        if(a == 0){
            if(b == 0){
                if(c == 0)
                    System.out.print("Phương trình vô số nghiệm.");
                else
                    System.out.print("Phương trình vô nghiệm");
            }
            else{
                x1 = (double)-c/b;
                System.out.printf("Phương trình có nghiệm là x = %.2f", x1);
            }
        }
        else{
            delta = Math.pow(b, 2) - 4*a*c;
            if(delta > 0){
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                x1 = (double)(-b + Math.sqrt(delta))/2*a;
                System.out.printf("+ x1 = %.2f", x1);
                x2 = (double)(-b - Math.sqrt(delta))/2*a;
                System.out.printf("+ x2 = %.2f", x2);
            }
            else{
                if(delta < 0)
                    System.out.printf("Phương trình vô nghiệm");
                else{
                    x1 = x2 = (double)-b/2*a;
                    System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f", x1);
                }
            }
        } 
        heSo.close();
    }
    static void tinhTienDien(){
        int soDien, tienDien;
        Scanner soLieu = new Scanner(System.in);
        System.out.print("Số điện sử dụng trong tháng là: ");
        soDien = soLieu.nextInt();
        if(soDien < 50){
            tienDien = soDien*1500;
            System.out.printf("Số tiền điện là %d", tienDien);
        }
        else{
            tienDien = 50*1500 + (soDien - 50)*1000;
            System.out.printf("Số tiền điện là %d", tienDien);
        }
        soLieu.close();
            
    }
    
}
