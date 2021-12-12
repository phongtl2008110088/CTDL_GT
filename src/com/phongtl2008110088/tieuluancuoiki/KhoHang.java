package com.phongtl2008110088.tieuluancuoiki;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoHang {
    static ArrayList<HangHoa> qList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void Nhap(){
        while(true){
            HangHoa hangHoa = new HangHoa();
            hangHoa.nhapthongtin();
            sc.nextLine();
            qList.add(hangHoa);

            System.out.println("Nhập Thềm (y/n): ");
            if(sc.nextLine().equals("n"))
            break;
        }
    }

    public void xuat(){
        for(HangHoa x: qList){
            x.inThongTin();
        }
    }
    static void tim(){
        for(HangHoa x : qList){
            System.out.println("nhập loại cần tìm: ");
            if(sc.nextLine() == x.loai){
                x.inThongTin();
                break;
            }
        }
    }
}
