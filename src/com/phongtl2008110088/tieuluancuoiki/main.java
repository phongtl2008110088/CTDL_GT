package com.phongtl2008110088.tieuluancuoiki;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        KhoLinkedList qlkho = new KhoLinkedList();
        Scanner  sc = new Scanner(System.in);
        int luaChon;
        do{
            System.out.println("..................MENU...............");
            System.out.println("1. Nhập Thông Tin Sản Phẩm");
            System.out.println("2. In Thông Tin Sản Phẩm");
            System.out.println("3. Xóa Hàng Hóa");
            System.out.println("4. Sửa Thông Tin Hàng Hóa");
            System.out.println("5. Tìm Kiếm Theo Loại");
            System.out.println("6. Tìm Kiếm Theo Giá");
            System.out.println("7. Tìm Kiếm Theo Ngày Tháng");
            System.out.println("8. Sắp xếp tăng dần giá sản phẩm");
            System.out.println("9. Sắp xếp giảm dần ngày tháng của sản phẩm");
            System.out.println("10. Thống Kê Số Sản Phẩm");
            System.out.println("11. Thống Kê    Tồn Kho");
            System.out.println("12. Thống Kê Loại Sản Phẩm");
            System.out.println("13. Kết Thúc Chương Trình");
            System.out.println("    VUI LÒNG CHỌN LỰA CHỌN: ");

            luaChon = sc.nextInt();
            switch(luaChon){
                case 1: 
                System.out.println("1. Nhập Thông Tin Sản Phẩm");
                qlkho.addFirst();
                break;
                case 2:
                System.out.println("2. In Thông Tin Sản Phẩm");
                qlkho.in();
                
                break;
                case 3:
                System.out.println("3. Xóa Hàng Hóa");
                qlkho.removeFist();
                break;
                case 4:
                System.out.println("4. Sửa Thông Tin Hàng Hóa");
                qlkho.sua();
                break;
                case 5:
                System.out.println("5. Tìm Kiếm Theo Loại");
                String tim = sc.nextLine();
                if(qlkho.timloai(tim) != null){
                    System.out.println(" Sản phẩm có trong kho ");
                } else {
                    System.out.println("Không tìm thấy Sản Phẩm");
                }
                break;
                case 6:
                System.out.println("6. Tìm Kiếm Theo Giá");
                double timg = sc.nextDouble();
                if(qlkho.timgia(timg) != null){
                    System.out.println("Sản phẩm có trong kho ");
                }else {
                    System.out.println("Không tìm thấy Sản Phẩm");
                }
                break;
                case 7:
                System.out.println("7. Tìm Kiếm Theo Ngày Tháng");
                String timn = sc.nextLine();
                if(qlkho.timngaynhap(timn) != null){
                    System.out.println("Sản phẩm có trong kho");
                }else {
                    System.out.println("Không tìm thấy Sản Phẩm");
                }
                break;
                case 8:
                System.out.println("8.  Sắp xếp tăng dần giá sản phẩm");
                qlkho.sapxeptd();
                case 9:
                System.out.println("9. Sắp xếp giảm dần ngày tháng của sản phẩm");
                qlkho.sapxepgd();
                case 10:
                System.out.println("10. Thống Kê Số Sản Phẩm");
                qlkho.thongketongsoluong();
                case 11:
                System.out.println("11. Thống Kê Tồn Kho");
                qlkho.thongketonggiatri();
                case 12:
                System.out.println("12. Thống Kê Loại Sản Phẩm");
                qlkho.soluongtungloai();
                case 13:
                System.out.println("13. Kết Thúc Chương Trình");
                System.exit(0);
                break;
                    
            }
            System.out.println("Quay lại chương trình (1.Y 2.N) ");
            luaChon = sc.nextInt();
            
            
        } while(luaChon != 0);
    }
}
