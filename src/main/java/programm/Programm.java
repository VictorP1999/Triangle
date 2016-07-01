package programm;
import calculation.Calculation;
import java.util.Scanner;

/**
 * Created by Victor on 28.06.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данная программа анализирует треугольник, имея на входе три его стороны (где стороны треугольника равны a, b , c)");
        System.out.println();
        while (true) {
            System.out.println("Введите а = ");
            int a = scanner.nextInt();
            System.out.println("Введите b = ");
            int b = scanner.nextInt();
            System.out.println("Введите c = ");
            int c = scanner.nextInt();
            Calculation.Calculation(a,b,c);
        }
        }
    }