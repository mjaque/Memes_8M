import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

class Memes8MTests {
    
	@Test
    @DisplayName("Test constructor válido")
    public void testConstructorValido() {
		Memes8M programa = new Memes8M();
		assertNotNull(programa, "El constructor devuelve null.");
	}

	@Test
	@DisplayName("Test se muestra título")
	public void testMuestraTitulo() {
		PrintStream salidaConsola = System.out;

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream salidaTest = new PrintStream(baos);
		System.setOut(salidaTest);
		try{
			Memes8M.main(null);
		}
		catch(Exception e){
			e.printStackTrace();
			fail("Excepción inesperada.");
		}
		System.setOut(salidaConsola);
		String salida = baos.toString();
		assertTrue(salida.contains("Juego de MEMES del 8 de Marzo"), "La salida no contiene el título esperado.");
	}

	@Test
	@DisplayName("Test de ejecutarMetodo1")
	public void testEjecutarMetodo1() {
		try{
			Integer resultado = Memes8M.ejecutarMetodo1(13);
			assertEquals(26, resultado, "El método ejecutarMetodo1 no calcula bien el doble.");
		}
		catch(Exception e){
			e.printStackTrace();
			fail("Excepción inesperada.");
		}
	}
}
