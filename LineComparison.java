package com.bridgelabz.Day3PP2;

class LineEvaluate {
    public double calculateLineLength(int x1, int x2, int y1, int y2) {
        double fxValueOfSquare = Math.pow((x2-x1),2);
        double fyValueofSquare = Math.pow((y2-y1),2);
        double lengthOfLine = Math.sqrt(fxValueOfSquare + fyValueofSquare);
        return lengthOfLine;
    }

    public void callEqualsMethod(Double lineLengthOne, Double lineLengthTwo){
        //Used wrapper class to convert to object
        System.out.println("--- equals result ---");
        boolean equalsResult = lineLengthOne.equals(lineLengthTwo);
        if(equalsResult != true){
            System.out.println("Lines are not equal");
        }else{
            System.out.println("Lines are equal");
        }
        System.out.println();
    }

    public void callCompareToMethod(Double lineLengthOne, Double lineLengthTwo){
        //Used wrapper class to convert to object
        System.out.println("--- compareTo method result ---");
        int compareToResult = lineLengthOne.compareTo(lineLengthTwo);
        if(compareToResult > 0){
            System.out.println("first line is greater than second line");
        } else if (compareToResult < 0) {
            System.out.println("second line is greater than first line");
        } else if (compareToResult == 0) {
            System.out.println("Both lines are equal");
        }
        System.out.println();
    }
}
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("LINE COMPARISON CODE");
        LineEvaluate object = new LineEvaluate();

        double lineLengthOne = object.calculateLineLength(2,4,6,8);
        double lineLengthTwo = object.calculateLineLength(10,30,17,19);

        System.out.println("length of line one = " +lineLengthOne);
        System.out.println("length of line two = " +lineLengthTwo);

        object.callEqualsMethod(lineLengthOne,lineLengthTwo);
        object.callCompareToMethod(lineLengthOne,lineLengthTwo);
    }
}
