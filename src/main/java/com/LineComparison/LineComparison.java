package com.LineComparison;

public class LineComparison {

	// MAIN METHOD
	public static void main(String[] args) {

		// HERE DEFAULT CONSTRUCTOR TO BE CALLED PARAMETER AS (cordX1, cordX2, cordY1, cordY2)
		Line line1 = new Line(1, 4, 1, 4);
		Line line2 = new Line(1, 4, 1, 4);

		// DISPLAYING THE MESSAGE
		System.out.println("           Welcome to Line Comparison Computation Program          ");
		System.out.println("-------------------------------------------------------------------");

		// LINES COMPARISION BY equals() METHOD
		if (line1.equals(line2)) {
			System.out.println("Lines are equal");

		} else {
			System.out.println("Lines are not equal");
		}

	}
}
