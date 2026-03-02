package newprog;

import java.util.Scanner;
public static void varArgs(double ... d ) {//0..1....n arguments
public class Calculator {

    static Scanner userInput = new Scanner(System.in);
    
    public static Expression input() {
        Expression expression = new Expression();

        System.out.println("Enter operand 1:");
        expression.operand1 = userInput.nextDouble();

        System.out.println("Enter operator (+ - * /):");
        expression.operator = userInput.next().charAt(0);

        System.out.println("Enter operand 2:");
        expression.operand2 = userInput.nextDouble();

        return expression;
    }

    static void addition(double a, double b) {
    	
        System.out.println("Result: " + (a + b));
    }
    static void subtraction(double a, double b) {
        System.out.println("Result: " + (a - b));
    }
    static void multiplication(double a, double b) {
        System.out.println("Result: " + (a * b));
    }
    static void division(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void toContinue() {
        System.out.println("To continue enter y");
        char selection = userInput.next().charAt(0);
        if (selection != 'y') {
            userInput.close();
            System.out.println("----EXIT----");
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        do {
            Expression expression = input();

            switch (expression.operator) {
                case '+':
                    addition(expression.operand1, expression.operand2);
                    break;

                case '-':
                    subtraction(expression.operand1, expression.operand2);
                    break;

                case '*':
                    multiplication(expression.operand1, expression.operand2);
                    break;

                case '/':
                    division(expression.operand1, expression.operand2);
                    break;

                default:
                    System.out.println("Invalid operator");
            }

            toContinue();

        } while (true);
    }
}
class Expression {
    double operand1,operand2;
    char operator;
}






//public class ContinuousCalculator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int choice;
//        double num1, num2;
//
//        do {
//            // Displaying the menu
//            System.out.println("\n--- Calculator Menu ---");
//            System.out.println("1. Addition (+)");
//            System.out.println("2. Subtraction (-)");
//            System.out.println("3. Multiplication (*)");
//            System.out.println("4. Division (/)");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            if (choice >= 1 && choice <= 4) {
//                System.out.print("Enter first number: ");
//                num1 = sc.nextDouble();
//                System.out.print("Enter second number: ");
//                num2 = sc.nextDouble();
//
//                switch (choice) {
//                    case 1:
//                        System.out.println("Result: " + (num1 + num2));
//                        break;
//                    case 2:
//                        System.out.println("Result: " + (num1 - num2));
//                        break;
//                    case 3:
//                        System.out.println("Result: " + (num1 * num2));
//                        break;
//                    case 4:
//                        if (num2 != 0) {
//                            System.out.println("Result: " + (num1 / num2));
//                        } else {
//                            System.out.println("Error: Division by zero is not allowed.");
//                        }
//                        break;
//                }
//            } else if (choice != 5) {
//                System.out.println("Invalid choice! Please try again.");
//            }
//
//        } while (choice != 5); // Continues until choice is 5
//
//        System.out.println("Exiting the calculator. Goodbye!");
//        sc.close();
//    }
//}
