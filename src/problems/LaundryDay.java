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
	static TreeMap<String, Integer> tm = new TreeMap<>();

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		while (stdin.hasNextLine()) {
			System.out.println(stdin.nextLine());
		}
		stdin.close();
	}

}