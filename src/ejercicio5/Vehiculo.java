package ejercicio5;

public abstract class Vehiculo {
	
	private int peso;
	public final void setPeso(int p){peso=p;}
	public abstract int getVelocidadActual();
	
	//¿Podrá tener descendencia esta clase?
	/**Si podra tener descendencia ya que es una clase abstracta y esta pensada para ser generica y no poder crear objetos
	 * de es clase, sino crear subclases de las cuales si se podran crear objetos de ellas*/
	
	//¿Se pueden sobrescribir todos sus métodos?
	/**No se pueden sobrescribir todo los metodos ya que el metodo setPeso(int p) esta declarado como final,
	 *y cuando declaramos un metodo como final le decimos al compilador que ese metodo no va a cambiar
	 *y no va a ser sobrescrito.*/

}
