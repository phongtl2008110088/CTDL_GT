package com.phongtl2008110088.tuan1;

import java.util.Scanner;


public class Bai4lad1 {
    public static void main(String[] args) {
        int theTich;
        int canh1;
        Scanner canh = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        canh1 = canh.nextInt();
        theTich = canh1*canh1*canh1;
        System.out.printf("Thể tích của khối lập phương là: %d", theTich);
        canh.close();
        
    }
    
}
