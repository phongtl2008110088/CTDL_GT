package com.phongtl2008110088.tuan4;

import java.util.ArrayList;
import java.util.Scanner;
    public class Bai1lad4 {
    public static void main(String[] args) {
        double b;
        String a;
        double tong = 0;
        Scanner n = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while(true){
            System.out.printf("Nhập phần tử thứ %d: ", list.size());
            b = n.nextDouble();
            list.add(b);
            n.nextLine();
                 break;
        }
        System.out.println("-Các phần tử của danh sách-");
        for(Double x : list){
            System.out.printf("+ %.2f\n", x);
            tong += x;
        }
        System.out.println("Tổng các phần tử là: tổng = " + tong);
        n.close();
    }
}
