package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FacturaTest {

	static Factura f;
	static Producto p1, p2, p3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		f = new Factura();
		p1 = new Producto("limone", 0.7f, 3);
		p2 = new Producto("patata", 0.5f, 5);
		p3 = new Producto("naranja", 0.4f, 7);
		f.meterProducto(p1);
		f.meterProducto(p2);
		f.meterProducto(p3);
	}

	@Test
	void testTotalFactura() {
		assertEquals(f.totalFactura(), p1.precioTotal() + p2.precioTotal() + p3.precioTotal());
	}

	@Test
	void testAplicarIva() {
		float iva = 0.21f;
		assertEquals(f.aplicarIva(iva), f.totalFactura() + f.totalFactura() * iva);
	}

}
