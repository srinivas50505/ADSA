/*Experiment -12 
Write a java program to implement various operations on AVL trees AIM: 
program to implement various operations on AVL trees 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3:Define class node to create a node which is empty. Declare required variables              ( data  and height), node left and right.  
Step 4: Define constructor for class Node and assign initially left and right as null and data,               height as zero, and also Initialize data with n in another constructor.  
Step 5: Create a class AVLTree 1 and initialize root as null.  
             Define height function if it, hull return -1 else return the height of the tree using t               variable. 
Step 6: Define insert function and insert the data by and assign it to root initially. Step 7:Define insert function with variables and t node, if node t is null, then t is the new              node with x in it.else if the date x is less than data in t, then insert the new node of              data in left side of t, then if the height of left.Height of right is -2 then if the given data               is less than the left data then it is LL(t), else if the is greater than root t node then               insert, now node in right side of the t node, then if the height of left - height of right               is 2, then if x is greater than data in right mode then t = RR(t) or else RL(t). T height               is max height of left & t height of right in +1 and return t. 
Step 8: Create node constructor LL. with node k2 as variable. Declare node k1 as k2. left and                k2 left is k1and k1  right  is k2. 
Step 9: Define RR constructor, as k2 is k1 right and right of k1 left of  k2 left it k1. height of                k is max height of k1 left . 
Step10: Define count_nodes, function and return the count node with root to get no. of nodes                 in the tree.  
Step11:Define getbalance to check if the tree is balanced or  If it is null, returns 0, or return                height of left free - height of right tree. 
Step12:Define Node find min to find the minimum element and traverse it to the last hode of                left subtree and return the value. 
Step13:Define count_nodes with node r and traverse every location of left and right subtree               and store the value in  l and return l. 
Step14:Define inorder function and print left, root and right element preorder function to                print root, left and right elements, postorder function to print left, right and root                element.  
Step15:Define search function of node r and val. If the given element than the root, search it                in the left subtree or if the element is greater than the root, traverse every location.                than in right subtree until the search element is found.  
Step 16:Define delete function and if root is null, return null else if the given element is less                than root data traveve to let  subtree and delete root of let  tree, else if the given                element is greater than right subtree, delete root of right subtree else if both roots are            not null. 
Step17:If left is null return right it right. I null return left if root is null, when temp is will &               the root is temp. Calculate height and declare b at and 11 equal to node,             if bal >1 and  getbalance of left <0 then returm L1 (root),             if bal >1 and get bal of left <o, then return LR (root),              if bal <-1 and getbal of right >0, then return RR. (root),             if bal-1 and getbal of right so, then return RL(root). And return root. 
Step18:Stop. 
SOURCE CODE: */
import java.util.*; class Node{ Node left,right; int data; int height; public Node() 
{ left=right=null; data=0; height=0; } public Node(int n) 
{ left=right=null; data=n; height=0; 
} 
} class AVLTree1 
{ Node root; public AVLTree1() 
{ root=null; } int height(Node t) 
{ if(t==null) return -1; else return t.height; 
} public void insert(int data) 
{ 
root=insert(data,root); 
} private Node insert(int x, Node t) 
{ if(t==null) t=new Node(x); else if(x<t.data) 
{ 
t.left=insert(x,t.left); if(height(t.left)-height(t.right)==-2) 
{ if(x<t.left.data) t=LL(t); else t=LR(t); } } else if(x>t.data) 
{ 
t.right=insert(x,t.right); if(height(t.left)-height(t.right)==2) 
{ if(x>t.right.data) t=RR(t); else t=RL(t); } } 
t.height=Math.max(height(t.left),height(t.right))+1; return t; } private Node LL(Node k2) 
{ Node k1=k2.left; k2.left=k1.right; k1.right=k2; k2.height=Math.max(height(k2.left),height(k2.right))+1; k1.height=Math.max(height(k1.left),k2.height)+1; return k1; } private Node RR(Node k1) 
{ 
Node k2=k1.right; k1.right=k2.left; k2.left=k1; k1.height=Math.max(height(k1.left),height(k1.right))+1; k2.height=Math.max(height(k2.right), k1.height)+1; return k2; 
} public Node LR(Node k2) 
{ k2.left=RR(k2.left); return LL(k2); } private Node RL(Node k1) 
{ k1.right=LL(k1.right); return RR(k1); } public int count_nodes() 
{ return count_nodes(root); 
} public int getbalance(Node t) 
{ if(t==null) return 0; return height(t.left) - height(t.right); 
} 
Node findmin(Node t) 
{ 
Node temp=t; while(temp.left!=null) temp=temp.left; return temp; } private int count_nodes(Node r) 
{ 
int l; if(r==null) return 0; else { l=1; l+=count_nodes(r.left); l+=count_nodes(r.right); return l; } 
} public void inorder(Node x) 
{ if(x!=null) { inorder(x.left); System.out.print(x.data+" "); inorder(x.right); 
} } public void postorder() { postorder(root); 
}  
public void postorder(Node x) 
{ if(x!=null) { postorder(x.left); postorder(x.right); 
System.out.print(x.data+" "); 
} } public void preorder(Node x) 
{ if(x!=null) 
{ 
System.out.print(x.data+" "); preorder(x.left); preorder(x.right); 
} } public boolean search(Node r, int val) 
{ boolean found=false; while((r!=null) &&(!found)) 
{ int rval; rval=r.data; if(val < rval) r=r.left; else if(val > rval) r=r.right; else 
{ found=true; break; } found=search( r, val ); 
} return found; } public Node delete(int x, Node root) 
{ 
Node temp; if(root==null) return null; else if(x < root.data) root.left=delete(x, root.left); else if(x > root.data) root.right=delete(x, root.right); else if((root.left!=null)&&(root.right!=null)) 
 	{ 
 	temp=findmin(root.right);  	root.data=temp.data;  	root.right=delete(root.data, root.right); 
 	} 
else { temp=root; if(root.left==null) temp=root.right; else if(root.right==null) temp=root.left; if(temp==null) { temp=root; root=null; } else { root=temp; 
} } if(root==null) return root; root.height=1+Math.max(height(root.left),height(root.right)); int bal=getbalance(root); 
 
if(bal>1 &&getbalance(root.left)>=0) return LL(root); if(bal>1 && getbalance(root.left)<0) return LR(root); if(bal <-1 && getbalance(root.right)<=0) return RR(root); if(bal<-1 &&getbalance(root.right)>0) return RL(root); return root; } public static void main(String[] args) 
{ 
Node h; 
Scanner sc=new Scanner(System.in); 
AVLTree1 a=new AVLTree1(); System.out.println("AVL tree"); char ch1; int ch; boolean re; do 
{ 
System.out.println("\n AVL tree operations\n"); 
System.out.println("1. Insert"); 
System.out.println("2.delete");  
System.out.println("3.search ");  System.out.println("4.count nodes "); ch=sc.nextInt(); switch(ch){ case 1: 
System.out.println(" Enter the element to insert"); a.insert(sc.nextInt()); break; 
case 2: if(a.root==null) 
System.out.println("AVL Tree is empty"); else{ 
System.out.println("Enter the element to delete"); a.root=a.delete(sc.nextInt(),a.root); 
System.out.println("element is removed"); 
} break; 
case 3:System.out.println(" enter element to search"); re=a.search(a.root,sc.nextInt()); if(re==false) 
System.out.println("element not found"); else 
System.out.println("element found"); break; 
case 4: System.out.println("Nodes: "+a.count_nodes()); break; default: 
System.out.println("Wrong entry\n"); break; 
} 
System.out.println(" "); if(a.root!=null){ 
System.out.print(" \n postorder:    "); a.postorder(a.root); 
System.out.println(""); System.out.print(" \n preorder:     "); a.preorder(a.root); 
System.out.println(""); System.out.print(" \n inorder:    "); a.inorder(a.root); 
} 
System.out.println(""); 
System.out.println(" \n Do you want to continue\n"); ch1=sc.next().charAt(0); 
}while(ch1=='y' || ch1=='Y'); 
} 
} 
