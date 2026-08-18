package dsa.Stack;
public class ArrayImplementation { 
    public static class Stack { 
        int[] arr = new int[5]; 
        int n = arr.length; 
        int idx = 0; 

        
        void push(int x) { 
            if (idx == n) {
                System.out.println("Stack is Full");
                return; 
            }
            arr[idx] = x; 
            idx++; 
        } 

        
        int pop() { 
            if (idx == 0) { 
                System.out.println("Stack is empty"); 
                return -1; 
            } 
            int top = arr[idx - 1]; 
            arr[idx - 1] = 0; 
            idx--; 
            return top; 
        } 

        
        int peek() { 
            if (idx == 0) { 
                System.out.println("Stack is empty"); 
                return -1;
            } 
            return arr[idx - 1]; 
        } 

        
        boolean isEmpty() { 
            return idx == 0; 
        } 

        
        boolean isFull() { 
            return idx == n; 
        } 

        
        void display() { 
            for (int i = 0; i < idx; i++) { 
                System.out.print(arr[i] + " "); 
            } 
            System.out.println(""); 
        } 
    } 

    public static void main(String[] args) { 
        Stack st = new Stack(); 
        st.push(10); 
        st.push(20); 
        st.push(30); 
        st.push(40); 
        st.push(50); 
        st.display(); 
        
        st.pop();     
        System.out.println(st.peek()); 
        
        st.pop();     
        System.out.println(st.peek()); 
    } 
}
