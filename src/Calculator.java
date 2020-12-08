import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to this epic calculator");
        final Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();
            String[] tokens = input.split(" ");
            if (tokens.length != 3) {
                System.out.println("Invalid input");
                continue;
            }
            double left = Double.parseDouble(tokens[0]);
            String operator = tokens[1];
            double right = Double.parseDouble(tokens[2]);
            double result = calculator.calculate(left, operator, right);
            System.out.println(result);
        }
    }

    private Double calculate(double left, String operator, double right) {
        if (operator.equals("+")) {
            return left + right;
        } else if (operator.equals("-")) {
            return left - right;
        } else {
            return -1.0;
        }
    }
}
