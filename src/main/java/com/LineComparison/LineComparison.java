package com.LineComparison;

public class LineComparison {

	// MAIN METHOD
	public static void main(String[] args) {

		// HERE DEFAULT CONSTRUCTOR TO BE CALLED PARAMETER AS (cordX1, cordX2, cordY1,cordY2)
		Line line1 = new Line(1, 4, 1, 6);
		Line line2 = new Line(1, 4, 1, 4);

		// DISPLAYING THE MESSAGE
		System.out.println("           Welcome to Line Comparison Computation Program          ");
		System.out.println("-------------------------------------------------------------------");

		// LINES COMPARISION BY compareTo() METHOD
		int comparedResult = line1.compareTo(line2);
		if (comparedResult == 0) {
			System.out.println("Lines are equal");
		} else if (comparedResult == -1) {

			System.out.println("Line 1 is smaller than Line 2");
		} else {
			System.out.println("Line 1 is greater than Line 2");
		}
	}
}


