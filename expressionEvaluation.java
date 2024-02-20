
 /*
 
 
7b)  Expression evaluation AIM: 
 Java program to implement expression evaluation 
ALGORITHM: 
Step 1:Start 
Step 2: Intialize a string consisting of expression and two stacks for storing values and               operators. 
Step 3: Iterate from 0 to size of string-1. Check if the character at the current index is equal               to space start the next iteration. If the character at the current index is equal to '('               insert it in operators stack. 
Step 4: If the character at the current index is a digit-Check if there is a number following               next to the digit, pick the whole number else if it is a single-digit pick the digit. Insert               the digit in the value stack. 
Step 5: Else if the character at the current index it ')' iterate while the size of the operators               stack is not zero and character at the current index is not equal to '('. 
Step 6: After that, remove the 2 elements from the top of the values stack and 1 element from               the operator stack. 
Step 7: Apply the arithmetic operation on the two popped digits. Insert the answer in a values               stack. 
Step 8: Similarly, while the size of the operators stack is not zero, remove the 2 elements at                the top of the values stack and an operator from operator stack. 
Step 9: Apply the arithmetic operation on the two popped digits.Insert the answer in a value               stack. 
Step 10:Return the element at the top of the value stack. 
Step 11:Stop. 
 
EXPECTED OUTPUT: 
 
 */
 
//SOURCE CODE: 
import java.util.Stack; import java.io.IOException; import java.io.*;  public class EvaluateString{ 
    public static int evaluate(String expression)  {         char[] tokens = expression.toCharArray();         Stack<Integer> values = new Stack<Integer>(); 
        Stack<Character> ops = new Stack<Character>();  
        for (int i = 0; i < tokens.length; i++){  
            if (tokens[i] == ' ')                 continue;              if (tokens[i] >= '0' && tokens[i] <= '9') 
            { 
                StringBuffer sbuf = new StringBuffer(); 
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')                     sbuf.append(tokens[i++]);                 values.push(Integer.parseInt(sbuf. toString()));                   i--;             } 
            else if (tokens[i] == '(')                 ops.push(tokens[i]);             else if (tokens[i] == ')') 
            { 
                while (ops.peek() != '(') 
                  values.push(applyOp(ops.pop(),                                    values.pop(),                                  values.pop()));                 ops.pop(); 
            } 
            else if (tokens[i] == '+' || tokens[i] == '-' ||tokens[i] == '*' ||tokens[i] == '/') 
            { 
                while (!ops.empty() &&hasPrecedence(tokens[i],ops.peek())) 
                  values.push(applyOp(ops.pop(),                                    values.pop(),                                  values.pop())); 
                ops.push(tokens[i]); 
            } 
        } 
        while (!ops.empty())             values.push(applyOp(ops.pop(), 
                             values.pop(),                            values.pop())); 
        return values.pop(); 
    }  
    public static boolean hasPrecedence(char op1, char op2) 
    { 
        if (op2 == '(' || op2 == ')')             return false;         if ((op1 == '*' || op1 == '/') &&  (op2 == '+' || op2 == '-'))             return false;         else             return true; 
    } 
    public static int applyOp(char op,   int b, int a) 
    { 
        switch (op) 
        {         case '+': 
            return a + b;         case '-': 
            return a - b;         case '*': 
            return a * b;         case '/': 
            if (b == 0) 
                throw new UnsupportedOperationException( "Cannot divide by zero");             return a / b; 
        }         return 0; 
    } 
    public static void main(String[] args) 
    { 
BufferedReader keyboard = new BufferedReader(newInputStreamReader(System.in)); try{ 
 	System.out.println("Enter infix expression "); 
 	String exp = keyboard.readLine();  
 	System.out.println(EvaluateString.evaluate(exp)); 
        } 
 	catch(Exception e){}  	 
                        evaluate("10 + 2 * 6"));         System.out.println(EvaluateString.                       evaluate("100 * 2 + 12"));         System.out.println(EvaluateString.                    evaluate("100 * ( 2 + 12 )"));         System.out.println(EvaluateString.              evaluate("100 * ( 2 + 12 ) / 14"));*/ 
    } 
} 
