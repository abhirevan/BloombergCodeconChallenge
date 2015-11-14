package problems;

//Problem        : Mug Color
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/MugColor.pdf

import java.util.*;

public class MugColor {
	static HashSet<String> options = new HashSet<String>();

	public static void main(String[] args) {
		int n;
		String ipStr;
		options.add("White");
		options.add("Black");
		options.add("Blue");
		options.add("Red");
		options.add("Yellow");

		Scanner stdin = new Scanner(System.in);
		n = new Integer(stdin.nextLine());
		for (int i = 0; i < n; i++) {
			ipStr = stdin.nextLine();
			if (options.contains(ipStr)) {
				options.remove(ipStr);
			}
		}
		stdin.close();
		if (n > 0) {
			Iterator<String> it = options.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
