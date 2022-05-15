

/**
* Interfaz calculadora con los métodos sumar, restar, multiplicar y dividir.
* @author Xavier Borrás y Miguel Marcos.
*/
public interface ICalculadora {

	/**
	 * Método que suma dos números (a y b).
	 * @param a Primer valor a sumar.
	 * @param b Segundo valor a sumar.
	 */
	static int sumar(int a, int b) {
		return a+b;
	}

	/**
	 * Método que resta dos números (a y b).
	 * @param a Primer valor a restar.
	 * @param b Segundo valor a restar.
	 */
	static int restar(int a, int b) {
		return a-b;
	};
	
	/**
	 * Método que multiplica dos números (a y b).
	 * @param a Primer valor a multiplicar.
	 * @param b Segundo valor a multiplicar.
	 */
	static int multiplicar(int a, int b) {
		return a*b;
	};
	
	/**
	 * Método que divide dos números (a y b).
	 * @param a Primer valor a dividir.
	 * @param b Segundo valor a dividir.
	 */
	static int dividir(int a, int b) {
		return a/b;
	};
	
}
