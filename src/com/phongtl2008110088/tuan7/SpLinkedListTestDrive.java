package com.phongtl2008110088.tuan7;

import java.util.Scanner;

public class SpLinkedListTestDrive {
    public static void main(String[] args) {

        menu();
    }
    static SpLinkedList spLinkedList = new SpLinkedList();
    static Scanner scanner = new Scanner(System.in);
    static public void menu(){
        System.out.println("1>>	Nhập danh sách sản phẩm mới từ bàn phím");
        System.out.println("2>> Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3>>Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4>>	Xuất giá trung bình của các sản phẩm");
        System.out.println("5>>Thêm sản phẩm tại vị trí");
        System.out.println("6>>Kết thúc");
        System.out.print("Nhập số để thực hiện chức năng: ");
        int nhap = scanner.nextInt();
        switch(nhap){
            case 1: nhap(); break;
            case 2: xuat(); ; break;
            case 3: ; break;
            case 4: ; break;
            case 5: ; break;
            case 6: System.exit(0);
        }
    }
    static public void nhap(){
        int i=1;
        while(true){
            System.out.println("Nhập sản phẩm thứ "+i);
            System.out.print("Tên: ");
            scanner.nextLine();
            String ten = scanner.nextLine();
            System.out.print("Giá: ");
            Double gia = scanner.nextDouble();
            spLinkedList.add(gia, ten);
            System.out.print("Nhập tiếp (Y/N): ");
            if(scanner.next().equals("N")){
                menu();
                break;
            }
            i++;
        }
    }
    static public void xuat(){
        spLinkedList.print();
    }
}
    