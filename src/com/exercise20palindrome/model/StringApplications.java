package com.exercise20palindrome.model;

import java.util.Stack;

public class StringApplications 
{
	public static boolean isPalindrome(String str) 
	{
		boolean isPal = true;
		String strClean = str.replace(" ", "");
		strClean = strClean.replace(".", "");
		strClean = strClean.replace("!", "");
		strClean = strClean.replace(",", "");
		strClean = strClean.toLowerCase();
		long start = 0, end = 0, diff = 0;
		
		start = System.nanoTime();
		
		for (int i = 0; i < strClean.length(); i++) 
		{
			if (strClean.charAt(i) != strClean.charAt((strClean.length() - 1) - i))
			{
				isPal = false;
			}
		}
		end = System.nanoTime();
		
		diff = end - start;
		
		System.out.println(diff);
		return isPal;
	}
	
	public static boolean isPalindromeStack(String str)
	{
		boolean isPal = true;
		String strClean = str.replace(" ", "");
		strClean = strClean.replace(".", "");
		strClean = strClean.replace("!", "");
		strClean = strClean.replace(",", "");
		strClean = strClean.toLowerCase();
		char[] charArray = strClean.toCharArray();
		long start = 0, end = 0, diff = 0;
		
		Stack<Character> letters1 = new Stack<Character>();
		Stack<Character> letters2 = new Stack<Character>();
		
		start = System.nanoTime();
		
		for (Character c : charArray)
		{
			letters1.push(c);
		}
		
		for (int i = charArray.length - 1; i >= 0; i--)
		{
			letters2.push(charArray[i]);
		}
		
		while (letters1.isEmpty())
		{
			if (letters1.pop() != letters2.pop())
			{
				isPal = false;
			}
		}
		end = System.nanoTime();
		
		diff = end - start;
		
		System.out.println(diff);
		return isPal;
	}
	
}
