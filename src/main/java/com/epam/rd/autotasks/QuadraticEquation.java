package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = new DecimalFormat("#.######");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = Math.pow(b, 2) - 4 * a * c;
        double x;
        double x1;
        double x2;
        if (d < 0) {
            System.out.println("no roots");
        } else if (d == 0) {
            x = -b / (2 * a);
            System.out.println(x);
        } else {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.print(nf.format(x1));
            System.out.print(" " + nf.format(x2));
        }
    }
}