/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.LinkedList;

/**
 *
 * @author Lenovo
 */
public class LinkedListImplementation {
          public static class Node{
              int data;
              Node next;
              
              Node(int data){
                  this.data=data;
              }
          }
          
          public static class Linkedlist{
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
                int size(){
                    int count=0;
                    Node temp=head;
                    while(temp!=null){
                        count++;
                        temp=temp.next;
                    }
                    return count;
                }
                void insertAtHead(int data) {
                    Node temp=new Node(data);
                    if(head==null){
                          insertAtTail(data);
                      }
                      else{
                          temp.next=head;
                          head=temp;
                      }
                 }
                void insertAtIndex(int idx,int data){
                    Node node=new Node(data);
                    Node temp=head;
                    if(idx==0){
                        insertAtHead(data);
                        return;
                    }else if(idx==size()){
                        insertAtTail(data);
                        return;
                    }
                    else if(idx<0 || idx>size()){
                        System.out.println("Wrong Index");
                        return; 
                    }
                    for (int i = 1; i <= idx-1; i++) {
                        temp=temp.next;
                    }
                    node.next=temp.next;
                    temp.next=node;
                }
                int getElement(int index){
                    Node temp=head;
                     if(index<0 || index>size()){
                        System.out.println("Wrong Index");
                        return -1; 
                    }
                    for(int i=1;i<=index;i++){
                        temp=temp.next;
                    }
                    return temp.data;
                }
            }
    public static void main(String[] args) {
            Linkedlist l=new Linkedlist();
            l.insertAtTail(2);
            l.insertAtTail(3);
            l.insertAtTail(4);
            l.insertAtTail(5);
            l.display();
            l.insertAtHead(1);
            l.display();        
            System.out.println("Size is "+ l.size());
            l.insertAtIndex(3,10);
            l.display();
            System.out.println("ANS "+l.getElement(5));
    }
    
}
