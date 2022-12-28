//main

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.print("Select menu: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
          case 1:
            System.out.print("\nInput panjang sisi persegi : ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nHasil kalkulasi: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nInput jari-jari lingkaran : ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\nHasil kalkulasi: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nInput sisi atas trapesium: ");
            double a = scanner.nextDouble();
            System.out.print("Input panjang sisi alas trapesium: ");
            double b = scanner.nextDouble();
            System.out.print("Input tinggi trapesium: ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nHasil kalkulasi: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram End");
            break;
          default:
            System.out.println("\nOption not available");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input must be a number====");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    scanner.close();
  }
}