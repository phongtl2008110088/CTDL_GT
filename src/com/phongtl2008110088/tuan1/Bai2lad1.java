package com.phongtl2008110088.tuan1;

import java.util.Scanner;

public class Bai2lad1 {
    public static void main(String[] args) {
        int dai, rong;
        int CV, DT;
        Scanner canh = new Scanner(System.in);
        System.out.print("Nhập chiều rộng của hình CN: ");
        rong = canh.nextInt();
        System.out.print("Nhập chiều dài của hình CN: ");
        dai = canh.nextInt();
        CV = (dai + rong)*2;
        DT = dai*rong;
        System.out.printf("Chu vi của hình CN là: %d \n", CV);
        System.out.printf("Diện tích cua hình CN là: %d \n", DT);
        System.out.printf("Cạnh nhỏ của hình chữ nhật: %d", Math.min(dai, rong));
        canh.close();
    }
    
}
