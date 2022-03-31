package factura;

import java.util.ArrayList;
import java.util.List;

public class Factura {
	private List<Producto> productos;

	public Factura() {
		productos = new ArrayList<>();
	}

	public void meterProducto(Producto p) {
		productos.add(p);
	}

	public float totalFactura() {
		float total = 0;

		for (Producto producto : productos) {
			total += producto.precioTotal();
		}

		return total;
	}

	public float aplicarIva(float iva) {
		float total = totalFactura();
		total += total * iva;
		return total;
	}
}
