/*Experiment -8 
Write a java program to implement various, operations on Binary Search Tree using Recursive and Non-Recursive methods AIM: 
Java program to implement various operations on Binary Search Tree using Recursive and Non-Recursive methods ALGORITHM (Recursive) : 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a class BST Node and declare required variables inside the constructor and               initialize it to null. 
Step 4: Declare required functions to get and set the node. 
Step 5: Create a class BST and declare insert function to insert the data by reading element                by the user by considering the data to be inserted at left or right of the BST. Step 6: Define delete function by considering data from the user and if data is not present in               the BST, display message and the data is less than the root, traverse it using the               recursive function and the delete element at that particular location, and the data is               greater than the root, follow the steps done in left BST. 
Step 7: Define count nodes function and by using recursive function of it, traverse each data               and store the values and print count until the r becomes null. 
Step 8: Define search function and return the search element and by using that function              recursively, search the data entered by the user and display found message if found. Step 9: Define inorder function and return the value of root by calling it recursively initially               set the BST as left ,data and right using inorder function until r is not equals to null. Step 10:Define preorder function and return the value of root and by calling it recursively if                it to be inserted in the order data, left and right insert using preorder recursive                function is not equals to null. 
Step 11:Define post order function and return the value of root and calling it recursively if it                be inserted in the order left,right and data insert it using post order recursive function                until r is not equals to null. 
Step 12:Stop. 
 
 */
//SOURCE CODE: 
import java.util.Scanner; 
 class BSTNode 
 { 
     BSTNode left, right;      int data; 
     public BSTNode() 
     {          left = null;          right = null;          data = 0; 
     } 
     public BSTNode(int n) { 
         left = null;          right = null;          data = n; 
     } 
     public void setLeft(BSTNode n)  { 
         left = n; 
     }  
     public void setRight(BSTNode n){ 
         right = n; 
     } 
     public BSTNode getLeft(){ 
         return left; 
     } 
     public BSTNode getRight()  {          return right; 
     } 
     public void setData(int d){ 
         data = d; 
     }      public int getData()  {          return data; 
     }      
 }   class BS {      private BSTNode root;      public BST() {          root = null; 
     } 
     public boolean isEmpty() { 
         return root == null; 
     } 
     public void insert(int data) {          root = insert(root, data); 
     } 
     private BSTNode insert(BSTNode node, int data){          if (node == null) 
             node = new BSTNode(data); 
         else { 
             if (data <= node.getData())                  node.left = insert(node.left, data);              else                  node.right = insert(node.right, data); 
         }          return node; 
     } 
     public void delete(int k) {          if (isEmpty()) 
             System.out.println("Tree Empty");          else if (search(k) == false) 
             System.out.println("Sorry "+ k +" is not present");          else          { 
             root = delete(root, k); 
             System.out.println(k+ " deleted from the tree"); 
         } 
     } 
     private BSTNode delete(BSTNode root, int k){          BSTNode p, p2, n;          if (root.getData() == k)  {              BSTNode lt, rt;              lt = root.getLeft();              rt = root.getRight();              if (lt == null && rt == null) 
                 return null;              else if (lt == null)  {                  p = rt;                  return p;              }              else if (rt == null){                  p = lt;                  return p;              }              else  {                  p2 = rt; 
                 p = rt;                  while (p.getLeft() != null)                      p = p.getLeft();                  p.setLeft(lt);                  return p2; 
             } 
         } 
         if (k < root.getData()){              n = delete(root.getLeft(), k);              root.setLeft(n); 
         }          else 
{              n = delete(root.getRight(), k);              root.setRight(n);              
         }          return root; 
     }  
     public int countNodes()  { 
         return countNodes(root); 
     } 
     private int countNodes(BSTNode r){ 
         if (r == null)              return 0;          else          { 
             int l = 1;              l += countNodes(r.getLeft());              l += countNodes(r.getRight());              return l; 
         } 
     } 
     public boolean search(int val){ 
         return search(root, val); 
     } 
     private boolean search(BSTNode r, int val){          boolean found = false;          while ((r != null) && !found){              int rval = r.getData();              if (val < rval)                  r = r.getLeft();              else if (val > rval)                  r = r.getRight();              else              {                  found = true;                  break; 
             } 
             found = search(r, val); 
         }          return found; 
     }  
     public void inorder() 
     {          inorder(root); 
     } 
     private void inorder(BSTNode r) 
     {          if (r != null)          { 
             inorder(r.getLeft());              System.out.print(r.getData() +" "); 
             inorder(r.getRight()); 
         } 
     }  
     public void preorder() 
     {          preorder(root); 
     } 
     private void preorder(BSTNode r) 
     {          if (r != null) 
         { 
             System.out.print(r.getData() +" ");              preorder(r.getLeft());              
             preorder(r.getRight()); 
         } 
     } 
     public void postorder() 
     { 
         postorder(root); 
     } 
     private void postorder(BSTNode r) 
     { 
         if (r != null) 
         { 
             postorder(r.getLeft());                           postorder(r.getRight()); 
             System.out.print(r.getData() +" "); 
         } 
     }     
 } 
 public class BinarySearchTree 
 { 
     public static void main(String[] args) 
    {                  
        Scanner scan = new Scanner(System.in); 
        BST bst = new BST();  
        System.out.println("Binary Search Tree Test\n");                   char ch;         do     
        { 
            System.out.println("\nBinary Search Tree Operations\n"); 
            System.out.println("1. insert "); 
            System.out.println("2. delete"); 
            System.out.println("3. search"); 
            System.out.println("4. count nodes");             System.out.println("5. check empty");              int choice = scan.nextInt();                         switch (choice) 
            {             case 1 :  
                System.out.println("Enter integer element to insert"); 
                bst.insert( scan.nextInt() );                      
                break;                                       case 2 :  
                System.out.println("Enter integer element to delete"); 
                bst.delete( scan.nextInt() );                      
                break;                                      case 3 :  
                System.out.println("Enter integer element to search"); 
                System.out.println("Search result : "+ bst.search( scan.nextInt() ));                 break;                                                       case 4 :  
                System.out.println("Nodes = "+ bst.countNodes());                 break;                  case 5 :   
                System.out.println("Empty status = "+ bst.isEmpty()); 
                break;                         default :  
                System.out.println("Wrong Entry \n ");                 break;    
            }  
            System.out.print("\nPost order : ");             bst.postorder(); 
            System.out.print("\nPre order : ");             bst.preorder(); 
            System.out.print("\nIn order : "); 
            bst.inorder();    
            System.out.println("\nDo you want to continue (Type y or n) \n");             ch = scan.next().charAt(0);                         
        } while (ch == 'Y'|| ch == 'y');                
    } 
 } 
 
//ACTUAL OUTPUT: 
 
  
 
 
 
 
