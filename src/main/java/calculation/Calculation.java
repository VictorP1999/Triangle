package calculation;

/**
 * Created by BOSS on 28.06.2016.
 */
public class Calculation {
    public static void Calculation (int a, int b, int c) {
        if (a+b<c || a+c<b || c+b<a ) {
            System.out.println("Такого треугольника не существует");
        }

                else {
             if (a == b && a==c) {
                System.out.println("Треугольник равносторонний");
            }
            else {

                if (a == c || a==b || c==b) {
                    System.out.println("Треугольник равобедренный");
                }
            }
                double P = (a + b + c);
                System.out.print("Периметр = ");
                System.out.println(P);
                double cosa = ((b * b + c * c - a * a) / (2 * b * c));
                double sina = Math.sqrt(1 - cosa * cosa);
                double S = (0.5 * b * c * sina);
                System.out.print("Площадь = ");
                System.out.println(S);
                System.out.println();

        }
            }
        }


