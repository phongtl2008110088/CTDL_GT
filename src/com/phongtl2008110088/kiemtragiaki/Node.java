package com.phongtl2008110088.kiemtragiaki;

public class Node {
     // Nội dung
     int maId ;
     double khoiLuong ;
     String màu ;
     // Liên kết đén nút tiếp theo
     Node next ; // Biến tham chiếu kiểu Node

     public Node(){} // hàm tạo rỗng

     public Node(int d){  // hàm tạo 1 tham chiếu 
           maId = d ;
     }

     public Node(int id , double k){ // hàm tạo 2 tham chiếu 
         maId = id ;
         khoiLuong = k ;
     }
     public Node(int d , double k , String c , Node n){
         maId = d ;
         khoiLuong = k ;
         màu = c ;
         next = n;
     }
}
