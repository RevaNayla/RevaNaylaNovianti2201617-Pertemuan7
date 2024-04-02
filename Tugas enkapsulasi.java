import java.util.Scanner;

public class TugasEnkapsulasi {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai a, b, c, d, e, dan f:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation();
        equation.setCoefficients(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("Solusi x: " + equation.getX());
            System.out.println("Solusi y: " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        scanner.close();
    }
}
