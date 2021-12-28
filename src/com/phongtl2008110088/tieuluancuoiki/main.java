package com.phongtl2008110088.tieuluancuoiki;

import java.util.Date;
import java.util.Scanner;

public class main {

	static Scanner bienNhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	
	public static void main(String[] args) {
		
		Date a = new Date();
		
		DienMay headDM = new DienMay(1, "1", 1, a);
		SanhSu headSS = new SanhSu(2, "2", 2, a);
		ThucPham headTP= new ThucPham(3, "3", 3, a);
		    
		DienMay DM1 = new DienMay(4, "4", 4, a);
		headDM.next = DM1;
		SanhSu SS1 = new SanhSu(5, "5", 5, a);
		headSS.next = SS1;
		ThucPham TP1 = new ThucPham(6, "6", 6, a);
		headTP.next = TP1;
		
		DienMay DM2 = new DienMay(7, "7", 7, a);
		DM1.next = DM2;
		SanhSu SS2 = new SanhSu(8, "8", 9, a);
		SS1.next = SS2;
		ThucPham TP2 = new ThucPham(9, "9", 9, a);
		TP1.next = TP2;
		
		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		
		
		while (true){
        	System.out.println();
    		System.out.println("____________MENU____________");
            System.out.println("1)  Them san pham		");
            System.out.println("2)  In thong tin san pham	");
            System.out.println("3)  Xoa san pham    ");
            System.out.println("4)  Tim hang hoa   		");
            System.out.println("5)  Thong ke hang hoa    ");
            System.out.println("6)  Thoat  ");
            System.out.print("Vui long chon chuong trinh: ");
            int key = bienNhap.nextInt();
            
            switch(key){
        	case 1:	ThemHang(kho);break;
        	case 2:	InThongTin(kho);break;
        	case 3:	XoaHang(kho);break;

        	case 4:	TimHang(kho);break;
        	case 5:	ThongKeKho(kho);break;
        	default: break;
        	}
		}
	}
	
	public static void ThemHang(KhoHang kho) {
		kho.ThemHang(bienNhap);
	}
	
	public static void InThongTin(KhoHang kho){
		kho.InTT();
	}
	
	public static void XoaHang(KhoHang kho) {
		kho.XoaHang(bienNhap);
	}
	
	public static void TimHang(KhoHang kho) {
		kho.TimHang(bienNhap);
	}
	
	public static void ThongKeKho(KhoHang kho) {
		kho.ThongKe(bienNhap);
	}
}