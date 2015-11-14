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
		int iplength = ip.length();
		int remainder = 0;
		int lp, rp;
		for (int i = iplength / 2; i >= 0; i--) {
			if ((iplength % 2) == 1) {
				// odd
				lp = i - 1;
				rp = i + 1;
			} else {
				// even
				lp = i - 1;
				rp = 1;
			}
			remainder = checkPalindrome(lp, rp, ip);
			if (remainder > -1) {
				break;
			}
		}
		return iplength + remainder;
	}

	private static int checkPalindrome(int lp, int rp, String ip) {
		while (lp >= 0) {
			if (ip.charAt(lp) == ip.charAt(rp)) {
				lp--;
				rp++;
			} else {
				return -1;
			}
		}
		return ip.length() - rp;
	}
}
