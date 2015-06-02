package ejercicio1;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		dado d1=new dado();
		moneda m1=new moneda();
		Scanner teclado=new Scanner(System.in);
		System.out.println("Que desea lanzar dado o moneda");
		String lanzo=teclado.next();
		teclado.close();
		if(lanzo.equals("dado")){
			System.out.println(d1.lanzar());
		}else if(lanzo.equals("moneda")){
			System.out.println(m1.lanzar());
		}else{
			System.out.println("Debe elegir entre dado o moneda");
		}
	}
}
