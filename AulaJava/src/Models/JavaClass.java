package Models;

import java.util.Locale;
import java.util.Scanner;

    public class JavaClass {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            double width = sc.nextDouble();
            double length = sc.nextDouble();
            double metroSquare = sc.nextDouble();
            double area = width * length;
            double price = area * metroSquare;
            System.out.printf("AREA = %.2f%n", area);
            System.out.printf("PRICE = %.2f%n", price);
            sc.close();
        }
}
