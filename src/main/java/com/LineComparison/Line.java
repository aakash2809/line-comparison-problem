package com.LineComparison;

public class Line {

	// DECLARATION OF LINE CO-ORDINATE
	int cordX1;
	int cordX2;
	int cordY1;
	int cordY2;

	// CONSTRUCTOR
	public Line(int cordX1, int cordX2, int cordY1, int cordY2) {
		super();
		this.cordX1 = cordX1;
		this.cordX2 = cordX2;
		this.cordY1 = cordY1;
		this.cordY2 = cordY2;
	}

	// METHOD TO CALCULATE THE LENGTH OF LINE
	public static double computeLengthOfLine(int x1, int x2, int y1, int y2) {

		double lengthOfLine;
		lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lengthOfLine;
	}

	// OVERRIDE THE OBJECT CLASS equals() METHOD
	@Override
	public boolean equals(Object obj) {

		Line obj1 = (Line) obj;

		// CALL computeLengthOfLine() METHOD TO FIND THE LENGTH OF LINE 1
		double lengthOfLine1 = computeLengthOfLine(this.cordX1, this.cordX2, this.cordY1, this.cordY2);
		// CALL computeLengthOfLine() METHOD TO FIND THE LENGTH OF LINE 2
		double lengthOfLine2 = computeLengthOfLine(obj1.cordX1, obj1.cordX2, obj1.cordY1, obj1.cordY2);

		if (lengthOfLine1 == lengthOfLine2) {
			return true;

		} else {
			return false;
		}

	}

}
