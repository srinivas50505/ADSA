/*Experiment -1 
 
   Write a java program to perform various operations in Singly Linked List. 
 
AIM: 
               Java program to perform various operations in Singly Linked List. 
 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a structure of name node and declare structure variables. 
Step 4: Create a class name linked list and declare required functions. 
Step 5: Initialize start and end to null inside constructor. 
Step 6: Create an object for class Singly Linked List. 
Step 7: Display all operations on linked list using switch case and choose on operation from the user and call required function.  
Step 8: Create node function by creating 2 variables link, data. Assign link as NULL and data as  "Zero" and return link and data to display the values of it. 
Step 9: Define insertAtStart function by reading the elements to be inserted from the user and create 2 variables start and end and assign the values (nptr) to start, if start is equal to null else assign it to next of start and adjust pointers.  
Step 10:Define insertAtEnd function by reading the elements to be Inserted at last from the user and create 2 variables and create new object and traverse the list until null and assign the  value to the end. 
Step 11:Define  insertAtPos function by reading element to be inserted and its position from the user and create 3 variables and create new object and move the pointer to the required position and insert the node at that position. 
Step 12:Define delete function by reading position of the value to be deleted and create two variables and read the position and delete the element at the position.  
Step 13:Define check Empty function to check whether the given list is empty or not. 
Step 14:Define getSize function and create size variable and return the size of the list. 
Step 15:Define display funtion by creating a variable and point to the start and traverse it using while loop until it points to NULL and print value at each iteration. 
Step 16:Stop 
*/



import java.util.Scanner;
 class Node{
 protected int data;
protected Node link;
 public Node()
 {
 link = null;
data = 0;
 }
 public Node(int d,Node n)
 {
 data = d;
 link = n;
 }
 public void setLink(Node n)
 {
 link = n;
 }
 public void setData(int d)
 {
 data = d;
 }
 public Node getLink()
 {
 return link;
 }
 public int getData()
 {
 return data;
 }
}
class linkedList
{
 protected Node start;
 protected Node end ;
 public int size ;
 public linkedList()
 {
 start = null;
 end = null;
 size = 0;
 }
 public boolean isEmpty()
 {
 return start == null;
 }
 public int getSize()

 {
 return size;
 }
 public void insertAtStart(int val)
 {
 Node nptr = new Node(val, null);
 size++ ;
 if(start == null)
 {
 start = nptr;
 end = start;
 }
 else
 {
 nptr.setLink(start);
 start = nptr;
 }
 }
 public void insertAtEnd(int val)
 {
 Node nptr = new Node(val,null);
 size++ ;
 if(start == null)
 {
 start = nptr;
 end = start;
 }
 else
 {
 end.setLink(nptr);
 end = nptr;
 }
 }
 public void insertAtPos(int val , int pos)
 {
 Node nptr = new Node(val, null);
 Node ptr = start;
 pos = pos - 1 ;
 for (int i = 1; i < size; i++)
 {
 if (i == pos)
 {
 Node tmp = ptr.getLink() ;
 ptr.setLink(nptr);
 nptr.setLink(tmp);
 break;
 }
 ptr = ptr.getLink();
 }
 size++ ;
 }
 public void deleteAtPos(int pos)
 {
 if (pos == 1)
 {
 start = start.getLink();
 size--;
 return ;
 }
 if (pos == size)
 {
 Node s = start;
 Node t = start;
 while (s != end)
 {
 t = s;
 s = s.getLink();
 }
 end = t;
 end.setLink(null);
 size --;
 return;
 }
 Node ptr = start;
 pos = pos - 1 ;
 for (int i = 1; i < size - 1; i++)
 {
 if (i == pos)
 {
 Node tmp = ptr.getLink();
 tmp = tmp.getLink();
 ptr.setLink(tmp);
 break;
 }
 ptr = ptr.getLink();
 }
 size-- ;
 }
 public void display()
 {
 System.out.print("\nSingly Linked List = ");
 if (size == 0)
 {
 System.out.print("empty\n");
 return;
 }
 if (start.getLink() == null)
 {
 System.out.println(start.getData() );
 return;
 }
 Node ptr = start;
 System.out.print(start.getData()+ "->");
 ptr = start.getLink();
 while (ptr.getLink() != null)
 {
 System.out.print(ptr.getData()+ "->");
 ptr = ptr.getLink();
 }
 System.out.print(ptr.getData()+ "\n");
 }
}
public class SinglyLinkedList1
{
 public static void main(String[] args)
 {
 Scanner scan = new Scanner(System.in);
 linkedList list = new linkedList();
 System.out.println("Singly Linked List Test\n");
 char ch;
 do
 {
 System.out.println("\nSingly Linked List Operations\n");
 System.out.println("1. insert at begining");
 System.out.println("2. insert at end");
 System.out.println("3. insert at position");
 System.out.println("4. delete at beginning");
 System.out.println("5. delete at end");
 System.out.println("6. delete at position");
 System.out.println("7. check empty");
 System.out.println("8. get size");
 System.out.println("9. display");
 int choice = scan.nextInt();
 switch (choice) {
 case 1 :
 System.out.println("Enter integer element to insert");
 list.insertAtStart( scan.nextInt() );
 break;
 case 2 :
 System.out.println("Enter integer element to insert");
 list.insertAtEnd( scan.nextInt() );
 break;
 case 3 :
 System.out.println("Enter integer element to insert");
 int num = scan.nextInt() ;
 System.out.println("Enter position");
 int pos = scan.nextInt() ;
 if (pos <= 1 || pos > list.getSize() )
 System.out.println("Invalid position\n");
 else
 list.insertAtPos(num, pos);
 break;
 case 4 :
 list.deleteAtPos(1);
 break;
 case 5 :
 list.deleteAtPos(list.getSize());
 break;
 case 6 :
 System.out.println("Enter position");
 int p = scan.nextInt() ;
 if (p < 1 || p > list.getSize() )
 System.out.println("Invalid position\n");
 else
 list.deleteAtPos(p);
 break;
 case 7 :
 System.out.println("Empty status = "+ list.isEmpty());
 break;
 case 8 :
 System.out.println("Size = "+ list.getSize() +" \n");
 break;
 case 9: break;
 default :
 System.out.println("Wrong Entry \n ");
 break;
 }
 list.display();
 System.out.println("\nDo you want to continue (Type y or n) \n");
 ch = scan.next().charAt(0);
 } while (ch == 'Y'|| ch == 'y');
 }
} 
