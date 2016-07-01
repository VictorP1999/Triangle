package calculation;

/**
 * Created by Victor Penkin on 28.06.2016.
 */
public class Calculation {
    public static void Calculation (double a, double b, double c) {
        if (a+b<c || a+c<b || c+b<a ) {
            System.out.println("Такого треугольника не существует");
            return;
        }

        if (a == b && a==c) {
            System.out.println("Треугольник равносторонний");
        }
        if (a == c || a==b || c==b) {
            System.out.println("Треугольник равобедренный");
        }
        double P = (a + b + c);
        System.out.print("Периметр = ");
        System.out.println(P);
        double cosa = ((b * b + c * c - a * a) / (2 * b * c));
        System.out.println(cosa);
        double sina = Math.sqrt(1 - cosa * cosa);
        double alpha = Math.acos(cosa)/Math.PI*180;
        System.out.println(alpha);
        double S = (0.5 * b * c * sina);
        System.out.print("Площадь = ");
        System.out.println(S);
        System.out.println();


    }
}


