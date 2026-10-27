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
	
	@Test
    void test0014() {
		
        Cuenta c12345 = new Cuenta(50);
        c12345.setNumero("12345");

        Cuenta c67890 = new Cuenta(0);
        c67890.setNumero("67890");

       
        c12345.reintegro(200); 
        c67890.reintegro(350); 
        c12345.ingreso(100);   
        c67890.reintegro(200); 
        c67890.reintegro(150); 
        c12345.reintegro(200); 
        c67890.ingreso(50);    
        c67890.reintegro(100); 

        
        assertEquals(-250, c12345.getSaldo()); 
        assertEquals(-450, c67890.getSaldo()); 
    }
}
