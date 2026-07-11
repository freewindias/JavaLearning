import java.util.Scanner;

/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {
        Scanner keybaord = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double num1 = keybaord.nextDouble();

        System.out.println("Enter Second Number: ");
        double num2 = keybaord.nextDouble();

        System.out.println("Enter the Operator: ");
        if (keybaord.hasNextLine()) {
            keybaord.nextLine();
        }
        String operator = keybaord.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            
            case "-":
                result = num1 - num2;
                break;

                case "*":
                result = num1 * num2;
                break;

                case "/":
                result = num1 / num2;
                break;
        
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println("Result: " + result);
    }
}