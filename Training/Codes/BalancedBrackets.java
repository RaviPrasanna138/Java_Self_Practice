package Training.Codes;

import java.util.*;
 public class BalancedBrackets 
 { 
    static String isBalanced(String s)
     { 
        Stack stack = new Stack<>(); 
        for (char c : s.toCharArray())
         { 
            if (c == '(' || c == '[' || c == '{') 
             {
                 stack.push(c);
                 } 
                 else if (c == ')' || c == ']' || c == '}') 
                 {
                     if (stack.isEmpty())
                      { return "NO"; 
                    } 
                    char top = (char) stack.pop();
                     if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top!= '{')) {
                         return "NO"; }
                         } 
                        } 
                        return stack.isEmpty() ? "YES" : "NO"; 
                    } 
                    public static void main(String[] args) { 
                        Scanner scanner = new Scanner(System.in);
                         int n = scanner.nextInt(); scanner.nextLine();
                          for (int i = 0; i < n; i++) 
                          { String s = scanner.nextLine(); 
                            String result = isBalanced(s); 
                            System.out.println(result); 
                        } } }