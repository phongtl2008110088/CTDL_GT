package com.phongtl2008110088.tieuluancuoiki;

import java.util.Date;
import java.util.Scanner;

public class SanhSu {
	int ma;
	String ten;
	float gia;
	Date ngayNhapKho;
	
	SanhSu next;
	
	SanhSu(){
		
	}
	
	SanhSu(int _id, String _ten, float _gia, Date _ngayNhapKho){
		ma = _id;
		ten = _ten;
		gia = _gia;
		ngayNhapKho = _ngayNhapKho;
	}
	
	public void NhapTT(Scanner scanner) {
		
		scanner.nextLine();
		System.out.print("Nhap ten san pham: ");
		ten = scanner.nextLine();
		
		System.out.print("Hay nhap gia san pham: ");
		gia = scanner.nextFloat();
		
		ngayNhapKho = new Date();
	}
	
	public void inTT() {
		System.out.println("Ten : " +ten+ ", Loai : Sanh su, Id: " +ma+ ", Gia: " +gia+ ", Ngay nhap: "+ngayNhapKho);
	}
	
	public String GetName() {
		System.out.println(ten);
		return ten;
	}

}
