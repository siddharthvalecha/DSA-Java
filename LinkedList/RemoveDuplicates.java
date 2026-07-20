//83. Remove Duplicates from Sorted List  https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/


package dsa.LinkedList;

public class RemoveDuplicates {
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
               public static Node deleteDuplicates(Node head) { 
            if (head == null) { 
                return null; 
            } 
            Node curr = head; 
            while (curr.next != null) { 
                if (curr.data == curr.next.data) { 
                    curr.next = curr.next.next; 
                } else { 
                    curr = curr.next; 
                } 
            } 
            return head; 
        } 
       
                
          }
                
     public static void main(String[] args) {
            Linkedlist l=new Linkedlist();
             l.insertAtTail(2); 
        l.insertAtTail(2); 
        l.insertAtTail(3); 
        l.insertAtTail(4); 
        l.insertAtTail(4); 
        l.insertAtTail(5); 
        
        System.out.print("Original List: ");
        l.display(); 
        
        
        l.head = Linkedlist.deleteDuplicates(l.head); 
        
        System.out.print("After Removing Duplicates: ");
        l.display();
    }
}

