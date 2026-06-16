/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.LinkedList;

/**
 *
 * @author Lenovo
 */
public class MiddleOfLinkedList {
   public static class Node{
              int data;
              Node next;
              
              Node(int data){
                  this.data=data;
              }
          }
          
          public static class Linkedlist
          {
                    Node head=null;
                    Node tail=null;
                void insertAtTail(int data){
                    Node temp=new Node(data);
                    if(head==null){
                        head=temp;
                        
                    }
                    else{
                       tail.next=temp;
                        
                    }
                    tail=temp;
                }
                void display(){
                    Node temp=head;
                    while(temp!=null){
                        System.out.print(temp.data+" ");
                        temp=temp.next;
                    }
                    System.out.println("");
                }
        public Node middleNode() {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
                
          }
                
     public static void main(String[] args) {
            Linkedlist l=new Linkedlist();
            l.insertAtTail(2);
            l.insertAtTail(3);
            l.insertAtTail(4);
            l.insertAtTail(5);
            l.display();
           Node ans= l.middleNode();
           System.out.println(ans.data);
    }
}

