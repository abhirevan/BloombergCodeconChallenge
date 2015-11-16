package problems;

//Problem        : Messed up Rugby
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/MessedUpRugby.pdf
import java.util.*;

public class MessedUpRugby {
	static final int MAX_7 = 32;
	static final int MAX_3 = 74;
	static final int MAX_2 = 111;

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Integer ip = new Integer(stdin.nextLine());
		stdin.close();
		printPossibleSequences(ip);
	}

	private static void printPossibleSequences(Integer target) {
		int sum = 0;
		for (int i = 0; i < MAX_7; i++) {
			if (7 * i > target) {
				break;
			}
			for (int j = 0; j < MAX_3; j++) {
				if ((7 * i + 3 * j) > target) {
					break;
				}
				for (int k = 0; k <= MAX_2; k++) {
					sum = i * 7 + j * 3 + k * 2;
					if (sum == target) {
						System.out.println(i + " " + j + " " + k);
					} else if (sum > target) {
						break;
					}
				}
			}
		}
	}
}
