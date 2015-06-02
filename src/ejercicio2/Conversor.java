package ejercicio2;

import java.util.Scanner;

public class Conversor {
	private int num;
	Conversor(int num){
		this.num=num;
	}
	public String getNuemro(char para){
		switch(para){
		case 'B':
		case 'b':
			return Integer.toBinaryString(this.num);
		case 'H':
		case 'h':
			return Integer.toHexString(this.num);
		case 'O':
		case 'o':
			return Integer.toOctalString(this.num);
		default:
			return "Parametro no valido";
		}
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el numero a convertir");
		int num=teclado.nextInt();
		Conversor conver=new Conversor(num);
		System.out.println("Introduce al tipo a convertir:B=binario, H=hexadecimal, O=octal");
		char para=teclado.next().charAt(0);
		teclado.close();
		System.out.println(conver.getNuemro(para));
	}
}
