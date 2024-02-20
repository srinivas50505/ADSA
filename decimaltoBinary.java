 /*
7c) Obtain the binary number for a given decimal number AIM: 
Java  program to implement the binary number for a given decimal number 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a structure of name node and declare structure variables. 
Step 4: Create a class linked Stack and declare required functions. 
Step 5: Initialize link and data inside the constructor and declare required functions to get               and assign data and link. 
Step 6: Define push function and create an object nptr and intialize top as nptr if top its equal               to null else create a element as top for nptr and assign the nptr to top and increase the               size. 
Step 7:Define рор function and the data is empty in the list,display an underflow exception              or initialize top element to nptr and decrease the size and assign the top element to get              the data and return the ptr. 
Step 8: Define peek function and if the list is empty throw an underflow exception message               and if the data is present in the link, display top element using the function getData. Step 9: Define display function by creating a variable ptr and traverse it using while loop               until it points to null and print value at each iteration. 
Step 10:Create a class InttoBin and by considering input from the user, and perform divide                 by 2 algorithm and store the value and display it using display function. 
 
EXPECTED OUTPUT: 
 */
//SOURCE CODE: 
import java.util.*; class Node{     protected int data;     protected Node link; 
    public Node() 
    {         link = null;         data = 0; 
    }     
    public Node(int d,Node n) {         data = d; 
         link = n; 
    }     
    public void setLink(Node n) { 
        link = n; 
    }     
    public void setData(int d){ 
        data = d; 
    }     
    public Node getLink() {         return link; 
    }     
    public int getData(){         return data; 
    } 
}  class linkedStack{     protected Node top ;     protected int size ;     public linkedStack() {         top = null;         size = 0; 
    }     
    public boolean isEmpty(){ 
        return top == null; 
    }     
    public int getSize() {         return size; 
    }     
    public void push(int data){         Node nptr = new Node (data, null); 
        if (top == null)             top = nptr;         else{             nptr.setLink(top);             top = nptr; 
        }         size++ ; 
    }     
    public int pop()  { 
        if (isEmpty() )             throw new NoSuchElementException("Underflow Exception") ;         Node ptr = top;         top = ptr.getLink();         size-- ; 
        return ptr.getData(); 
    }     
    public int peek() 
    {         if (isEmpty() )             throw new NoSuchElementException("Underflow Exception") ;         return top.getData(); 
    }     
 
    public void display() {         System.out.print("\nStack = "); 
        if (size == 0)  
        { 
            System.out.print("Empty\n");             return ; 
        } 
        Node ptr = top; 
        while (ptr != null) 
        { 
            System.out.print(ptr.getData()+" "); 
            ptr = ptr.getLink(); 
        } 
        System.out.println();         
    } }  
public class InttoBin{     
    public static void main(String[] args)  {         Scanner scan = new Scanner(System.in);            linkedStack ls = new linkedStack();           
        	 	int num=scan.nextInt(); 
                while (num != 0){ 
              	int d = num % 2;               	ls.push(d); 
              	num /= 2; 
         	}  
 	 	System.out.print("\nBinary equivalent = "); 
        while (!(ls.isEmpty() )) 
        { 
            System.out.print(ls.pop()); 
        } 
        System.out.println();  
    } 
} 

 
