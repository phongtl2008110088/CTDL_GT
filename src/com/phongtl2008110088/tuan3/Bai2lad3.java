package com.phongtl2008110088.tuan3;

public class Bai2lad3 {
    public static void main(String[] args) {
        int n;
        int dem = 0;
        for(int i = 1;i <= 10;i++)
            for(int j = 1;j < 10;j++)
            {
                n = i * j;
                System.out.printf("%dx%2d=%2d  ", j, i, n);
                dem++;
                if(dem % 9 == 0)
                    System.out.print("\n");
		}
    }
} 
