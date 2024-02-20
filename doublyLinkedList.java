/*
 
Experiment -3 
Write a java program to perform various operations in doubly Linked List AIM: 
To perform various operations on doubly linked list using java program. 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a class named dlinked list and create a node named as head and tail and                Initialize the variables and pointer in it. Create a construct node and initialize the                 values for it. 
Step 4: Create a function insertBeg and create an object and initialize head and tail to the               same object if the head is equal to null else assign it to the next of start and adjust               pointers. 
Step 5: Define function insertEnd and create an object and by reading the elements to be                inserted at end from the user and create a variable temp inserted values user and                traverse the list until the null and assign the value to the end. 
Step 6: Define function insertPos by reading element to be inserted and its position from the              user and create variable and create a object and move the pointer to the required               position and insert the node at that pointer. 
Step 7: Define function deteleBeg and by Considering the list. if the list is empty throw an              exception and if the list is not empty assign head pointer to it's next. 
Step 8: Define function deleteEnd and the list entered by the by the user it empty display an               empty message if not traverse it until the end and delete the value at end. 
Step 9: Define function deletePos and the list entered by the user is empty display an empty              message if not traverse until the position entered by the user and delete the value. Step 10:Define display function by creating a variable and point it to the start and traverse it                using while loop until it points to the null and print value at each iteration. Step 11:Stop. 
 */
//SOURCE CODE: 
import java.lang.*; import java.io.*; import java.util.Scanner; class dlinkedlist 
{ 
 	node head;  	node tail; 
 	class node 
 	{ 
 	int data;  	node next;  	node prev;   	node(int val) 
 	{ 
 	data=val;  	next=null;   	prev=null; 
 	} 
 	} 
public void insertbeg(int x) 
{ node p= new node(x);  if( head==null) { head=p; tail=p; } else 
{ 
       p.next=head;         head.prev=p;        head=p; } return; } 
public void insertend(int x) 
{ 
  	  node p=new node(x); 
 	node temp; 
 
{ 	if( head==null) 
 	head=p; 
 
} else { 	tail=p; 
 	tail.next=p; 
 	p.prev=tail; 
 	tail=p; 
} } 
public void insertpos(int x, int pos) 
{ 
 	int count=1; 
 	node temp=head; 
 	node p= new node(x); 
 
{ 	if(head==null) 
 	head=p; 
 
} else { 	tail=p; 
 	if(pos==1) 
 	insertbeg(x); 
 	else 
{ 
while(count<pos-1 && temp.next!=null){ 
 	temp=temp.next; count=count+1; 
} 
 	p.next=temp.next; 
temp.next.prev=p; 
 	p.prev=temp; 
temp.next=p; 
} 
} } public void display(node t){ 
node temp=t; 
 	System.out.print("Start->"); while(temp!=null){ System.out.print(temp.data+"->"); 
 	temp=temp.next; 
} 
System.out.print("null\n"); 
} public int deletebeg(){ int x1=0; if(head==null){ 
System.out.println("linked list is empty\n"); 
} 
else{ 
 	x1=head.data; 
       head=head.next; 
 	if(head!=null) 
     head.prev=null; } return x1; } public int deleteend(){ int x1=0; node temp=null; node temp1=null; if(head==null) 
System.out.println("linked list is empty"); else{ temp=tail.prev; x1=tail.data; temp.next=null; tail=temp; } return x1; } public int deletepos(int pos){ int count=1; node temp=head; int x1=0; if(head==null) 
System.out.println("linked list is empty\n"); else{ if(pos==1) deletebeg(); else{ while(count<pos-1 && temp.next!=null){ temp=temp.next; 
count=count+1; 
} x1=temp.next.data; temp.next=temp.next.next; if(temp.next!=null) temp.next.prev=temp; 
} } return x1; 
} } class dll{ public static void main(String[] args) { dlinkedlist l=new dlinkedlist(); int c, x=0; char ch; 
Scanner sc=new Scanner(System.in); while(true){ 
System.out.println("1.  insertbeg"); 
System.out.println("2. insertend"); 
System.out.println("3. insertpos"); 
System.out.println("4. deletebeg"); 
System.out.println("5. deletetend"); 
System.out.println("6. deletepos"); 
System.out.println("7.display"); System.out.println("8..exit"); c=sc.nextInt(); switch(c){ case 1:System.out.println("enter value");              l.insertbeg(sc.nextInt()); 
 	      break; 
case 2: System.out.println("enter value");              l.insertend(sc.nextInt()); 
 	       break; 
case 3: System.out.println("enter value and position");  	      l.insertpos(sc.nextInt(), sc.nextInt()); 
 	       break; 
case 4: x=l.deletebeg(); 
            System.out.println("deleted element is"+x);             break; 
case 5: x=l.deleteend(); 
              System.out.println("deleted element is"+x);                break; 
case 6:     System.out.println("enter the position");  	 x=l.deletepos(sc.nextInt()); 
 	System.out.println("deleted element is"+x);                    break; 
case 7: l.display(l.head); 
 	        break; 
case 8: System.exit(0); 
} 
} 
} 
} 
 
