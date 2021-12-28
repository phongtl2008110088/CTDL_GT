package com.phongtl2008110088.tieuluancuoiki;

import java.util.Date;
import java.util.Scanner;

public class DienMay {
	
	int ma;
	String ten;
	float gia;
	Date ngayNhapKho;
	
	DienMay next;
	
	DienMay(){
		
	}
	
	DienMay(int _id, String _ten, float _gia, Date _ngayNhapKho){
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
		System.out.println("Ten : " +ten+ ", Loai : Dien may, Id: " +ma+ ", Gia: " +gia+ ", Ngay nhap: "+ngayNhapKho);
	}
	
	public String GetName() {
		System.out.println(ten);
		return ten;
    }  
}
