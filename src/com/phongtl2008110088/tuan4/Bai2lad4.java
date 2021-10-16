package com.phongtl2008110088.tuan4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2lad4 {
    
    static Scanner n = new Scanner(System.in);
    static ArrayList<String> DS = new ArrayList<String>();
    public static void main(String[] args) {
        int luaChon;
        do{
            System.out.println("Danh Sách Chương Trình");
            System.out.println("1. Nhập thông tin.");
            System.out.println("2. Xuât danh sách vừa nhập.");
            System.out.println("3. Xuất danh sách ngấu nhiên.");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách.");
            System.out.println("5. Tìm và xóa họ tên.");
            System.out.println("6. Out khỏi chương trình");
            System.out.print("- Nhập vào sự lựa chọn(1->6): ");
            luaChon = n.nextInt();
            switch(luaChon){
                case 1: nhap(); break;
                case 2: xuat(); break;
                case 3: xuatNgauNhien(); break;
                case 4: sapXepVaXuatDS(); break;
                case 5: xoa(); break;
                case 6: break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.print("Quay lại MENU lựa chọn(1:yes/0:no): ");
            luaChon = n.nextInt();
        } while(luaChon == 1);
    }
    static void nhap(){
        while(true){
            System.out.print("Nhập họ và tên: ");
            n.nextLine();
            String hoTen = n.nextLine();
            DS.add(hoTen);
                break; 
        }
    }
    static void xuat(){
        System.out.println("-Danh Sách-");
        for(String x : DS){
            System.out.printf("Họ và tên: %s\n", x);
            System.out.println("__________________________");
        }
    }
    static void xuatNgauNhien(){
        Collections.shuffle(DS);
        xuat();
    }
    static void sapXepVaXuatDS(){
        Collections.sort(DS);
        Collections.reverse(DS);
        xuat();
    }
    static void xoa(){
        for(String x: DS){
            System.out.println("Nhập tên cần xóa: ");
            String hoTen = n.nextLine();
            if(x == hoTen){
                DS.remove(hoTen);
            }
        }
    }
}
