// Expressions2.java
public class Expressions2 {
    public static void main(String[] args) {

        {
            int a = 31, b = 2, c = 2, d;
            d = a / b / c;
            System.out.println("d = " + d);
        }

        {
            int a = 10, b = 2, c = 2, d;
            d = a / (b / c);
            System.out.println("d = " + d);
        }

        {
            double x = 31, y = 3, z = 2, u;
            u = x / (y / z);
            System.out.println("u = " + u);
        }

        {
            int i = 2, j = 2;
            i = i * (i + j);
            System.out.println("i = " + i);
        }

        {
            float i = 3;
            float x = -1.25f;
            i = i - x;
            System.out.println("i = " + i);
        }

        {
            int i = 8, k = 11;
            i = i % (k - 3);
            System.out.println("i = " + i);
        }

        {
            int a, b = 11;
            a = (b / 3) + 2;
            System.out.println("a = " + a);
        }

        {
            int a, b = 10;
            a = b + 3 / 2;
            System.out.println("a = " + a);
        }

        {
            double x = 2.5, y = 1.3, z;
            z = (int)x % (int)y;
            System.out.println("z = " + z);
        }

        {
            int a, b;
            a = 10;
            b = (a == 1) ? 20 : 30;
            System.out.println("b = " + b);
        }
    }
}

