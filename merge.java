
/* 
2d) Merge two LinkedList AIM: 
Java program to merge two linked lists in single linked list 
ALGORITHM:  
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Define class MergeList and declare required functions. 
Step 4: Create a structure of name node and declare structure variables. 
Step 5: Initialize temp data as key and next data with null. 
Step 6: Create a function print List to print the linked list before merging the list. 
Step 7: Create a function Merge and initially if the first list is empty display the second list.                If the second and list is empty display the first list. If the data is present in the both                lists, merge the second list by considering the next points from the first list. Step 8: Initialize the values to list 1 and list 2 and by calling the merge function in the main              print  the merged list. 
Step 9: Stop. 

 */
 
//SOURCE CODE: 
class MergeList{     static class Node {         int data; 
        Node next; 
    }; 
    static Node newNode(int key) 
    { 
        Node temp = new Node();         temp.data = key;         temp.next = null;         return temp; 
    } 
    static void printList(Node node) 
    { 
        while (node != null) { 
            System.out.printf("%d ", node.data);             node = node.next; 
        } 
    } 
    static Node merge(Node h1, Node h2) 
    {         if (h1 == null)             return h2;         if (h2 == null)             return h1;         if (h1.data < h2.data) {             h1.next = merge(h1.next, h2); 
            return h1; 
        } 
        else {             h2.next = merge(h1, h2.next); 
            return h2; 
        } 
    } 
    public static void main(String args[]) 
 { 
        Node head1 = newNode(1);         head1.next = newNode(3);         head1.next.next = newNode(5);         Node head2 = newNode(0);         head2.next = newNode(2);         head2.next.next = newNode(4);    	System.out.println("List 1");  	printList(head1);  	System.out.println("\nList 2");  	printList(head2); 
        Node mergedhead = merge(head1, head2);    	System.out.println("\nMerged List");         printList(mergedhead); 
    } 
} 
 
