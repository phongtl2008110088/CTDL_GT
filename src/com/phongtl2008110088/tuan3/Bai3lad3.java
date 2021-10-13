package com.phongtl2008110088.tuan3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3lad3 {
    public static void main(String[] args) {
        int tong = 0;
        int dem = 0;
        double TB;
        Scanner N = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng:n = ");
        int n = N.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phân tử của mảng: ");
        for(int i = 0;i < n;i++){
            System.out.printf("+ a[%d] = ", i);
            a[i] = N.nextInt();
        }
        Arrays.sort(a);
        System.out.printf("\nMảng sau khi sắp xếp là: ");
        for(int i = 0;i < n;i++){
            System.out.printf("%3d", a[i]);
        }
        System.out.printf("\nPhần tử nhỏ nhất trong mảng là: %d\n", a[0]);
        for(int i = 0;i < n;i++){
            if(a[i] % 3 == 0){
                tong = tong + a[i];
                dem++;
            }
        }
        TB = (double)tong/dem;
        System.out.printf("Trung bình cộng các số chia hết cho 3 trong mảng là: %.2f", TB);
        N.close();
    }
}
