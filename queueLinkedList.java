/*Experiment -6 
Write a Java program for performing various operations on queue using linked list AIM: 
Java program for performing various operations queue using linked list 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3:Create a structure of name node and declare variables data and link and assign data             with zero and link with null (nptr) and also assign values in another constructor and              declare required functions to get the values of data and link and (required functions)              set the values for data and link. 
Step 4: Create a class name linkedQueue and declare required function. 
Step 5: Initialize top at null and size at zero. 
Step 6: Create an obj linkedQueue for class Linked Queue Implement. 
Step 7: Display all operations to on linked Queue using switch case and choose an operation                from the user and call required function. 
Step 8: Define enqueue function by reading the elements to be inserted by the user and create               2 variables front and rear and assign the nptr value for both by creating an object, if               rear is equal to null else assign it to next of the start and adjust the pointers. 
Step 9: Define dequeue function to remove the element from front if the list is empty, thrown              on underflow exception else the adjust the nptr to remove first element. 
Step 10:Define peek function, if the list is empty throw an underflow exception else display                the first element using front data. 
Step 11:Define display function and by creating a variable and point to the start and traverse                 it using while loop until it points to null and print value at each iteration. 
Step 12:Define checkEmpty function to check whether the given list is empty or not. 
Step13: Define getSize function and create size variable and return the size of the list. Step 14:Stop. 
 */
 
//SOURCE CODE: 
import java.util.*; class Node {     protected int data;     protected Node link; 
    public Node() 
    {         link = null;         data = 0; 
    }     
    public Node(int d,Node n) 
    { 
        data = d;         link = n; 
    }     
    public void setLink(Node n) 
    {        link = n; 
    }     
    public void setData(int d) 
    {         data = d; 
    }     
    public Node getLink() 
    {         return link; 
    }     
    public int getData() 
    {         return data; 
    } 
} class linkedQueue {     protected Node front, rear;     public int size;     public linkedQueue() 
    {         front = null;         rear = null;         size = 0; 
    }     
    public boolean isEmpty() 
    {         return front == null; 
    }     
    public int getSize() 
    {         return size; 
    }     
    public void insert(int data) 
    { 
        Node nptr = new Node(data, null);         if (rear == null)         {             front = nptr;             rear = nptr;         }         else         {             rear.setLink(nptr); 
            rear = rear.getLink(); 
        } 
        size++ ; 
    }     
    public int remove() 
    {         if (isEmpty() )             throw new NoSuchElementException("Underflow Exception");         Node ptr = front;         front = ptr.getLink();                 if (front == null)             rear = null; 
        size-- ;         
        return ptr.getData(); 
    }     
    public int peek() 
    {         if (isEmpty() )             throw new NoSuchElementException("Underflow Exception");         return front.getData(); 
    }     
    public void display() 
    { 
        System.out.print("\nQueue = "); 
        if (size == 0) 
        { 
            System.out.print("Empty\n");             return ; 
        } 
        Node ptr = front;         while (ptr != rear.getLink() ) 
        { 
            System.out.print(ptr.getData()+" "); 
            ptr = ptr.getLink(); 
        } 
        System.out.println();         
    } 
} 
public class LinkedQueueImplement 
{     
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);          linkedQueue lq = new linkedQueue();                     System.out.println("Linked Queue Test\n");  
        char ch;                 do 
        { 
            System.out.println("\nQueue Operations"); 
            System.out.println("1. insert"); 
            System.out.println("2. remove"); 
            System.out.println("3. peek"); 
            System.out.println("4. check empty");             System.out.println("5. size");             int choice = scan.nextInt(); 
            switch (choice) 
            {             case 1 :  
                System.out.println("Enter integer element to insert"); 
                lq.insert( scan.nextInt() );                 break;                                      case 2 :                  try  
                { 
                    System.out.println("Removed Element = "+ lq.remove()); 
                } 
                catch (Exception e) 
                { 
                    System.out.println("Error : " + e.getMessage()); 
                }                     break;                                      case 3 :                  try 
                { 
                    System.out.println("Peek Element = "+ lq.peek()); 
                } 
                catch (Exception e) 
                { 
                    System.out.println("Error : " + e.getMessage()); 
                }                 break;                                      case 4 :  
                System.out.println("Empty status = "+ lq.isEmpty());                 break; 
              case 5 :  
                System.out.println("Size = "+ lq.getSize());                 break;   
              default :  
                System.out.println("Wrong Entry \n ");                 break; 
            }                 
            lq.display(); 
  
            System.out.println("\nDo you want to continue (Type y or n) \n");             ch = scan.next().charAt(0);             
        } while (ch == 'Y'|| ch == 'y');                                                                 }  
} 
 
