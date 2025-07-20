//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class scientificCalculator {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first opretor: ");
            double operator1 = scanner.nextDouble();
            System.out.println("enter the second operator: ");
            double operator2 = scanner.nextDouble();
            dispalyMenu();
            String operation = scanner.next();
            System.out.println(operator1 + " " + operation + " " + operator2 + " " + "=" + " ");
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
}