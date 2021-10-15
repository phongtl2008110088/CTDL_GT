package com.phongtl2008110088.tuan2;

import java.util.Scanner;

public class Bai1lad2 {
    public static void main(String[] args) {
        int a, b;
        double x;
        Scanner bien = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất : ");
        a = bien.nextInt();
        System.out.print("Nhập số thứ hai : ");
        b = bien.nextInt();
        if(a == 0){
            if(b == 0)
                System.out.print("Phương trình vô số nghiệm");
            else 
                System.out.print("Phương trình vô nghiệm");
        } 
        else{
            x = (double)-b/a;
            System.out.printf("Nghiệm của phương trình %dx + %d = 0 là %.2f", a, b, x);
        }
        bien.close();    
    } 
}
