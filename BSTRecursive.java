
/*ALGORITHM (Recursive) : 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a structure name Node and declare required variables let, left and right. Step 4: Create a function for the node and create an object for it and declare and  assign               required  variables and initiative it to null. 
Step 5: Define insert function for the particular node and by considering element from the                   user and point to start traversing from root and traverse downward path to search               where the new node to be inserted. If the root is null for the tree is empty the new                node is the root node. If the new nock element/key ft. less than the leaf node key,               assign the new node to be it's left child else assign the new node its right child, return               the pointer where the bow node is inserted. 
Step 6: Define delete function and by considering the root and prev traverse it until the                element was found which need to deleted and delete the particular key, if the                element was not found to be deleted, display an error message. 
Step 7: Define search method and by considering input from the user which element should               be found by traveling every location by using stack push every key in it and  check               whether the key is present or not. if the key found, display in message. 
Step 8: Define Inorder and create a stack obj(node) and initialize the root to current data. By                   considering the input from the user, the data should  be inserted in the order of left,                key and right.  
Step 9: Define Preorder and create a stack object (node) and Initialize the root to current                 data.  By considering the different inputs the to from the user place the keys in the                  stack and insert in the order of day right, left. 
Step 10: Define Postorder and create a stack object (node) and initialize  the root to current                 data and by considering the inputs current by from the user, place the keys in the                 stack by using push operation to insert and after investing in the tree, delete the key                 using pop operations in the order of left, right, 
Step 11:Define is Empty function to check whether the data present in binary search tree.. Step 12:Display all those functions using main and enter proper choice and data for the                proper binary search tree. 	 
 */
//SOURCE CODE: 
import java.lang.*; import java.util.Stack; import java.util.Scanner; class BSTiter 
{ static class Node {     int key; 
     Node left, right; 
}; 
static Node newNode(int data) 
{ 
    Node temp = new Node();  
    temp.key = data;      temp.left = null;     temp.right = null;      return temp; } 
static Node insert(Node root, int key) 
{ 
    Node newnode = newNode(key); 
    Node x = root;     Node y = null;      while (x != null) {         y = x;         if (key < x.key)             x = x.left;         else             x = x.right; 
    }     if (y == null)         y = newnode;      else if (key < y.key) 
        y.left = newnode;      else 
        y.right = newnode;      return y; } 
static Node delete(Node root,int ele) 
{ 
   Node curr=root;    Node prev=null; 
 	while(curr!=null && curr.key!=ele) 
 	{ 
 	    prev=curr;  	     if(ele<curr.key) 
 	          curr=curr.left;  	     else 
 	           curr=curr.right; 
 	} 
 	if(curr==null) 
 	{ 
 	 	System.out.println(ele+" Element not found");  	 	return root; 
 	} 
 	if(curr.left==null||curr.right==null) 
 	{ 
 	 	Node newCurr; 
 	 	 if (curr.left == null) 
                  newCurr = curr.right; 
        	 	 else 
                 newCurr = curr.left; 
 	    if (prev == null) 
            return newCurr; 
 	 	if (curr == prev.left) 
            prev.left = newCurr;         else             prev.right = newCurr;  
 	} 
 	else { 
        Node p = null;         Node temp;         temp = curr.right;         while (temp.left != null) {             p = temp; 
            temp = temp.left; 
        }          if (p != null) 
            p.left = temp.right;          else             curr.right = temp.right; 
  
        curr.key = temp.key; 
    }     return root; }  
static void search(Node root,int ele) 
{ 
 	int flag=0; 
 	 
 	if(root==null) 
 	{ 
 	 	System.out.println("Binary tree is empty"); 
 	 	return; 
 	} 
 	Stack <Node> s=new Stack <Node>(); 
 	Node curr=root; 
 	while(curr!=null||s.size()>0) 
 	{ 
 	 	while(curr!=null) 
 	 	{ 
 	 	 	s.push(curr);  	 	 	curr=curr.left; 
 	 	} 
 	 	curr=s.pop();  	 	if(curr.key==ele) 
 	 	{ 
 	 	 	flag=1; 
 	 	 	System.out.println("Element "+ele+" found ");                         return; 
 	 	} 
 	 	curr=curr.right; 
 	} 
 	if(flag==0) 
 	System.out.println("Element not found"); 
} 
static void Inorder(Node root) 
{ 
 	if(root==null) 
 	{ 
 	 	return; 
 	} 
 	Stack <Node> s=new Stack <Node>();  	Node curr=root; 
 	while(curr!=null||s.size()>0) 
 	{ 
 	 	while(curr!=null) 
 	 	{ 
 	 	 	s.push(curr); 
 	 	 	curr=curr.left; 
 	 	} 
 	 	curr=s.pop(); 
 	 	System.out.print(curr.key+" "); 
 	 	curr=curr.right; 
 	} 
} 
static void Preorder(Node root) 
    {          if (root == null) {             return; 
        } 
        Stack<Node> nodeStack = new Stack<Node>(); 
        nodeStack.push(root);          while (nodeStack.empty() == false) {             Node mynode = nodeStack.peek();             System.out.print(mynode.key + " "); 
            nodeStack.pop();             if (mynode.right != null) { 
                nodeStack.push(mynode.right); 
            } 
            if (mynode.left != null) { 
                nodeStack.push(mynode.left); 
            } 
        } 
    } 
static void Postorder(Node root) 
 { 
        Stack<Node> stack = new Stack<Node>();         while(true) {             while(root != null) {                 stack.push(root);                 stack.push(root);                 root = root.left; 
            } 
            if(stack.empty()) return;             root = stack.pop();              if(!stack.empty() && stack.peek() == root) root = root.right;              else {  
                System.out.print(root.key + " "); root = null; 
            } 
        } 
    }  
public boolean isEmpty(Node root) 
{ 
  return root==null; 
} 
public static void main(String args[]) 
{  
/*            50  
          /   \  
        30      70  
        / \   / \  
       20 40 60 80*/  
 	System.out.println("1.Insert\n2.delete\n3.Inorder traversal\n4.Preorder 
Traversal\n5.Postorder traversal\n6.Search\n7.IsEmpty\n8.exit");  
        Node root = null; 
 	char ch; 
 	Scanner scan=new Scanner(System.in); 
 	while(true) 
 	{ 
 	 	 System.out.println("\nEnter your choice");  	 	 int choice = scan.nextInt();  
  	 	switch (choice) 
  	 	{ 
 	 	 	case 1: 
 	 	 	 System.out.println("Enter element to insert"); 
 	 	 	  if(root==null) 
 	 	 	     root=insert(root,scan.nextInt());  	 	 	  else 
 	 	 	     insert(root,scan.nextInt());  	 	          Inorder(root); 
 	 	 	  break;  	 	 	case 2: 
 	 	 	System.out.println("Enter element to delete\n"); 
 	 	 	 	root=delete(root,scan.nextInt()); 
 	 	 	 	Inorder(root); 
 	 	 	 	break;  	 	 	case 3: 
 	 	 	System.out.println("Inorder traversal\n"); 
 	 	 	 	Inorder(root); 
 	 	 	 	break;  	 	 	case 4: 
 	 	 	System.out.println("Preorder traversal\n");  	 	 	 	Preorder(root); 
 	 	 	 	break;  	 	 	case 5: 
 	 	 	System.out.println("Postorder traversal\n"); 
 	 	 	 	Postorder(root); 
 	 	 	 	break;  	 	 	case 6: 
 	 	 	System.out.println("Enter element to search"); 
 	 	 	 	search(root,scan.nextInt()); 
 	 	 	 	break; 
 
 	 	 	case 7: 
 	 	 	boolean isempty; 
 	 	 	isempty=(root==null); 
 	 	 	System.out.println("Empty status "+isempty); 
 	 	 	 	break;  	 	 	case 8: 
 	 	 	 	System.exit(0); 
 	 	 }  
 	  }  
       } 
} 
