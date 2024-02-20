/*
 
Experiment -11 
Write a Java program to implement Quick Sort of given elements. AIM: 
Program to implement Quick Sort of given elements using to Java 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a class QuickSortLinkedList and define required functions.  
Step 4: Create a node structure and declare data and next pointer. 
Step 5: Create a constructor for node and Initialize using  this pointer. 
Step 6: Define addNode function and by considering elements from the user, if the head is                  equal to null, initialize new elements for it and define print list to print all the               elements. by considering from first and last node but do not break any links in the               whole linked list. 
Step 7: Define partionList and iterate till one before the end, no need to iterate till the end               because end is pivot keep track of last modified item. Swap the position of current               ie. next suitable Index and pivot, and return one previous to current because current               is now pointing to pivot. 
Step 8: Define sort and split list and partion recurse ,if pivot is picked and moved to the start,              that means start and pivot is same, so pick from next of pivot. It pivot is in between               of the list, start from next, of pivot, since we have pivot, prev so we move two nodes. Step 9: Display the sorted elements using main method and by Considering before sorted                  and after sorted data.  
Step10:Stop. 

SOURCE CODE: */
public class QuickSortLinkedList {  	static class Node { 
 	 	int data;  	 	Node next;  
 	 	Node(int d) 
 	 	{ 
 	 	 	this.data = d; 
 	 	 	this.next = null; 
 	 	} 
 	} 
 	Node head; 
 	void addNode(int data) 
 	{ 
 	 	if (head == null) { 
 	 	 	head = new Node(data); 
 	 	 	return; 
 	 	} 
 
 	 	Node curr = head; 
 	 	while (curr.next != null) 
 	 	 	curr = curr.next; 
 	 	Node newNode = new Node(data); 
 	 	curr.next = newNode; 
 	} 
 	void printList(Node n) 
 	{ 
 	 	while (n != null) {  	 	 	System.out.print(n.data);  	 	 	System.out.print(" "); 
 	 	 	n = n.next; 
 	 	} 
 	} 
 	Node paritionLast(Node start, Node end) 
 	{ 
 	 	if (start == end || start == null || end == null) 
 	 	 	return start; 
 	 	Node pivot_prev = start;  	 	Node curr = start;  	 	int pivot = end.data;  	 	while (start != end) {  	 	 	if (start.data < pivot) { 
 	 	 	 	pivot_prev = curr;  	 	 	 	int temp = curr.data;  	 	 	 	curr.data = start.data;  	 	 	 	start.data = temp; 
 	 	 	 	curr = curr.next; 
 	 	 	} 
 	 	 	start = start.next; 
 	 	} 
 	 	int temp = curr.data;  	 	curr.data = pivot;  	 	end.data = temp; 
 	 	return pivot_prev; 
 	} 
 	void sort(Node start, Node end) 
 	{ 
 	 	if(start == null || start == end|| start == end.next ) 
 	 	 	return; 
 	 	Node pivot_prev = paritionLast(start, end);  	 	sort(start, pivot_prev);  	 	if (pivot_prev != null && pivot_prev == start)  	 	 	sort(pivot_prev.next, end); 
 	 	else if (pivot_prev != null&& pivot_prev.next != null)  	 	 	sort(pivot_prev.next.next, end); 
 	} 
         public static void main(String[] args) 
 	{ 
 	 	QuickSortLinkedList list= new QuickSortLinkedList(); 
 	 	list.addNode(30);  	 	list.addNode(3);  	 	list.addNode(4);  	 	list.addNode(20);  	 	list.addNode(5);   	 	Node n = list.head;  	 	while (n.next != null) 
 	 	 	n = n.next;  
 	 	System.out.println("Linked List before sorting"); 
 	 	list.printList(list.head);   	 	list.sort(list.head, n);  
 	 	System.out.println("\nLinked List after sorting"); 
 	 	list.printList(list.head); 
 	} 
} 

 
