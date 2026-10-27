import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CuentaTest {

	private static Cuenta cuent;
	private static double inicio=0;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 cuent = new Cuenta(inicio);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		cuent.ingreso(25);
		assertEquals(25,cuent.getSaldo());
	}
	
	@Test
	void testReIntregro() {
		cuent.ingreso((25));
		cuent.reintegro(25);
		assertEquals(0,cuent.getSaldo());
	}
}
