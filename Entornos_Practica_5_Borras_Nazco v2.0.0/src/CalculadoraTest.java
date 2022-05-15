import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		int resultado = calculadora.sumar(0,-1);
		int esperado = -1;
		assertEquals(esperado,resultado);
	}
	@Test
	public void testRestar() {
		int resultado = calculadora.restar(-1,-1);
		int esperado = 0;
		assertEquals(esperado,resultado);
	}
	@Test
	public void testMultiplicar() {
		int resultado = calculadora.multiplicar(8,789);
		int esperado = 6312;
		assertEquals(esperado,resultado);
	}
	@Test
	public void testDividir() {
		int resultado = calculadora.dividir(10,2);
		int esperado = 5;
		assertEquals(esperado,resultado);
	}
}
