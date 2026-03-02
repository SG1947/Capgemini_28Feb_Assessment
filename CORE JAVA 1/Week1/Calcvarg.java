package newprog;

import java.util.Scanner;

public class Calcavrg{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        boolean firstNumber = true;

        System.out.println("Enter numbers and '+' operator. Press '=' to calculate.");

        while (true) {
            String input = sc.nextLine().trim();

            if (input.equals("=")) {
                break;
            }

            if (input.equals("+")) {
                // just skip, since we only support addition
                continue;
            }

            // Convert number from string
            int num = Integer.parseInt(input);

            if (firstNumber) {
                result = num;
                firstNumber = false;
            } else {
                result += num;
            }
        }

        System.out.println("Result = " + result);
        sc.close();
    }
    
    public static int add(int ... num) {
    	int sum=0;
    	for(int i:num) {
    		sum+=i;
    	}
    	return sum;
    }
}
