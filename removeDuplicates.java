
/*2c) Removing duplicates AIM: 
Java program to Remove the duplicates in Singly Linked List 
ALGORITHM: 
Step 1: Start 
Step 2: Declare required header files. 
Step 3: Create a class name Remove Duplicate and declare required functions. 
Step 4:Create a structure of name node and declare structure variables. 
Step 5 : Initialize data with data using this pointer and link with null inside the constructor               node. 
Step 6:Create a new node using addNode function and check whether the list is empty or              not. 
Step 7: If the list is empty assign head and tail to the new node or else new node will be               added after tail such that tail's next will point to new node. Then new node will               become tail of  the list. 
Step 8: Define removeDuplicate function and initialize current node as head and index as               null,  and traverse it using while loop until the previous node (temp) is equal to the               current to (temp) node. If it is equal to the current node remove the node and print the              values until the Next  becomes null. 
Step 9: Define display function by creating a variable and point to the start and traverse it               using while loop, until it points to NULL and print the values, after removing the               duplicates in  each iteration. 
Step10: Stop. 
*/


SOURCE CODE: 
import java.util.Scanner;  public class RemoveDuplicate {   
    class Node{           int data;           Node next;           public Node(int data) {               this.data = data;               this.next = null;   
        }   
    }   
    public Node head = null;       public Node tail = null     public void create(int data) {           Node newNode = new Node(data);   
        if(head == null) {               head = newNode;   
            tail = newNode;   
        }   
        else {               tail.next = newNode;   
            tail = newNode;   
        }   
    }   
    public void removeDuplicate() 
 {   
        Node current = head, index = null, temp = null;   
        if(head == null) {               return;      }           else 
 {   
    while(current != null){                   temp = current                 index = current.next;                   while(index != null) {                        if(current.data == index.data) {   
                        temp.next = index.next;   
                    }                       else {                           temp = index;   
                    }   
                    index = index.next;   
                }   
                current = current.next;   
            }   
        }   
    }   
    public void display() {           Node current = head;           if(head == null) {   
            System.out.println("List is empty");               return;   
        }   
        while(current.next != null)  
            System.out.print(current.data + "--> ");               current = current.next;   
        }   
	 	System.out.print(current.data); 
        System.out.println();   
    }   
    public static void main(String[] args)  
{   
        RemoveDuplicate sList = new RemoveDuplicate();    	Scanner scan = new Scanner(System.in);  	int size; 
 	System.out.println("Enter size of single linked list");         size=scan.nextInt(); 
	 	System.out.println("Enter single linked list values"); 
	 	for(int i=0;i<size;i++) 
	 	{ 
                sList.create( scan.nextInt() );   
	 	} 
        System.out.println("Originals list: ");   
        sList.display();           sList.removeDuplicate();   
        System.out.println("List after removing duplicates: ");           sList.display();   
    }   
}   
