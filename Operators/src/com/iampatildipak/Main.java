package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // Operators are special symbols in Java that performs specific operations on one, two, or three operands,
        // and then return result.

        //An Operand is a term used to describe any object that is manipulated by an operator.

        int myVar = 15 + 12; // + is operator, 15 and 12 are operands
        System.out.println(myVar);

        //What is expression?
        //An expression is formed by combining variables, literals, method return values and operands.

        float hoursWorked = 8.5f;
        float hourlyRate = 1000f;
        double mySalary = hoursWorked * hourlyRate;
        System.out.println(mySalary);

        // = operator is assignment operator
        // + - % * are basic maths operators

        //Logical operators  !, >, <, >=, <= AND (&&), OR (||)
        //& is bitwise operator
        int topScore = 80;

        if (topScore >= 100) {
            System.out.println("You got high score!");
        }

        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || topScore < 100) {
            System.out.println("Greater than 90 top score and less than 100");
        }

        // Ternary operator
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");
    }
}