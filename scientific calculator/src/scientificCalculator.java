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
            System.out.println("Enter an operation: \n1. + \n2. - \n3. * \n4. / \n5. ^ \n6. sin \n7. cos \n8. tan \n9.ln \n10. log base 10 \n11. absolute \n12. round \n13. ceiling \n14. Floor \n15. minimum \n16. Maximum \n17. Display Menu \n18. Helper methods \n19. Exit");
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
}