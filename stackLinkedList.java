/* 
Experiment -5 
Write a java program for performing various operations on stack using linked list AIM: 
Java program for performing various operations on stack using linked list  
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a structure of name node, and declare variables data and link and assign data              with zero and link with null (ptr) and also assign values in another constructor, and               declare  required functions to get the values of data and link and set the values for               data and link. 
Step 4: Create a classname linkedStack and declare required functions. 
Step 5: Initialize top as null and size as zero. 
Step 6: Create an object linked Stack for class Linked Stack Implement. 
Step 7: Display all operations on linked Stack  using switch case and choose an operation               from the user and call required function. 
Step 8: Define push function and create an object nptr and initialize top as nptr if top is equal                to null else the create a element as top for nptr and assign the nptr to top and increase               the size. 
Step 9: Define pop function and the data is empty in the list. display an underflow exception               or initialize top element to nptr and decrease the size and assign the top element to               get the data and return the ptr. 
Step 10:Define peek function and if the list empty. throw an underflow exception message                and if  the data is present in the link display top element using the function getData. Step 11:Define display function by creating it a variable ptr and traverse it using while loop                until  it points to null and print value at each iteration. 
Step 12:Stop. 
 */
 
//SOURCE CODE: 
import java.util.*; class Node {     protected int data;     protected Node link; 
    public Node() 
    {         link = null;         data = 0; 
    }     
    public Node(int d,Node n) 
    {         data = d;         link = n; 
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
} class linkedStack 
{ 
    protected Node top ;     protected int size ; 
    public linkedStack() 
    {         top = null;         size = 0; 
    }     
    public boolean isEmpty() 
    { 
        return top == null; 
    }     
    public int getSize() 
    { 
        return size; 
    }     
    public void push(int data) 
    { 
        Node nptr = new Node (data, null); 
        if (top == null)             top = nptr;         else         { 
            nptr.setLink(top);             top = nptr; 
        }         size++ ; 
    }     
    public int pop() 
    {         if (isEmpty() )             throw new NoSuchElementException("Underflow Exception") ;         Node ptr = top;         top = ptr.getLink();         size-- ; 
        return ptr.getData(); 
    }     
    public int peek() 
    {         if (isEmpty() )             throw new NoSuchElementException("Underflow Exception") ;         return top.getData(); 
    }     
    public void display() 
    { 
        System.out.print("\nStack = "); 
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
    } 
} 
public class LinkedStackImplement 
{     
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);            linkedStack ls = new linkedStack();           System.out.println("Linked Stack Test\n");           char ch;              do  
        { 
            System.out.println("\nLinked Stack Operations"); 
            System.out.println("1. push");             System.out.println("2. pop"); 
            System.out.println("3. peek"); 
            System.out.println("4. check empty");             System.out.println("5. size");                         int choice = scan.nextInt(); 
            switch (choice)  
            {             case 1 : 
                System.out.println("Enter integer element to push"); 
                ls.push( scan.nextInt() );                  break;                                      case 2 :                  try 
                { 
                    System.out.println("Popped Element = "+ ls.pop()); 
                } 
                catch (Exception e) 
                { 
                    System.out.println("Error : " + e.getMessage()); 
                }                     break;                                      case 3 :                  try 
                { 
                    System.out.println("Peek/Top Element = "+ ls.peek()); 
                } 
                catch (Exception e) 
                { 
                    System.out.println("Error : " + e.getMessage()); 
                }                 break;                                      case 4 :  
                System.out.println("Empty status = "+ ls.isEmpty());                 break;                             case 5 :  
                System.out.println("Size = "+ ls.getSize());  
                break;                             case 6 :  
                System.out.println("Stack = ");  
                ls.display();                 break;                                     default :  
                System.out.println("Wrong Entry \n ");                 break;             }            
            ls.display();             
            System.out.println("\nDo you want to continue (Type y or n) \n");             ch = scan.next().charAt(0);        
  
        } while (ch == 'Y'|| ch == 'y');                  
    } 
} 
 
 
 
 
 
 
 
 
 
