package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductoTest {

	static Producto p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		p = new Producto("pan", 0.5f, 1);
	}

	@Test
	void testNuevo() {
		assertEquals(p.getNombre(), "pan");
		assertEquals(p.getCantidad(), 1);
		assertEquals(p.getPrecio(), 0.5f);
	}

	@Test
	void testPrecioTotal() {
		assertEquals(p.precioTotal(), p.getCantidad() * p.getPrecio());
	}

}
