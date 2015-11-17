package problems;

import java.util.HashMap;
import java.util.Scanner;

//Problem        : Yet Another Compliance Problem
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/AnotherComplianceProblem.pdf
//Using http://stackoverflow.com/questions/17498120/whats-number-anagram-which-are-palindromes-in-string

public class AnotherComplianceProblem {
	static HashMap<Character, Integer> hm = new HashMap<>();

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println(checkPalindrome(stdin.nextLine()));
		stdin.close();
	}

	public static long factorial(int n) {
		int fact = 1; // this will be the result
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	private static long checkPalindrome(String ip) {
		for (int i = 0; i < ip.length(); i++) {
			int count = 0;
			char c = ip.charAt(i);
			if (hm.containsKey(c)) {
				count = hm.get(c);
				hm.put(c, count + 1);
			} else {
				hm.put(c, 1);
			}
		}
		int num = 0;
		long den = 1;
		int count;
		int pairs;
		boolean oddFlag = false;
		for (Character k : hm.keySet()) {
			count = hm.get(k);
			if (count % 2 != 0) {
				if (!oddFlag) {
					oddFlag = true;
				} else {
					return 0;
				}
			}
			pairs = (int) count / 2;
			num += pairs;
			den *= factorial(pairs);
		}
		return factorial(num) / den;
	}
}
