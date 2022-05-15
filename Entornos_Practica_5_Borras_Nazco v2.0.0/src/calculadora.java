
import java.util.Scanner;

/**
* Clase calculadora con los m�todos sumar, restar, multiplicar y dividir implementados de la interfaz ICalculadora.
* @author Xavier Borr�s y Miguel Marcos.
*/
public class calculadora implements ICalculadora {
	
	/**
	 * M�todo que suma dos n�meros (a y b).
	 * @param a Primer valor a sumar.
	 * @param b Segundo valor a sumar.
	 * @return Devuelve el resultado de la suma.
	 */
	public static int sumar(int a, int b) {
		return a+ b;
	}

	/**
	 * M�todo que resta dos n�meros (a y b).
	 * @param a Primer valor a restar.
	 * @param b Segundo valor a restar.
	 * @return Devuelve el resultado de la resta.
	 */
	public static int restar(int a, int b) {
		
		return a-b;
	}

	/**
	 * M�todo que multiplica dos n�meros (a y b).
	 * @param a Primer valor a multiplicar.
	 * @param b Segundo valor a multiplicar.
	 * @return Devuelve el resultado de la multiplicaci�n.
	 */
	public static int multiplicar(int a, int b) {
		return a*b;
	}

	/**
	 * M�todo que divide dos n�meros (a y b).
	 * @param a Primer valor a dividir.
	 * @param b Segundo valor a dividir.
	 * @return Devuelve el resultado de la divisi�n.
	 */
	public static int dividir(int a, int b) {
		return a/b;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		calculadora calculadora = new calculadora();
		int a = 0;
		int b = 0;
		int resultado = 0;
		int opcion = 0;
		
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("");
		System.out.print("Introduzca la operaci�n que desea realizar: ");
		opcion=input.nextInt();
		
		
		switch (opcion) {
		
		// SUMA
		case 1:
		System.out.print("Introduzca el primer valor: ");
		a=input.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		b=input.nextInt();
		
		resultado=calculadora.sumar(a, b);
		System.out.print("El resultado de la suma es: "+resultado);
		break;
		
		// RESTA
		case 2:
		System.out.print("Introduzca el primer valor: ");
		a=input.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		b=input.nextInt();
		
		resultado=calculadora.restar(a, b);
		System.out.print("El resultado de la resta es: "+resultado);
		break;
		
		// MULTIPLICACI�N
		case 3:
		System.out.print("Introduzca el primer valor: ");
		a=input.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		b=input.nextInt();
		
		resultado=calculadora.multiplicar(a, b);
		System.out.print("El resultado de la multiplicaci�n es: "+resultado);
		break;
		
		// DIVISI�N
		case 4:
		System.out.print("Introduzca el primer valor: ");
		a=input.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		b=input.nextInt();
		
		resultado=calculadora.dividir(a, b);
		System.out.print("El resultado de la divisi�n es: "+resultado);
		break;
		
		}
	}
}