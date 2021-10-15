package com.phongtl2008110088.tuan3;

import java.util.Scanner;

public class Bai4lad3 {
    public static void main(String[] args) {
        Scanner duLieu = new Scanner(System.in);
        System.out.print("Số lợn sinh viên: ");
        int n = duLieu.nextInt();
        String ho_Ten[] = new String[n];
        double diem[] = new double[n];
        for(int i = 0;i < n;i++) {
            duLieu.nextLine();
            System.out.printf("Họ và tên sinh viên thứ %d: ", i+1);
            ho_Ten[i] = duLieu.nextLine();
            System.out.printf("Điểm sinh viên thứ %d: ", i+1);
            diem[i] = duLieu.nextDouble();
        }
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n - 1;j++){
                if(diem[i] > diem[j]){
                    double tam = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tam;
                    String tam2 = ho_Ten[i];
                    ho_Ten[i] = ho_Ten[j];
                    ho_Ten[j] = tam2;
                }
            }
        }
        System.out.printf("  Số Lợn sinh viên  ");
        for(int i = 0;i < n;i++){
            System.out.printf("\nHọ và tên: %s\n", ho_Ten[i]);
            System.out.printf("Điểm: %.2f\n", diem[i]);
            if(diem[i] >= 7.5)
                System.out.println("Xếp loại: Giỏi");
            else{
                if(diem[i] >= 6.5)
                    System.out.println("Xếp loại: Khá");
                else{
                    if(diem[i] >= 3.5)
                        System.out.println("Xếp loại: Trung Bình");
                    else{
                        if(diem[i] >= 3)
                            System.out.println("Xếp loại: Yếu");
                    }
                }
            }
        }
        duLieu.close();
    }
}
 