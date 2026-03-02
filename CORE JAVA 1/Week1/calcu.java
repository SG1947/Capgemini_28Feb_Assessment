package newprog;

import java.util.Scanner;

public class calcu{

    // varargs method
    static double add(double... nums) {
        double sum = 0;

        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of terms: ");
        int n = sc.nextInt();

        double[] values = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            values[i] = sc.nextDouble();
        }

        // passing array to varargs
        double result = add(values);

        System.out.println("Sum = " + result);
    }
}

