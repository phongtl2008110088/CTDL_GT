package com.phongtl2008110088.tuan3;

import java.util.Scanner;

public class Bai1lad3 {
    public static void main(String[] args) {
        int n;
        boolean kiemTra = true;
        Scanner N = new Scanner(System.in);
        System.out.print("Nhập số bất kì = ");
        n = N.nextInt();
        for(int i = 2;i < n - 1;i++){
            if(n % i == 0){
                kiemTra = false;
                break;
            }
        }
        if(kiemTra == true)
            System.out.printf("%d là số nguyên tố.", n);
        else    
            System.out.printf("%d không phải là số nguyên tố.", n);
        N.close();
     }
    
} 
