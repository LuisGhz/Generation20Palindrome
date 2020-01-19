package com.exercise20palindrome.app;

import com.exercise20palindrome.model.StringApplications;

public class PalindromeApp {

	public static void main(String[] args) {
		String palindrome1 = "Anita lava la tina.";
		String palindrome2 = "Yo dono rosas, oro no doy!!!";
		
		System.out.println(StringApplications.isPalindrome(palindrome1));
		System.out.println(StringApplications.isPalindrome(palindrome2));
		System.out.println(StringApplications.isPalindromeStack(palindrome1));
		System.out.println(StringApplications.isPalindromeStack(palindrome2));
	}

}
