package com.phongtl2008110088.tuan5;
import java.util.ArrayList;
import java.util.Scanner;

public class SVGDUTestDriver {
    static Scanner nhap = new Scanner(System.in);
    static ArrayList<SVGDU> DSSV = new ArrayList<>();
    public static void main(String[] args) {
        int chon;
        do{
            System.out.println("--------------MENU--------------");
            System.out.println("1. Nhập thông tin sinh viên.");
            System.out.println("2. Xuất danh sách đã nhập.");
            System.out.println("3. Xuất danh sách theo khoảng điểm.");
            System.out.println("4. Tìm sinh viên.");
            System.out.println("5. Tìm và sửa thông tin.");
            System.out.println("6. Tìm và xóa thông tin.");
            System.out.println("7.Thoát Chương Trình!");
            System.out.print("Nhập vào sự lựa chọn: ");
            chon = nhap.nextInt();
            switch(chon){
                case 1: 
                        nhap();
                        break;
                case 2: 
                        xuatDS();
                        break;
                case 3:
                        xuatTheoDiem();
                        break;
                case 4: 
                        tim();
                        break;
                case 5: 
                        timVaSua();
                        break;
                case 6: 
                        timVaXoa();
                        break;
                case 7:
                        System.out.println("Thoát Chương Trình!");
                        break;
                default: 
                        System.out.println("Lựa chonj không hợp lệ");

            }
            System.out.print("Quay lại MENU(1:Y/0:N): ");
            chon = nhap.nextInt();
        }while(chon == 1);

    }
    static void nhap(){
        int chon;
        do{
                System.out.println("Nhập thông tin sinh viên: ");
                SVGDU sv = new SVGDU();
                sv.nhapThongTin();
                DSSV.add(sv);
                System.out.print("Nhập thêm(1:Y/0:Y): ");
                chon = nhap.nextInt();
                nhap.nextLine();
        }while(chon == 1);
    }
    static void xuatDS(){
        for(SVGDU x : DSSV){
            x.inThongTin();
        }
    }
    static void xuatTheoDiem(){
        System.out.print("Nhập điểm thấp nhất: ");
        double thapNhat = nhap.nextDouble();
        System.out.print("Nhập điểm cao nhất: ");
        double caoNhat = nhap.nextDouble();
        System.out.println("Danh sách sinh viên trong khoảng " +thapNhat+ "đến" +caoNhat+ "là: ");
        for(SVGDU x : DSSV){
                if(x.diemTB >= thapNhat && x.diemTB <=caoNhat){
                        x.inThongTin();
                }
        }
    }
    static void tim(){
        System.out.print("Nhập tên sinh viên cần tìm: ");
        nhap.nextLine();
        String hoTen = nhap.nextLine();
        for(SVGDU x : DSSV){
                if(x.hoVaTen.contains(hoTen)){
                        System.out.println("Thông tin sinh viên cần tìm");
                        x.inThongTin();
                }
        }  
    }
    static void timVaSua(){
        System.out.print("Nhập tên sinh viên cần sửa điểm: ");
        nhap.nextLine();
        String hvt = nhap.nextLine();
        for(SVGDU x : DSSV){
                if(x.hoVaTen.contains(hvt)){
                        System.out.print("  + Nhập điểm mới: ");
                        x.diemTB = nhap.nextDouble();
                        System.out.println("-----Sau khi sửa-----");
                        x.inThongTin();
                }
        }
    }
    static void timVaXoa(){
            System.out.print("Nhập tên sinh viên cần xóa: ");
            nhap.nextLine();
            String ht = nhap.nextLine();
            for(SVGDU x : DSSV){
                    if(x.hoVaTen.equals(ht)){
                        DSSV.remove(x);
                        System.out.println("Xóa thành công!");
                        break;
                    }
            }

    }
}
