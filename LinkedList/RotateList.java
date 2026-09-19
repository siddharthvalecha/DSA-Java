//61. Rotate List https://leetcode.com/problems/rotate-list/description/
package dsa.LinkedList;


class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class RotateList {
    
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null) return null;
        int n=1;
        ListNode tail=head;
        while(tail.next!=null){
            n++;
            tail=tail.next;
        }
        int count=1;
        k%=n;
        ListNode temp=head;
        if(k==0) return head;
        while(temp!=null){
            if(count==n-k) break;
            temp=temp.next;
            count++;
        }
        tail.next=head;
        ListNode res=temp.next;
        temp.next=null;
        return res;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RotateList obj=new RotateList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.println("Original List:");
        printList(head);

        ListNode rotatedHead = obj.rotateRight(head, k);

        System.out.println("Rotated List (k = " + k + "):");
        printList(rotatedHead);
    }
}
