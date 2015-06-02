package ejercicio6;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		double num1=teclado.nextDouble();
		System.out.println("Introduce el segundo numero");
		double num2=teclado.nextDouble();
		teclado.close();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
		if(Double.isInfinite(num1/num2)){
			System.out.println("no se puede dividir por 0");
		}else{
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}
		if(Double.isNaN(num1%num2)){
			System.out.println("no se puede dividir por 0");
		}else{
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		}
	}
}
