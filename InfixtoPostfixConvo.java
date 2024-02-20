/*
Experiment -7 
Write a java program for the following using stack a) Infix to postfix conversion 
AIM: 
Java program using stack implement infix to postfix convention 
ALGORITHM: 
Step 1: Start. 
Step 2: Scan the infix notation from left to right one character at a time. 
Step 3: If the next symbol scanned as an operand, append it to the postfix string. 
Step 4: If the next symbol scanned as an operator the 
             i) Pop and append to the postfix string every operator on the stack that: 
a)	Is above the most recently scanned left paranthesis and 
b)	Has precedence higher than or is a right-associative operator of equal precedence                  to that of the new operator symbol. 
                 ii) Push the new operator onto the stack. 
Step 5: If a left parenthesis is scanned, push it into the stack. 
Step 6: If a right paranthesis is scanned, all operators down the most recently scanned left              parenthesis must be popped and appended to the postfix string. Futhermore, the pair                 of  parenthesis must be discarded. 
Step 7: When the infix string is fully scanned, the stack may contain some operators all the              remaining operators should be popped and appended to the postfix String. 
 
    */
//SOURCE CODE: 
import java.io.IOException; import java.util.Stack; import java.io.*;  class InfixToPostfix{      static int Prec(char ch) {  switch (ch)  {         case '+':         case '-': 
            return 1;        case '*':         case '/': 
            return 2;     case '^': 
            return 3; 
        }         return -1; 
    } 
    static String infixToPostfix(String exp)  { 
        String result = new String(""); 
        Stack<Character> stack = new Stack<>();          for (int i = 0; i<exp.length(); ++i)  {             char c = exp.charAt(i);             if (Character.isLetterOrDigit(c)) 
                result += c;             else if (c == '(')                 stack.push(c);             else if (c == ')'){                 while (!stack.isEmpty() &&                         stack.peek() != '(')                     result += stack.pop();                      stack.pop(); 
            }             else   { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){                      result += stack.pop(); 
             } 
                stack.push(c); 
            }  
        } 
        while (!stack.isEmpty()){             if(stack.peek() == '(')                 return "Invalid Expression"; 
            result += stack.pop(); 
         }         return result; 
    }  
    public static void main(String[] args)   { 
 	BufferedReader keyboard = new BufferedReader (new 
InputStreamReader(System.in)); 
 	try{ 
 	System.out.println("Enter infix expression "); 
 	String exp = keyboard.readLine();  
 	System.out.println(infixToPostfix(exp)); 
        } 
 	catch(Exception e){}  
    } 
} 
