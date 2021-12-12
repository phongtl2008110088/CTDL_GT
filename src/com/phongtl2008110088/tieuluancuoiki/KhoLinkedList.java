package com.phongtl2008110088.tieuluancuoiki;

import java.util.Scanner;

public class KhoLinkedList {
    Node head = null;
    Node tail = null;
    Node current;
    Node previous;
    HangHoa hanghoa;
    Node hangHoa = new Node();
    Scanner sc = new Scanner(System.in);

    public void addFirst() {
        // hàng thêm đầu ds
        HangHoa hangHoa = new HangHoa();
        Node newHangHoa = new Node(hangHoa);
        newHangHoa.hangHoa.nhapthongtin();
        if (head == null) {
            head = newHangHoa;
            tail = newHangHoa;
        } else {
            newHangHoa.next = head;
            head = newHangHoa;
        }
    }

    public void addLast() {
        HangHoa hangHoa = new HangHoa();
        Node newHangHoa = new Node(hangHoa);
        newHangHoa.hangHoa.nhapthongtin();
        if (head == null) {
            head = newHangHoa;
            tail = newHangHoa;
        } else {
            tail.next = newHangHoa;
            tail = newHangHoa;
        }
    }

    public void in() {
        Node current = head;
        if (head == null) {
            System.out.println("Danh sách trống");
        } else {
            while (current != null) {
                current.hangHoa.inThongTin();
                current = current.next;
            }
        }
    }

    Node timloai(String key) {
        Node current = head;
        if (head.hangHoa.loai == key) {
            return head;
        }
        while (current != null) {
            if (key == current.next.hangHoa.loai)
                return current;
        }
        return null;
    }
    Node timgia(double key){
        Node current = head;
        if(head.hangHoa.gianhap == key){
            return head;
        }
        while (current != null){
            if(key ==  current.next.hangHoa.gianhap)
            return current;
        }
        return null;
    }
    Node timngaynhap(String key){
        Node current = head;
        if(head.hangHoa.ngaynhapkho == key){
            return head;
        }
        while(current != null){
            if(key == current.next.hangHoa.ngaynhapkho)
            return current;
        }
        return null;
    }

    public void removeFist() {
        
        if (head == null) {
            System.out.println("Danh sách trống");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        
        Node current = head;
        if (head.next == null) {
            removeFist();
            return;
        }
        while (current != null) {
            if (current.next == tail) {
                tail = current;
                current.next = null;
                return;
            }
            current = current.next;
        }
    }
    public void sua(){}

    public void sapxeptd(){
    }

    public void sapxepgd(){}

    public void thongketongsoluong(){}

    public void thongketonggiatri(){}

    public void soluongtungloai(){}

}
