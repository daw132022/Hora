package examen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HoraTest {
	
	Hora H = new Hora();
	
	@Test
	public void Valido() {

		assertTrue(H.validarHora(59, 59, 23));
	}

	
	@Test
	public void noValido() {

		assertFalse(H.validarHora(59, 59, 25));
		assertFalse(H.validarHora(59, 70, 23));
		assertFalse(H.validarHora(70, 59, 23));
	}

}
