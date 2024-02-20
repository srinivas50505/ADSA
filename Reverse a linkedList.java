import java.util.Scanner;
public class ReverseList
{
class Node
{
int data;
Node link;
}
public Node(int data)
{
this.data = data;
this.link = null;
}
}
public Node head = null;
public Node tail = null;
public void create(int data)
{
Node newNode = new Node(data);
if(head == null)
{
head = newNode;
tail = newNode;
}
Else
{
tail.link = newNode;
tail = newNode;
}
}
public void reverse()
{
Node prev = null;
Node current = head;
Node next = null;
while (current != null)
{
next = current.link;
current.link = prev;
prev = current;
current = next;
}
head = prev;
}
public void display()
{
Node current = head;
if(head == null)
{

 System.out.println("List is empty");
return;
}
while(current.link != null)
{
System.out.print(current.data + "-->");
current = current.link;
}
System.out.print(current.data);
System.out.println();
}
public static void main(String[] args)
{
ReverseList sList = new ReverseList();
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
sList.display();
sList.reverse();
System.out.println("Reversed list: ");
sList.display();
}
} 
