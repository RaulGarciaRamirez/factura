package factura;

public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;

	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	
	public float precioTotal() {
		return precio * cantidad;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}


	public String getNombre() {
		return nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
