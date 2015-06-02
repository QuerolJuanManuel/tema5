package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		final String s1=new String("Hola");
		String s2=new String(" Mundo");
		//s1=s1+s2;
		System.out.println(s1);
		/**El error que da al hacer (s1=s1+s2) es el siguiente: 
		 * Exception in thread "main" java.lang.Error: Problema de compilación no resuelto: 
			*La variable local final s1 no puede asignarse. Debe estar en blanco y no utilizar una asignación compuesta.
			*y da este error por que el objeto (s1) esta declarado como final y cuando un objeto se declara final impide que haya
			*otro objeto con la misma referencia.*/
		s2=s1+s2;
		System.out.println(s2);
		/**Una soloucion seria utilizar el objeto (s2) en vez del (s1) para acumular la suma ya que (s2) no esta declarado como final
		 * y por tanto puedo haber otro objeto con la misma referencia */
	}
}
