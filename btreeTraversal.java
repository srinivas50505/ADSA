/* 
Experiment-14 
Write a java program to implementation of recursive and non-recursive functions to Binary tree Traversals  
AIM: 
Java program to implement recursive and non-recursive functions to Binary tree traversals 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a structure of name Node and declare structure variable and create a                constructor for Node and initialize key as item, left and right as null. 
Step 4: Create a class nr_r_ btt and declare required functions.  
Step 5: Display all the functions of recursive and non-recursive inside the main. 
Step 6: Define rpostorder function and recursively call function for assigning left, right and                then key. by initially checking it the node is null (empty). 
Step 7: Define rinorder function and recursively call function by assigning left, key and then                right by initially checking t the node is null (empty). 
Step 8: Define rpreorder function and recursively call function by assigning  key , left and                then right by initially checking the node is null (empty). 
Step 9: Define inorder function and by reading the elements, assign the elements in the order               of key left, key and then right by checking if the current is null, if true then check the               current left position is null, if it true. Initialize assign the left element and then insert               the key and insert the right element. 
Step10: Define postorder function and by reading the elements, assign the elements in the                order of left, right and key by initializing temp to root and if it is null, assign the                temp as left and if right is not equal to null; and right  is not visited, assign next                value to right and next value as key. 
Step11: Define preorder function and by reading the elements, assign the elements in the                order of key, left and right, by initially checking if the mode is not equal to null, it it                is true, assign the node as key, and then traverse to next position insert at left and               then right. 
Step12: Define an obj for class and call all the functions to display the output using recursive                and non-recursive functions. 
Step 13: Stop. 

 
 
 
 
 

SOURCE CODE: */
import java.util.*; class Node{ int key; Node left,right; boolean visited; public Node(int item) 
{ key=item; left=right=null; 
} } class nr_r_btt { Node root; nr_r_btt() { root=null; } public Node getdata(int a) 
{ 
Node n=new Node(a); return n; } void  rpostorder(Node node) 
{ if(node==null) return; 
rpostorder(node.left); rpostorder(node.right); System.out.print(node.key+" "); 
} void  rinorder(Node node) 
{ if(node==null) return; rinorder(node.left); System.out.print(node.key+" "); rinorder(node.right); } void  rpreorder(Node node) 
{ if(node==null) return; 
System.out.print(node.key+" "); rpreorder(node.left); rpreorder(node.right); } void inorder(Node ptr) { Node curr,pre; if(root==null) return; curr=root; while(curr!=null){ if(curr.left==null){ System.out.print(curr.key+" "); curr=curr.right; } else{ pre=curr.left; while((pre.right!=null) &&(pre.right!=curr)) pre=pre.right; if(pre.right==null){ pre.right=curr; curr=curr.left; } else{ pre.right=null; System.out.print(curr.key+" "); curr=curr.right; 
} 
} 
} 
System.out.println(" "); 
} void postorder(Node root){ Node temp=root; while(temp!=null && temp.visited==false){ if((temp.left!=null)&&(temp.left.visited==false)) temp=temp.left; else if(temp.right !=null && temp.right.visited==false) temp=temp.right; else{ 
System.out.print(" "+temp.key); temp.visited=true; temp=root; 
} 
} 
System.out.println(" "); 
} void preorder(Node node){ while(node!=null){ if(node.left==null){ System.out.print(node.key+" "); node=node.right; } else{ Node curr=node.left; while((curr.right!=null) && (curr.right!=node)){ curr=curr.right; } if(curr.right==node){ curr.right=null; node=node.right; } else 
{ 
System.out.print(node.key+" "); curr.right=node; node=node.left; 
} 
} 
} 
System.out.println(" "); 
} public static void main(String[] args){ nr_r_btt t= new nr_r_btt(); t.root=t.getdata(1); 
t.root.left=t.getdata(2); 
t.root.right=t.getdata(3); 
t.root.left.left=t.getdata(4); 
t.root.left.right=t.getdata(5); System.out.println("Recursive"); System.out.print("Preorder"); t.rpreorder(t.root); 
System.out.println(" "); System.out.print("Inorder"); t.rinorder(t.root); 
System.out.println(" "); System.out.print("Postorder"); t.rpostorder(t.root); 
System.out.println(" "); 
System.out.println("Non-Recursive"); System.out.print("inorder: "); t.inorder(t.root); 
System.out.print("preorder:"); t.preorder(t.root); 
System.out.print("Postorder:"); t.postorder(t.root);   
} 
} 
