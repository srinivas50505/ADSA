
/*2b) Sort the data in the linked list 
  
  AIM:  program to sort the data in the linked list. 
ALGORITHM:  
Step 1: Start 
Step 2: Declare required header files. 
Step 3: Create a class name Sort List and declare required functions. 
Step 4: Create a structure of name node and declare structure variables. 
Step 5: Initialize data with data using this pointer and link with null inside the constructor               node. 
Step 6: Create a new node using addNode function and check whether the list is empty or                not. 
Step7: If the list is emply, assign head and tail to the new node or else new node will be              added  after tail such that fail's next will point to new Node. Then new node will              become new tail  of the list. 
Step8:  Define sort List function and consider the size of the elements in the linked list. Step 9: Considering the index node and the current node, if the current node data is greater                than the Index's node data, swap the data between them, using while loop traverse it                 until the  last element. 
Step 10:Define display function by creating a variable and point to the start and traverse it                using while loop until it point to NULL and print the values of sorted data in each                     iteration. 
Step11: Stop. 
 */




SOURCE CODE: 
import java.util.Scanner; 
public class SortList {     
  class Node{      
    int data;
    Node next;
    public Node(int data) {
      this.data = data; 
      this.next = null;   
        }   
    }  
    public Node head = null;
  public Node tail = null;  
  public void create(int data) {   
        Node newNode = new Node(data);    
    if(head == null) {        
      head = newNode;   
            tail = newNode;   
        }           else {     
      tail.next = newNode;   
            tail = newNode;   
        }   
    }  
    public void sortList() {    
      Node current = head, index = null;   
   int temp;          
      if(head == null) {    
        return;    
      }           else {     
        while(current != null) {     
          index = current.next;            
          while(index != null) {         
            if(current.data > index.data) {           
              temp = current.data;                 
              current.data = index.data;   
                        index.data = temp;   
                    }   
                    index = index.next;   
                }   
                current = current.next;   
            }       
        }   
    }   
       
    public void display() {    
      Node current = head;  
      if(head == null) {       
        System.out.println("List is empty");     
        return;   
        }   
        while(current.next != null)  
            System.out.print(current.data + "-->");    
      current = current.next;   
        }   
	 	    System.out.print(current.data); 
        System.out.println();   
    }   
       
    public static void main(String[] args) {   
           
        SortList sList = new SortList();    
      Scanner scan = new Scanner(System.in); 
	 	int size; 
 	System.out.println("Enter size of single linked list");   
      size=scan.nextInt(); 
	 	System.out.println("Enter single linked list values"); 
	 	for(int i=0;i<size;i++) 
	 	{ 
                sList.create( scan.nextInt() );   
	 	} 
        System.out.println("Original list: ");   
        sList.display();    sList.sortList();   
        System.out.println("Sorted list: ");   
        sList.display();   
    }   
}   
 
