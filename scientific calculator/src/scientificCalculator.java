//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class scientificCalculator {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            performOperation(scanner);

        }

        public static double add(double operator1, double operator2) {
            double result = operator1 + operator2;
            return result;
        }

       public static double subtract(double operator1, double operator2) {
           double result = operator1 - operator2;
           return result;
       }

       public static  double multiply(double operator1, double operator2) {
           double result = operator1 * operator2;
           return result;
       }

       public static double divide(double operator1, double operator2) {
           double result = operator1 / operator2;
           return result;
       }

       public static double powerOperation(double operator1, double operator2) {
           double result = Math.pow(operator1, operator2);
           return result;
        }

       public static double sinOperation(double operator1) {
           double result = Math.sin(Math.toRadians(operator1));
           return result;
       }

       public static double cosOperation(double operator1) {
           double result = Math.cos(Math.toRadians(operator1));
           return result;
       }

       public static double tanOperation(double operator1) {
           double result = Math.tan(Math.toRadians(operator1));
           return result;
       }

       public static double calculateLogarithm(double operator1) {
           double result = Math.log(operator1);
           return result;
       }

       public static double calculateLogarithmBase10(double operator1) {
           double result = Math.log10(operator1);
           return result;
       }

       public static double calculateAbsolute(double operator1) {
           double result = Math.abs(operator1);
           return result;
       }

       public static long roundNumber(double operator1) {
           long result = Math.round(operator1);
           return result;
       }

       public static double ceiling(double operator1) {
           double result = Math.ceil(operator1);
           return result;
       }

       public static  double floorNumber(double operator1) {
            double result = Math.floor(operator1);
            return result;
       }

       public static double findMinNumber(double operator1, double operator2) {
            double result = Math.min(operator1, operator2);
            return result;
       }
       public static double findMaxNumber(double operator1, double operator2) {
           double result = Math.max(operator1, operator2);
           return result;
       }

       public static void dispalyMenu() {
           System.out.println("========== Scientific Calculator Menu ==========");
           System.out.println("1. +   Addition");
           System.out.println("2. -   Subtraction");
           System.out.println("3. *   Multiplication");
           System.out.println("4. /   Division");
           System.out.println("5. ^   Power");
           System.out.println("6. sin   Sine");
           System.out.println("7. cos   Cosine");
           System.out.println("8. tan   Tangent");
           System.out.println("9. ln    Natural Logarithm (base e)");
           System.out.println("10. log  Logarithm base 10");
           System.out.println("11. abs  Absolute value");
           System.out.println("12. round Round the number");
           System.out.println("13. ceil  Round up");
           System.out.println("14. floor Round down");
           System.out.println("15. min   Minimum of two numbers");
           System.out.println("16. max   Maximum of two numbers");
       }

       public static void performOperation(Scanner scanner) {
           System.out.println("Enter the first opretor: ");
           double operator1 = scanner.nextDouble();
           System.out.println("enter the second operator: ");
           double operator2 = scanner.nextDouble();
           dispalyMenu();
           String operation = scanner.next();

           switch (operation) {
               case "+":
                   System.out.println(operator1 + " " + operation + " " + operator2 + " " + "=" + add(operator1, operator2));
                   break;

               case "-":
                   System.out.println(operator1 + " " + operation + " " + operator2 + " " + "=" + subtract(operator1, operator2));
                   break;

               case "*":
                   System.out.println(operator1 + " " + operation + " " + operator2 + " " + "=" + multiply(operator1, operator2));
                   break;

               case "/":
                   System.out.println(operator1 + " " + operation + " " + operator2 + " " + "=" + divide(operator1, operator2));
                   break;

               case "^":
                   System.out.println(operator1 + " " + operation + " " + operator2 + " " + "=" + powerOperation(operator1, operator2));
                   break;

               case "sin":
                   System.out.println("sin" + " " + operator1 + " " + "=" + sinOperation(operator1));
                   break;

               case "cos":
                   System.out.println("cos" + " " + operator1 + " " + "=" + cosOperation(operator1));
                   break;

               case "tan":
                   System.out.println("tan" + " " + operator1 + " " + "=" + tanOperation(operator1));
                   break;

               case "ln":
                   System.out.println("ln" + " " + operator1 + " " + "=" + calculateLogarithm(operator1));
                   break;

               case "log":
                   System.out.println("log" + operator1 + " " + "=" + calculateLogarithmBase10(operator1));
                   break;

               case "abs":
                   System.out.println("abs" + " " + operator1 + " " + "=" + calculateAbsolute(operator1));
                   break;

               case "round":
                   System.out.println("round" + " " + operator1 + " " + "=" + roundNumber(operator1));
                   break;

               case "ceil":
                   System.out.println("ceil" + " " + operator1 + " " + "=" + ceiling(operator1));
                   break;

               case "floor":
                   System.out.println("floor" + " " + operator1 + " " + "=" + floorNumber(operator1));
                   break;

               case "min":
                   System.out.println("minimum(" + " " + operator2 + " and " + operator2 + ") " + "=" + findMinNumber(operator1, operator2));
                   break;

               case "max":
                   System.out.println("maximum(" + " " + operator2 + " and " + operator2 + ") " + "=" + findMaxNumber(operator1, operator2));
                   break;

               default:
                   System.out.println("Incorrect operation. Try again.");
                   break;

           }


       }


}