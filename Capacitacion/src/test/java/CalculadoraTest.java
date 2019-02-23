import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {



	@Test

	public void testSuma() {

		Calculadora cal = new Calculadora();

		int resultado = cal.suma(5,6);

		assertEquals(11, resultado);

	}

	@Test
	public void testresta() { 
		assertArrayEquals(2, cal.restar(5 , 3));


}}