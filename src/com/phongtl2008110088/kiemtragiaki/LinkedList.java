package com.phongtl2008110088.kiemtragiaki;

public class LinkedList {
    Node  head = null;
    Node tail = null ; 

    Node  node = new Node();

    public LinkedList(){}

    void add(int data){
        Node newNode = new Node(data);
        if(head == null ){

            head = newNode ;
            tail = newNode ;
        }else { 
              tail.next = newNode ;
              tail = newNode ;
        }
    }

    void addFirst (){
        Node newNode = new Node();
        if(head == null ) {

            head = newNode ;
            tail = newNode ;
         }
        else { 
              newNode.next = head  ;
              head = newNode ;
        }
   }
   void print(){
    Node current = head ;

    if(head == null){
        System.out.println("Danh sách rỗng ");
        return  ;
    }
    System.out.println("Các nút trong danh sách ");
    while(current != null){
       System.out.println(current.maId);
       current = current.next ;
    }
}
    void removeTail(){
        Node temp = head ;
        while(temp != null){
            if(temp.next ==tail){
                temp.next=null ;
                tail = temp ;
                break ;
            }
            temp = temp.next ;
        }

    }
}
