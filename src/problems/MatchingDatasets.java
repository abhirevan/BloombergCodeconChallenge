package problems;
//Problem        : Base Arithmetic

import java.util.*;

//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT
//Problem Statement /doc/MatchingDatasets.pdf

public class MatchingDatasets {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		Integer n_ip = new Integer(stdin.nextLine());
		ArrayList<ArrayList<Double>> lst1 = new ArrayList<>();
		ArrayList<ArrayList<Double>> lst2 = new ArrayList<>();
		Double minDiff = Double.MAX_VALUE;
		Double sumDiff = 0.0;
		int minIndex = 0;
		// Read list 1
		for (int i = 0; i < n_ip; i++) {
			String ipLine = stdin.nextLine();
			String[] ipParts = ipLine.split(",");
			ArrayList<Double> subLst = new ArrayList<>();
			lst1.add(subLst);
			for (String s : ipParts) {
				subLst.add(new Double(s));
			}
		}
		// Read list 2
		for (int i = 0; i < n_ip; i++) {
			String ipLine = stdin.nextLine();
			String[] ipParts = ipLine.split(",");
			ArrayList<Double> subLst = new ArrayList<>();
			lst2.add(subLst);
			for (String s : ipParts) {
				subLst.add(new Double(s));
			}
		}
		stdin.close();
		// Print nearest pairs in the list
		for (int i1 = 0; i1 < n_ip; i1++) {
			minIndex = 0;
			minDiff = Double.MAX_VALUE;
			for (int i2 = 0; i2 < n_ip; i2++) {
				sumDiff = 0.0;

				for (int j = 0; j < lst1.get(i1).size(); j++) {
					sumDiff += Math.abs(lst1.get(i1).get(j) - lst2.get(i2).get(j));
				}
				if (sumDiff < minDiff) {
					minIndex = i2;
					minDiff = sumDiff;
				}
			}
			System.out.println(i1 + "," + minIndex);
		}
	}
}
