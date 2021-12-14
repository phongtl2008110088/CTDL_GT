package com.phongtl2008110088.tieuluancuoiki;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
        KhoLinkedList qlkho = new KhoLinkedList();
        Scanner  sc = new Scanner(System.in);
        int luaChon;
        do{
            System.out.println("..................MENU...............");
            System.out.println("1. Nhap Thong Tin San Pham");
            System.out.println("2. In Thong Tin San Pham");
            System.out.println("3. Xoa Hang Hoa");
            System.out.println("4. Sua Thong Tin Hang Hoa");
            System.out.println("5. Tim Kiem Theo Loai");
            System.out.println("6. Tim Kiem Theo Gia");
            System.out.println("7. Tim Kiem Theo Ngay Thang");
            System.out.println("8. Sap xep tang dan gia san pham");
            System.out.println("9. Sap xep giam dan ngay thang cua san pham");
            System.out.println("10.Ket Thuc Chuong Trinh");
            System.out.println("    VUI LONG CHON LUA CHON: ");

            luaChon = sc.nextInt();
            switch(luaChon){
                case 1: 
                System.out.println("1. Nhap Thong Tin San Pham");
                qlkho.addFirst();
                break;
                case 2:
                System.out.println("2. In Thong Tin San Pham");
                qlkho.in();
                
                break;
                case 3:
                System.out.println("3.Xoa Hang Hoa");
                qlkho.removeFist();
                break;
                case 4:
                System.out.println("4. Sua Thong Tin Hang Hoa");
                qlkho.sua();
                break;
                case 5:
                System.out.println("5. Tim Kiem Theo Loai");
                String tim = sc.nextLine();
                if(qlkho.timloai(tim) != null){
                    System.out.println(" Sản phẩm có trong kho ");
                } else {
                    System.out.println("Không tìm thấy Sản Phẩm");
                }
                break;
                case 6:
                System.out.println("6. Tim Kiem Theo Gia");
                double timg = sc.nextDouble();
                if(qlkho.timgia(timg) != null){
                    System.out.println("San pham co trong kho ");
                }else {
                    System.out.println("Khong tim thay San Pham");
                }
                break;
                case 7:
                System.out.println("7. Tim Kiem Theo Ngay Thang");
                String timn = sc.nextLine();
                if(qlkho.timngaynhap(timn) != null){
                    System.out.println("San pham co trong kho");
                }else {
                    System.out.println("Khong tim thay San Pham");
                }
                break;
                case 8:
                System.out.println("8. Sap xep tang dan gia san pham");
                qlkho.sapxeptd();
                case 9:
                System.out.println("9. Sap xep giam dan ngay thang cua san pham");
                qlkho.sapxepgd();

                case 13:
                System.out.println("10. Ket Thuc Chương Trinh");
                System.exit(0);
                break;
                    
            }
            System.out.println("Quay lai chương trình (1.Y 2.N) ");
            luaChon = sc.nextInt();
            
            
        } while(luaChon != 0);
    }
}
