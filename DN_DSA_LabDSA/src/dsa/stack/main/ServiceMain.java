package dsa.stack.main;

import dsa.stack.service.BalancingBrackets;

public class ServiceMain {
	 public static void main(String[] args) 
	    { 
	        String expression = "([[{}]]))"; 
		// String expression = "([[{}]])"; 
	        BalancingBrackets bb=new BalancingBrackets();
	        // Function call 
	        if (BalancingBrackets.checkingBracketsBalanced(expression)) 
	            System.out.println("The entered String has Balanced Brackets "); 
	        else
	            System.out.println("The entered Strings do not contain Balanced Brackets"); 
	    } 
}
