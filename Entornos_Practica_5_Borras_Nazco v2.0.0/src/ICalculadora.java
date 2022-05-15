

/**
* Interfaz calculadora con los m�todos sumar, restar, multiplicar y dividir.
* @author Xavier Borr�s y Miguel Marcos.
*/
public interface ICalculadora {

	/**
	 * M�todo que suma dos n�meros (a y b).
	 * @param a Primer valor a sumar.
	 * @param b Segundo valor a sumar.
	 */
	static int sumar(int a, int b) {
		return a+b;
	}

	/**
	 * M�todo que resta dos n�meros (a y b).
	 * @param a Primer valor a restar.
	 * @param b Segundo valor a restar.
	 */
	static int restar(int a, int b) {
		return a-b;
	};
	
	/**
	 * M�todo que multiplica dos n�meros (a y b).
	 * @param a Primer valor a multiplicar.
	 * @param b Segundo valor a multiplicar.
	 */
	static int multiplicar(int a, int b) {
		return a*b;
	};
	
	/**
	 * M�todo que divide dos n�meros (a y b).
	 * @param a Primer valor a dividir.
	 * @param b Segundo valor a dividir.
	 */
	static int dividir(int a, int b) {
		return a/b;
	};
	
}
