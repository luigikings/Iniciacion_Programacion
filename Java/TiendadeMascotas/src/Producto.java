

public class Producto {

	// Atributos:
	private int idProducto;
	private String nombre;
	private float precio;
	private int cantidadStock;

	// Contructor:

	public Producto(int idProducto, String nombre, float precio, int cantidadStock) {

			this.idProducto = idProducto;
			this.nombre = nombre;
			this.precio = precio;
			this.cantidadStock = cantidadStock;
		}

	// metodos:

	public void reponerProducto(int cantidad) {
		this.cantidadStock += cantidad;
	}

	public void venderProducto(int cantidad) {
		this.cantidadStock -= cantidad;
	}

	// getters y setters:

	public int getidProducto() {
		return idProducto;
	}

	public void setidProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getnombreProducto() {
		return nombre;
	}

	public void setnombreProducto(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
}
