package com.phongtl2008110088.tuan8;

public class StackTestDrive {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(7.5, "Nguyễn Văn A");
        stack.push(5.4, "Nguyễn Văn B");
        NodeSinhVien temp;
        temp = stack.peek();
        temp.inthongtin();
        stack.print();
        System.out.println("Lấy ra");
        temp = stack.pop();
        temp.inthongtin();
        System.out.println("Lấy ra");
        temp = stack.pop();
        temp.inthongtin();
    }
}
