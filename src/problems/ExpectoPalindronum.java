package problems;
//Problem        : Expecto Palindronum

//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/ExpectoPalindronum.pdf

import java.util.Scanner;

//Your submission should *ONLY* use the following class name

public class ExpectoPalindronum {
	public static void main(String[] args) {
		String ip;
		Scanner stdin = new Scanner(System.in);
		ip = stdin.nextLine();
		stdin.close();
		System.out.print(getPalindromeLength(ip));
	}

	private static int getPalindromeLength(String ip) {
		int i;
		for (i = ip.length(); i >= 0; i--) {
			if (checkPalindrome(ip.substring(0, i))) {
				break;
			}
		}
		return 2 * ip.length() - i;
	}

	private static boolean checkPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i <= s.length() / 2 - 1; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
}
