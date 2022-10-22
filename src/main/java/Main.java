import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        String selection;
        int first;
        int second;
        while (true) {
            System.out.println("Enter add, subtract, multiply, divide, fibonacci, binary, or exit:");
            selection = scanner.nextLine();
            switch (selection) {
                case "add":
                    System.out.println("Enter 1st integer:");
                    first = scanner.nextInt();
                    System.out.println("Enter 2nd integer:");
                    second = scanner.nextInt();
                    System.out.printf("%d + %d = %d\n", first, second, calculator.add(first, second));
                    break;
                case "subtract":
                    System.out.println("Enter 1st integer:");
                    first = scanner.nextInt();
                    System.out.println("Enter 2nd integer:");
                    second = scanner.nextInt();
                    System.out.printf("%d - %d = %d\n", first, second, calculator.subtract(first, second));
                    break;
                case "multiply":
                    System.out.println("Enter 1st integer:");
                    first = scanner.nextInt();
                    System.out.println("Enter 2nd integer:");
                    second = scanner.nextInt();
                    System.out.printf("%d * %d = %d\n", first, second, calculator.multiply(first, second));
                    break;
                case "divide":
                    System.out.println("Enter 1st integer:");
                    first = scanner.nextInt();
                    System.out.println("Enter 2nd integer:");
                    second = scanner.nextInt();
                    System.out.printf("%d / %d = %d\n", first, second, calculator.divide(first, second));
                    break;
                case "fibonacci":
                    System.out.println("Enter n to view nth fibonacci number:");
                    first = scanner.nextInt();
                    System.out.printf("fibonacci(%d) = %d\n", first, calculator.fibonacciNumberFinder(first));
                    break;
                case "binary":
                    System.out.println("Enter a number to view as binary:");
                    first = scanner.nextInt();
                    System.out.printf("%d -> %s\n", first, calculator.intToBinaryNumber(first));
                    break;
                default:
                    return;
            }
            String trash = scanner.nextLine();
        }
    }
}
