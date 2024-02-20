/*Experiment -2 
Write a java program for the following. a)Reverse a linkedList AIM: 
Java program to reverse a linked list. 
ALGORITHM: 
Step 1: Start 
Step 2: Declare required header files. 
Step 3: Create a class name ReverseList and declare required functions. 
Step 4:Create a structure of name Node and declare structure variables (data, link) and  initialize data and with data using this pointer and link with null inside the constructor node. 
Step 5: And initialize the head 2 tail to null inside the Node Constructor 
Step 6: Create a new node using add Node() and check whether the list is empty or not. Step 7: If the list is empty, assign head and tail to the new node. or else new node will be     added  after tail such that tail's next will point to new node. Then new Node will               become new tail of the list. 
Step 8:Define reverse function and assign previous to null and current to head and next to null.And if the current is not equal to null, assign next = current & current to prev &  prev to current to reverse the linked link and assign current to next. Next make head                as prev. 
Step9: Define display function by creating a variable and point to the start and traverse if  using while loop until it points to NULL and print value of reversed linked loop at each iteration. 
Step10: Stop 
 */



//SOURCE CODE: 
import java.util.Scanner; public class ReverseList { class Node { int data; Node link; } public Node(int data) { this.data = data; this.link = null; 
} } public Node head = null; public Node tail = null; public void create(int data) 
{ 
Node newNode = new Node(data); if(head == null) 
{ head = newNode; tail = newNode; } 
Else { tail.link = newNode; tail = newNode; 
} } public void reverse() { 
Node prev = null; 
Node current = head; Node next = null; while (current != null) { next = current.link; current.link = prev; prev = current; current = next; } head = prev; } public void display() { Node current = head; if(head == null) 
{ 
       System.out.println("List is empty"); return; } 
while(current.link != null) 
{ 
System.out.print(current.data + "-->"); current = current.link; 
} 
System.out.print(current.data); 
System.out.println(); 
} 
public static void main(String[] args) 
{ 
ReverseList sList = new ReverseList(); Scanner scan = new Scanner(System.in); int size; 
System.out.println("Enter size of single linked list"); size=scan.nextInt(); 
System.out.println("Enter single linked list values"); for(int i=0;i<size;i++) 
{ 
sList.create( scan.nextInt() ); 
} 
System.out.println("Original list: "); sList.display(); sList.reverse(); 
System.out.println("Reversed list: "); sList.display(); 
} 
} 
