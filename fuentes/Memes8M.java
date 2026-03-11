/**
	Fichero con la clase principal del programa

	@author Miguel Jaque Barbero
	@date 8 de marzo de 2026.
**/


/**
	Clase principal del programa.
**/
public class Memes8M{

	/**
		Método inicial del programa.

		@param args Array de argumentos de la línea de comando. No se utilizan.
	**/
	public static void main(String[] args){
		presentar();
		System.out.println("El número doblado es " + ejecutarMetodo1(17));
		ejecutarMetodo2();
	}

	/**
		Presenta el título y las instrucciones del programa.
	**/
	public static void presentar(){
		System.out.println("-- Juego de MEMES del 8 de Marzo -- ");
		System.out.println();
		System.out.println("¿Te dejas engañar por los memes?");
	}

	/**
		Devuelve el doble del número recibido.
		@param numero El número a doblar.
		@return El doble del número recibido.
	**/
	public static Integer ejecutarMetodo1(Integer numero){
		return numero * 2;
	}

	public static void ejecutarMetodo2(){
		System.out.println("Método 2");
	}
	
}
