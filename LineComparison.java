package com.bridgelabz.Day3PP;

public class LineComparison {

    static boolean callEqualsMethod(String line1, String line2){
        System.out.print("RESULT OF equals method --> ");
        return line1.equals(line2);
    }

    static int callCompareToMethod(String line1, String line2){
        System.out.print("RESULT OF compareTo method --> ");
        return line1.compareTo(line2);
    }

    public static void main(String[] args) {
        System.out.println("LINE COMPARISON CODE");

        double fX1 = 2, fX2 = 4;
        double fY1 = 6, fY2 = 8;

        double sX1 = 10, sX2 = 30;
        double sY1 = 17, sY2 = 19;

        double fxValueOfSquare = Math.pow((fX2-fX1),2);
        double fyValueofSquare = Math.pow((fY2-fY1),2);
        double lengthOfLine1 = Math.sqrt(fxValueOfSquare + fyValueofSquare);
        System.out.println("Line1 = " + lengthOfLine1);

        double sxValueOfSquare = Math.pow((sX2-sX1),2);
        double syValueofSquare = Math.pow((sY2-sY1),2);
        double lengthOfLine2 = Math.sqrt(sxValueOfSquare + syValueofSquare);
        System.out.println("Line2 = " + lengthOfLine2);

        String line1 = String.valueOf(lengthOfLine1);
        String line2 = String.valueOf(lengthOfLine2);
        boolean equalsResult = callEqualsMethod(line1, line2);
        if(equalsResult != true){
            System.out.println("Lines are not equal");
        }else{
            System.out.println("Lines are equal");
        }

        int compareToResult = callCompareToMethod(line1, line2);
        if(compareToResult > 0){
            System.out.println("first line is greater than second line");
        } else if (compareToResult < 0) {
            System.out.println("second line is greater than first line");
        } else if (compareToResult == 0) {
            System.out.println("Both lines are equal");
        }
    }
}
