package dsa.LinkedList;

public class LinkedListCycle {
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
        public boolean hasCycle() {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }
                
          }
                
     public static void main(String[] args) {
            Linkedlist l=new Linkedlist();
            l.insertAtTail(2);
            l.insertAtTail(3);
            l.insertAtTail(4);
            l.insertAtTail(5);
             l.display();

        System.out.println("Has Cycle: " + l.hasCycle());

        // Creating a cycle for testing
        l.tail.next = l.head.next; // 5 -> 3

        System.out.println("Has Cycle: " + l.hasCycle());
    }
}

