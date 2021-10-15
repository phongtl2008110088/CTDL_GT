package com.phongtl2008110088.tuan2;

import java.util.Scanner;


public class Bai2lad2 {
    public static void main(String[] args) {
        int a, b, c;
        double x1, x2, delta;
        Scanner heSo = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất : ");
        a = heSo.nextInt();
        System.out.print("Nhập số thứ hai : ");
        b = heSo.nextInt();
        System.out.print("Nhập số thứ ba : "); 
        c = heSo.nextInt();
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
}
