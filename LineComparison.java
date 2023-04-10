package com.bridgelabz.Day3PP2;

class CommanMethods {
    //This class contains methods for : equals,compareTo,power,squareRoot calculation.
    static boolean callEqualsMethod(String line1, String line2){
        System.out.print("RESULT OF equals method --> ");
        return line1.equals(line2);
    }

    static int callCompareToMethod(String line1, String line2){
        System.out.print("RESULT OF compareTo method --> ");
        return line1.compareTo(line2);
    }

    static double calculatePower(double temp1, double temp2){
        double powerResult = Math.pow((temp2 - temp1),2);
        return powerResult;
    }

    static double calculateSquareRoot(double temp1, double temp2){
        double squareRootResult = Math.sqrt(temp1 + temp2);
        return squareRootResult;
    }

}
class LineEvaluate extends CommanMethods{
    //This class has line variables(instance) and calculate two lines values

    //object level variables
    //Line1 data points (firstX)
    double fX1, fX2;
    double fY1, fY2;

    //Line2 data points (secondX)
    double sX1, sX2;
    double sY1, sY2;

    void evaluate(){
        double fxValueOfSquare = calculatePower(fX1,fX2);
        double fyValueofSquare = calculatePower(fY1,fY2);
        double lengthOfLine1 = calculateSquareRoot(fxValueOfSquare,fyValueofSquare);
        System.out.println("Line1 = " + lengthOfLine1);

        double sxValueOfSquare = calculatePower(sX1,sX2);
        double syValueofSquare = calculatePower(sY1,sY2);
        double lengthOfLine2 = calculateSquareRoot(sxValueOfSquare,syValueofSquare);
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

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("LINE COMPARISON CODE");
        LineEvaluate object = new LineEvaluate();
        object.fX1 = 2; object.fX2 = 4;
        object.fY1 = 6; object.fY2 = 8;

        object.sX1 = 10; object.sX2 = 30;
        object.sY1 = 17; object.sY2 = 19;

        object.evaluate();
    }
}

