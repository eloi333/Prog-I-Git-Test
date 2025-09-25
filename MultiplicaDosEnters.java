//MultiplicaDosEnters.java
import java.util.*;
public class MultiplicaDosEnters{
	public static void main (String[] args) {
		Scanner entrada;
		int x, y, mult;
		entrada = new Scanner (System.in);
		System.out.println("Introdueix un nombre enter");
		x = entrada.nextInt();
		System.out.println("Introdueix un nombre enter");
		y = entrada.nextInt();
		mult = x * y;
		System.out.println("La multiplicació és: " + mult);
	}
}
