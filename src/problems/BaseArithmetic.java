package problems;
//Problem        : Base Arithmetic

//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement 

import java.util.Scanner;

public class BaseArithmetic {
	public static int getVal(char a) {
		switch (a) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		// stdin
		String xog = stdin.nextLine();
		String yog = stdin.nextLine();

		// base
		int x = 0;
		int y = 0;
		int x10 = 0, y10 = 0;

		char[] xcarray = xog.toCharArray();
		char[] ycarray = yog.toCharArray();

		int[] xarray = new int[xcarray.length];
		int[] yarray = new int[ycarray.length];

		for (int i = 0; i < xarray.length; i++) {
			xarray[i] = getVal(xcarray[i]);
			if (x < xarray[i]) {
				x = xarray[i];
			}
		}
		x++;

		for (int i = 0; i < yarray.length; i++) {
			yarray[i] = getVal(ycarray[i]);
			if (y < yarray[i]) {
				y = yarray[i];
			}
		}
		y++;
		// convert to 10 base
		for (int base = 1, i = xarray.length - 1; i >= 0; i--, base *= x) {
			x10 += xarray[i] * base;
		}
		for (int base = 1, i = yarray.length - 1; i >= 0; i--, base *= y) {
			y10 += yarray[i] * base;
		}
		System.out.println(x10 + y10);
		stdin.close();
	}
}