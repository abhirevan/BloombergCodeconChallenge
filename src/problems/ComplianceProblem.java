package problems;
//Problem        : A Compliance Problem

//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/ComplianceProblem.pdf

import java.util.*;

//Your submission should *ONLY* use the following class name
public class ComplianceProblem {
	static HashMap<Character, Integer> hm = new HashMap<>();

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println(checkPalindrome(stdin.nextLine()));
		stdin.close();
	}

	private static String checkPalindrome(String ip) {
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
		boolean oddFlag = false;
		for (Character k : hm.keySet()) {
			if (hm.get(k) % 2 != 0) {
				if (!oddFlag) {
					oddFlag = true;
				} else {
					return "no";
				}
			}
		}
		return "yes";
	}
}
