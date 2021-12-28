package com.phongtl2008110088.tieuluancuoiki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhoHang {
	DienMay headDienMay;
	SanhSu headSanhSu;
	ThucPham headThucPham;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
	KhoHang(){
		
	}
	
	KhoHang (DienMay _headDienMay, SanhSu _headSanhSu, ThucPham _headThucPham){
		headDienMay = _headDienMay;
		headSanhSu = _headSanhSu;
		headThucPham = _headThucPham;
	}
	
	public void ThemHang(Scanner scanner) {
		System.out.println("Vui long chon loai hang ");
		System.out.print("1/ Dien may\n");
        System.out.print("2/ Sanh Su\n");	
        System.out.print("3/ Thuc Pham\n");
        System.out.print(" Lua chon:");
		int loaiHang = scanner.nextInt();
		
		if (loaiHang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.next == null) {
					DienMay itemMoi = new DienMay();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.next == null) {
					SanhSu itemMoi = new SanhSu();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.next == null) {
					ThucPham itemMoi = new ThucPham();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}
	}
	
	
	
	int NhapId(Scanner scanner, int loaihang) {
		
		System.out.print("Hay nhap ID hang: ");
		int id = scanner.nextInt();
		
		if (loaihang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.println("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}
	
	public void InTT(){
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
		while (curDM != null) {
			curDM.inTT();
			curDM = curDM.next;
		}
		
		System.out.println();
		
		while (curSS != null) {
			curSS.inTT();
			curSS = curSS.next;
		}
		
		System.out.println();
		
		while (curTP != null) {
			curTP.inTT();
			curTP = curTP.next;
		}
		
	}
	
	public void XoaHang(Scanner scanner) {
		System.out.println("Muon xoa loai hang nao theo cach nao");
		System.out.print("1/ theo id");
        System.out.print("2/ theo ten");	
        System.out.print(" Lua chon:");
		int cachxoa = scanner.nextInt();
		
		if (cachxoa == 1) {
			System.out.print("Hay nhap Id can xoa: ");
			int idCanXoa = scanner.nextInt();
			
			if (headDienMay.ma == idCanXoa) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.ma == idCanXoa) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.ma == idCanXoa) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.ma == idCanXoa) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.ma == idCanXoa) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.ma == idCanXoa) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Xoa thanh cong");
		}
		
		if (cachxoa == 2) {
			System.out.print("Hay nhap ten can xoa: ");
			scanner.nextLine();
			String idCanXoa = scanner.nextLine();
			
			if (headDienMay.ten.equalsIgnoreCase(idCanXoa)) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.ten.equalsIgnoreCase(idCanXoa)) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.ten.equalsIgnoreCase(idCanXoa)) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.ten.equalsIgnoreCase(idCanXoa)) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.ten.equalsIgnoreCase(idCanXoa)) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.ten.equalsIgnoreCase(idCanXoa)) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Xoa Thanh Cong");
		}

		if (cachxoa == 3) {
			
		}
		
	}
	
	public void TimHang(Scanner scanner) {
		System.out.println("Muon tim  theo cach nao");
		System.out.print("1/ theo loai");
        System.out.print("2/ theo gia");
        System.out.print("2/ theo ngay nhap hang ");	
        System.out.print(" Lua chon:");
		
		int cachtim = scanner.nextInt();
		
		
		if (cachtim == 1) {
			System.out.println("Vui long chon loai hang muon tim\n  ");
		System.out.print("1/ Đien may");
        System.out.print("2/ Sanh Su");	
        System.out.print("3/ Thuc Pham");
        System.out.print(" Lua chon:");
			int loai = scanner.nextInt();
			
			if (loai == 1) {
				DienMay cur = headDienMay;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 2) {
				SanhSu cur = headSanhSu;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 3) {
				ThucPham cur = headThucPham;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}
			
			
		}else if (cachtim == 2) {
			System.out.print("Hay nhap  gia cua hang hoa ban muon tim\n Tu: ");
			float start = scanner.nextFloat();
			System.out.print("Den: ");
			float end = scanner.nextFloat();
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM != null) {
				if (curDM.gia >= start && curDM.gia <= end)
					curDM.inTT();
				curDM = curDM.next;
			}
			System.out.println();
			
			while (curSS != null) {
				if (curSS.gia >= start && curSS.gia <= end)
					curSS.inTT();
				curSS = curSS.next;
			}
			System.out.println();
			
			while (curTP != null) {
				if (curTP.gia >= start && curTP.gia <= end)
					curTP.inTT();
				curTP = curTP.next;
			}
			
		}else if (cachtim == 3) {
			System.out.println("Hay nhap khoang ngay nhap muon tim (dd-mm-yyyy)\n Từ : ");
			String date = scanner.nextLine();
			Date startDate;
			try {
				startDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Nhap sai vui long nhap lai");
				return;
			}
		}
	}
	
	public void ThongKe(Scanner scanner) {
		int tongSLHang;
		int tongSLDienMay = 0;
		int tongSLSanhSu = 0;
		int tongSLThucPham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTriDienMay = 0;
		float tongGiaTriSanhSu = 0;
		float tongGiaTriThucPham = 0;
		
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
		while (curDM != null) {
			tongSLDienMay++;
			tongGiaTriDienMay += curDM.gia;
			curDM = curDM.next;
		}
		
		while (curSS != null) {
			tongSLSanhSu++;
			tongGiaTriSanhSu += curSS.gia;
			curSS = curSS.next;
		}
		
		while (curTP != null) {
			tongSLThucPham++;
			tongGiaTriThucPham += curTP.gia;
			curTP = curTP.next;
		}
		
		tongSLHang = tongSLDienMay + tongSLSanhSu + tongSLThucPham;
		tongGiaTri = tongGiaTriDienMay + tongGiaTriSanhSu + tongGiaTriThucPham;
		
		System.out.println("Tong so luong hang hoa trong kho: " + tongSLHang + " san pham");
		System.out.println("Tong giá tien nhap kho: " + tongGiaTri + "dong\n");
		
		System.out.println("Dien may : " + tongSLDienMay + " san pham");
		System.out.println("Sanh su : " + tongSLSanhSu + " san pham");
		System.out.println("Thuc pham : " + tongSLThucPham + " san pham");
		
	}
	
	
	
}
