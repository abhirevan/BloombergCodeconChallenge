package problems;

//Problem        : Laundry Day
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/LaundryDay.pdf

import java.util.*;

//Your submission should *ONLY* use the following class name
public class LaundryDay {
	static TreeMap<String, Integer> tm = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while (stdin.hasNextLine()) {
			updateBasket(stdin.nextLine());
		}
		stdin.close();
		printBasket();
	}

	private static void printBasket() {
		Iterator it = tm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry set = (Map.Entry) it.next();
			String k = (String) set.getKey();
			int count = (int) set.getValue();
			if (k.contains(" sock")) {
				if (count >= 2) {
					System.out.println(count / 2 + "|" + k);
				}
				if (count % 2 == 1) {
					System.out.println("0|" + k);
				}
			} else {
				System.out.println(count + "|" + k);
			}
		}
	}

	private static void updateBasket(String ip) {
		if (!tm.containsKey(ip)) {
			tm.put(ip, 1);
		} else {
			int count = tm.get(ip);
			tm.put(ip, count + 1);
		}
	}
}