package dsa.stack.service;
import java.util.*;

public class BalancingBrackets {

	  public static boolean checkingBracketsBalanced(String expression) 
	    { 

	        Stack<Character> stack 
	            = new Stack<Character>(); 
	  
	    
	        for (int i = 0; i < expression.length(); i++)  
	        { 
	            char characterVal = expression.charAt(i); 
	  
	            if (characterVal == '(' || characterVal == '[' || characterVal == '{')  
	            { 
	                // Push the element in the stack 
	                stack.push(characterVal); 
	                continue; 
	            } 
	  
	            if (stack.isEmpty()) 
	                return false; 
	            
	            char checkChar; 
	            
	            switch (characterVal) { 
	            case ')': 
	                checkChar = stack.pop(); 
	                if (checkChar == '{' || checkChar == '[') 
	                    return false; 
	                break; 
	  
	            case '}': 
	                checkChar = stack.pop(); 
	                if (checkChar == '(' || checkChar == '[') 
	                    return false; 
	                break; 
	  
	            case ']': 
	                checkChar = stack.pop(); 
	                if (checkChar == '(' || checkChar == '{') 
	                    return false; 
	                break; 
	            } 
	        } 
	  
	 
	        return (stack.isEmpty()); 
	    } 
}
