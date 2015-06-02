package ejercicio1;

public class moneda extends sorteo {
	public int lanzar(){
		if(Math.random()<=0.5){
			System.out.println("Cara");
			return 0;
		}else{
			System.out.println("Cruz");
			return 1;
		}
	}
}
