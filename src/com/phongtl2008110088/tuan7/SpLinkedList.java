package com.phongtl2008110088.tuan7;

public class SpLinkedList {
    NodeSP head=null;
    NodeSP tail=null;
    NodeSP current=null;
    NodeSP temp=null;
    NodeSP temp2=null;
    NodeSP temp3=null;
    public SpLinkedList(){}
    void add(double gia,String ten){
        NodeSP newNodeSP = new NodeSP(gia, ten);
        if(head==null){
            head=newNodeSP;
            tail=newNodeSP;
        }
        else{
            current=tail;
            tail.next=newNodeSP;
            tail=newNodeSP;
            tail.previous=current;
        }
    }
    void addHead(double gia,String ten){
        NodeSP newNodeSP = new NodeSP(gia, ten);
        newNodeSP.next=head;
        head.previous=newNodeSP;
        head=newNodeSP;
    }
    void addBefore(String search, double gia, String ten){
        if(search(search)==false){
            System.out.println("Không tìm thấy để thêm");
            return;
        }
        if(current==head){
            addHead(gia, ten);
        }
        else{
            NodeSP newNodeSP = new NodeSP(gia, ten);
            current.previous.next=newNodeSP;
            newNodeSP.next=current;
            current=current.previous;
            current.next.next.previous=newNodeSP;
            newNodeSP.previous=current;
        }
    }
    boolean search(String search){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.ten.equals(search)){
                result =true;
                    return result;
            }
            current=current.next;
        }
        return result;
    }
    void swap(){
        if(head.next==tail){
            tail.next=head;
            head.previous=tail;
            head=tail;
            tail=head.next;
            head.previous=null;
            tail.next=null;
        }
        else if(head.next.next==tail){
            temp=head.next;
            temp.next=head;
            head.previous=temp;
            head=temp;
            temp=head.next;
            head.previous=null;
            temp.next=tail;
            tail.previous=temp;
        }
        else if(current.next.next!=null){
            temp=current.next;
            temp2=current;
            current=current.previous;
            current.next=temp;
            temp.previous=current;
            temp.next=temp2;
            temp2.previous=temp;
            temp2.next=tail;
            tail.previous=temp2;
        }
        else {

        }
    }
    void print(){
        current= head;
        if(head==null){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("Các sản phẩm có trong danh sách:");
        while(current!=null){
            current.inthongtin();
            System.out.println();
            current=current.next;
        }
    }
}
