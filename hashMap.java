
/* Experiment-15 
Write a java program to implement all the functions of Dictionary (ADT) using Hashing. AIM: 
Java program to implement all the functions of Dictionary using hashing. 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Define a class dict_hast and create an obj for It.insert elements in the hash table               which was created by Dictionary. 
Step 4: The inserted element should be in the order of key-values pairs. 
Step 5: Print all the keys by considering the input which was already given. And also check               for empty status. If there is no key-value pair, display on message empty is true or               false. 
Step 6: Print the values of keys by considering the input which was already given. Remove               the keys by calling remove function and check value of the removed key. And also               check empty status and size of the dictionary after calling all functions.  
Step 7: Stop. 

 
 
SOURCE CODE: */
import java.util.*; public class dict_hash{ public static void main(String[] args){ Dictionary d= new Hashtable(); d.put("123","code"); 
d.put("456","program"); for(Enumeration i=d.elements(); i.hasMoreElements(); ) 
{ 
System.out.println("value in Dctionary:" + i.nextElement()); 
} 
System.out.println("\n value at key=6:"+d.get("6")); 
System.out.println("\n value at key=456:"+d.get("123")); 
System.out.println("\n There is no key value pair"+d.isEmpty()+"\n"); for(Enumeration k=d.keys(); k.hasMoreElements();){ 
System.out.println("value in Dctionary:"+k.nextElement()); 
} 
System.out.println("\n remove:"+d.remove("123")); 
System.out.println("check value of removed key:"+d.get("123")); 
System.out.println("\n size of dictionary:"+d.size()); 
} 
} 
