package ejercicio7;
import java.util.Scanner;

public class UltimaCifra {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=teclado.nextInt();
		teclado.close();
		String numString=Integer.toString(num);
		System.out.println("El ultimo digito de "+num+" es "+numString.charAt( numString.length()-1));
	}
}
