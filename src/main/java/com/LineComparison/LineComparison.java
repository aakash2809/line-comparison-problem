package com.LineComparison;

public class LineComparison {
	// MAIN METHOD
	public static void main(String[] args) {

		// DECLARATION OF CO-ORDINATE POINTS FOR LINE
		int x1, x2, y1, y2;
		double lengthOfLine;
		// ASSIGNING DEFAULT VALUES;
		x1 = 1;
		y1 = 1;
		x2 = 4;
		y2 = 4;

		// DISPLAYING THE MESSAGE
		System.out.println("           Welcome to Line Comparison Computation Program          ");
		System.out.println("-------------------------------------------------------------------");

		// FINDING THE LENGTH OF LINE AND ASSIGN IN VARIABLE OF DOUBLE TYPE
		lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		// DISPLAY THE LENGTH OF LINE
		System.out.println(" Length of Line is= " + lengthOfLine);

	}
}
