package com.phongtl2008110088.kiemtragiuaki;

import java.util.Scanner;

public class khoAppletestdiver {
    public static KhoApple listApple = new KhoApple();
	public static Scanner bienNhap = new Scanner(System.in);
	public static void main(String[] args) {
		int chose ;
        do{
    		System.out.println("Danh Sách");
            System.out.println("1>>.Thêm sản phẩm táo ");
            System.out.println("2>>.Tìm sản phẩm táo theo màu ");
            System.out.println("3>>.In danh sách sản phẩm táo");
            System.out.println("4>>. Thoát ");
            System.out.println("");
            System.out.print("Lựa chọn chức năng: ");
            chose = bienNhap.nextInt();
        	
        	switch(chose){
        	case 1:	nhapThem();break;
        	case 2: TimKiem();break;
        	case 3: output();break;
            case 4 : System.out.println("Kết Thúc??"); break ;
        	default: break;
        	}
        }while(chose != 4);
	}
	
	public static void nhapThem() {
		listApple.them();
		System.out.println();
		System.out.println("-----------------------");
        System.out.println();
	}
	
	
	
	public static void output() {
		listApple.output();
		System.out.println();
		System.out.println("-------------------");
        System.out.println();
	}

    public static void TimKiem() {
		System.out.println("Nhập màu táo muốn tìm: ");
		bienNhap.nextLine();
		String mau = bienNhap.nextLine();
		System.out.println("Các trái táo màu Đỏ:");
		listApple.search(mau);
		System.out.println();
		System.out.println("------------------");
        System.out.println();
	} 
}
