package ss10_dsa.exercise;

import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class MyLinkedList <E>{
    private Node head;
    private Node last;
     private  static int numNodes=0;
     private class Node<E>{
         private Node <E>next;
         private E data;
         private Node<E>  prev;
         public Node(E data){
             this.data=data;
         }
         public E getData(){
             return this.data;
         }
     }
  public MyLinkedList(){}
    public void addFirst(E e){
         if (head==null){
             this.head=new Node(e);
         }
         else {
             Node temp=head;
             head=new Node(e);
             head.next=temp;
             numNodes++;
         }
     }
    public void addLast(E e){
         if (this.head==null){
             addFirst(e);
         }
         while (true){
             Node temp=head;
             if (temp.next==null){
                 this.last=temp;
                 this.last.next=new Node(e);
                 numNodes++;
                 break;
             }
             else {
                 temp=temp.next;
             }
         }
    }
    public void add(int index,E element){
         if (head==null){
             addFirst(element);
         }
         else {
             Node temp=head;
             for (int i = 0; i <index-1&&temp.next!=null ; i++) {
                 temp=temp.next;
             }
             Node lasNode=temp.next;
             temp.next=new Node(element);
             temp.next.next=lasNode;
             numNodes++;
         }

    }
  public int size(){
         int countNode=0;
     if (head==null){
         countNode=0;
     }else {
         Node temp = head;
         countNode++;
         while (temp.next!=null){
             countNode++;
             temp=temp.next;
         }
     }
     return countNode;
     }
     public E remove(int index){
         Node saveNode;
         if (index<0||index>size()){
             throw new IndexOutOfBoundsException(" index của bạn không phù hợp với chỉ số size "+index+" và "+size());
         }
         else {
             Node temp=head;

             for (int i = 0; i <index-1&&temp.next!=null ; i++) {
                 temp=temp.next;

             }
             saveNode=temp.next;
             temp.next=temp.next.next;
             numNodes--;


         }
         return (E) saveNode.data;
     }
    public boolean remove(E element) {
         if (element==null){
             for (Node x = head; x!=null ;x=x.next ) {
                 if (x.data==null){
                     unLink(x);
                         return true;
                     }

                 }

             }else{
             for (Node x=head;x!=null;x=x.next) {
                 if (element.equals(x.data)){
                     unLink(x);
                         return true;
                     }
                 }
         }
         return false;
     }
     E unLink(MyLinkedList.Node x ){
          Node <E> prev=x.prev;
          Node   <E> next=x.next;
           E element = (E) x.data;
          if (prev==null){
              head=next;
          }else{
              head=prev;
             prev.next=null;
          }
          if (next==null){
              last=prev;
          }
          else{
              prev.next=prev;
              x.next=null;
          }
          numNodes--;
          x.data=null;
          return (E) element;

    }
    public E get (int index){
         if (index<0||index>size()){
             throw new IndexOutOfBoundsException("phần tử không phù hơp");
         }
       Node temp=head;
        for (int j = 0; j<index ; j++) {
            temp=temp.next;
        }
        return (E) temp.data;
    }
    public E getFirst(){
Node temp;
 if (head==null){
     throw new NoSuchElementException("không tìm thấy phần tử");
 }
 else {
     temp=head;

     }

        return (E) temp.data;
 }
 public E getLast(){
         Node temp;
         if (head==null){
             throw new NoSuchElementException("không tìm thấy phần tử");
         }
         else{
             for (temp=head;temp!=null;temp=temp.next) {
                 temp=last;
             }
         }
         return (E)temp.data;
 }
    }








