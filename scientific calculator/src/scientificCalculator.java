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

    }