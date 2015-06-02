package ejercicio3;
import java.util.*;
import java.text.*;
public class Conversorfechas {
	
	public static String normalToAmericano(String fecha){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;
		try{
			d = sdf.parse(fecha);
		}catch(ParseException  e){		
			return "El formato de fecha no es el correcto";
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		return  Integer.toString(gc.get(Calendar.MONTH ) + 1) + "/" + Integer.toString(gc.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(gc.get(Calendar.YEAR));
	}
	
	public static String americanoToNormal(String fecha){
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date d = null;
		try{
			d = sdf.parse(fecha);
		}catch(ParseException  e){		
			return "El formato de fecha no es el correcto";
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		return  Integer.toString(gc.get(Calendar.DAY_OF_MONTH)) + "/"+ Integer.toString(gc.get(Calendar.MONTH ) + 1)+"/"+ Integer.toString(gc.get(Calendar.YEAR));
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Para convertir fecha normal a americano introduzca 1, para convertir de americano a normal introduzca 2");
		int con=Integer.parseInt(teclado.nextLine());
		if(con==1){
			System.out.println("Introduce la fecha en formato dd/MM/yyyy");
			String fecha=teclado.nextLine();
			System.out.println(Conversorfechas.normalToAmericano(fecha));
		}else if(con==2){
			System.out.println("Introduce la fecha en formato MM/dd/yyyy");
			String fecha=teclado.nextLine();
			System.out.println(Conversorfechas.americanoToNormal(fecha));
		}else{
			System.out.println("Debe introducir 1 o 2");
		}
		teclado.close();
	}
}
