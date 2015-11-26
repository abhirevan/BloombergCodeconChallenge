package problems;

//Problem        : Finals Spring 2015 - Matching Gloves
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/MatchingGloves.pdf
import java.util.*;

public class MatchingGloves {
	static HashMap<String, Integer> hm = new HashMap<>();

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		Integer n_ip = new Integer(stdin.nextLine());
		String ipString;
		for (int i = 0; i < n_ip; i++) {
			ipString = stdin.nextLine();
			if (!isPalindrome(ipString)) {
				addInHM(ipString);
			}
		}
		stdin.close();
		checkMatchingGloves();
	}

	private static void checkMatchingGloves() {
		int pairs = 0;
		for (String s : hm.keySet()) {
			if(hm.containsKey(s)&&hm.containsKey(reverseString(s))){
				if (hm.get(s) == hm.get(reverseString(s))) {
					// Matching pair found
					pairs += hm.get(s);
				} else {
					System.out.println("-1");
					return;
				}
			}else{
				System.out.println("-1");
				return;
			}
		}
		System.out.println((int)(pairs / 2));

	}

	private static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		return sb.toString();
	}

	private static void addInHM(String s) {
		int value;
		if (hm.containsKey(s)) {
			value = hm.get(s);
			hm.put(s, value + 1);
		} else {
			hm.put(s, 1);
		}
	}

	private static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i <= s.length() / 2 - 1; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
}
