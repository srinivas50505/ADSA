/*Experiment-13 
Write a java program to perform the following operations: 
a) Insertion into a B-tree  	 	b) Searching in a B-tree AIM: 
Program to implement various operations on a) Insertion intoa B-bree b) Search in a B-tree. 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a class Btree and declare required functions.  
Step 4: Create a class Node and declare key, child and intialize leaf as true. 
Step 5: Define insert function and assign in as leaf node. Then we find where k belongs in                  the array of keys, shift everything over to the left, and stick k in there. If x is not a                 leaf node, we can't just stick k in because it doesn't have any children, children are               really only created when we split node. so we don't get an unbalanced child of                where we can insert k.  
Step 6: Define search function and perform a binary search on the records in the current                 node. If a record with the search key is found, then return that record. If the current               node is a leaf node and the key is not found, then report an unsuccessful search.  
              Otherwise, follow the proper branch and repeat the process. 
Step 7: Define display function by creating a variable and point to the start and traverse it                  using for loop until it points to null and print value at each iteration. 
Step 8: Stop. 
 
SOURCE CODE: */
import java.util.Stack; import java.util.*; public class BTree { private int T;   public class Node { 
    int n; 
    int key[] = new int[2 * T - 1];     Node child[] = new Node[2 * T];     boolean leaf = true;     public int Find(int k) {       for (int i = 0; i < this.n; i++) {         if (this.key[i] == k) {           return i; 
        }       }       return -1; 
    }   }   public BTree(int t) {     T = t;     root = new Node();     root.n = 0;     root.leaf = true; 
  }  static private Node root;   private Node Search(Node x, int key) { 
 	int flag=0; 
    int i = 0;     if (x == null)       return x;     for (i = 0; i < x.n; i++) {       if (key < x.key[i]) {         break; 
      } 
      if (key == x.key[i]) { 
 	flag=1; 
 	System.out.println("Element found"); 
        return x; 
      } 
    } 
 	if(flag==0) 
 	System.out.println("Element not found"); 	 
    if (x.leaf) {       return null;     } else {       return Search(x.child[i], key); 
    } 
  } 
  private void Split(Node x, int pos, Node y) {     Node z = new Node();     z.leaf = y.leaf; 
    z.n = T - 1;     for (int j = 0; j < T - 1; j++) {       z.key[j] = y.key[j + T];     }     if (!y.leaf) {       for (int j = 0; j < T; j++) { 
        z.child[j] = y.child[j + T]; 
      } 
    } 
    y.n = T - 1;     for (int j = x.n; j >= pos + 1; j--) {       x.child[j + 1] = x.child[j]; 
    } 
    x.child[pos + 1] = z;     for (int j = x.n - 1; j >= pos; j--) {       x.key[j + 1] = x.key[j]; 
    } 
    x.key[pos] = y.key[T - 1]; 
    x.n = x.n + 1;   } 
  public void Insert(final int key) {     Node r = root;     if (r.n == 2 * T - 1) {       Node s = new Node();       root = s; 
      s.leaf = false; 
      s.n = 0; 
      s.child[0] = r;       Split(s, 0, r); 
      _Insert(s, key); 
    } else { 
      _Insert(r, key); 
    } 
  }   final private void _Insert(Node x, int k) {     if (x.leaf) {       int i = 0;       for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {         x.key[i + 1] = x.key[i]; 
      } 
      x.key[i + 1] = k; 
      x.n = x.n + 1;     } else {       int i = 0;       for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) { 
      }       i++; 
      Node tmp = x.child[i];       if (tmp.n == 2 * T - 1) {         Split(x, i, tmp);         if (k > x.key[i]) {           i++;         } 
      } 
      _Insert(x.child[i], k); 
    } 
  } 
  private void display(Node x) {     assert (x == null);     for (int i = 0; i < x.n; i++) { 
      System.out.print("  "+x.key[i]); 
    }     if (!x.leaf) {       for (int i = 0; i < x.n + 1; i++) {         display(x.child[i]); 
      }     } } 
  public static void main(String[] args) {     BTree b = new BTree(3); int c, ch1; char ch; 
Scanner sc= new Scanner(System.in); while(true) { 
System.out.println("\n Menu"); 
System.out.println(" 1. Insert"); 
System.out.println(" 2.display"); 
System.out.println("3.search"); 
System.out.println("4.exit"); System.out.println("enter the choice"); ch1=sc.nextInt(); switch(ch1){ case 1: System.out.println(" enter the element to insert");  	b.Insert(sc.nextInt()); 
 	break; 
case 2: System.out.println(" Elements in the B-Tree:");  	b.display(root); 
 	break; 
case 3: System.out.println("Enter element to search");  	b.Search(root,sc.nextInt()); 
 	break; 
case 4: System.exit(0); break; } 
} 
} 
} 
