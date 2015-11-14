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
		int palLength = ip.length();
		int lp = 0, rp = ip.length() - 1;
		while (lp < rp) {
			if (ip.charAt(lp) == ip.charAt(rp)) {
				lp++;
				rp--;
			} else {
				rp--;
				palLength++;
			}
		}
		return palLength;
	}
}
