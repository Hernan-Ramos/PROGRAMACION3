package clase_05;

public class Producto {
	String nombre,estado;
	public int precio,cantidad,aniodevec;
	public Producto(String nombre, String estado, int precio, int cantidad, int aniodevec) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.precio = precio;
		this.cantidad = cantidad;
		this.aniodevec = aniodevec;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getAniodevec() {
		return aniodevec;
	}
	public void setAniodevec(int aniodevec) {
		this.aniodevec = aniodevec;
	}
	public void  mostrarProducto() {
		System.out.println("nombre del producto: " + this.nombre + " precio: " + this.precio + " cantidad: " + this.cantidad + " anio de vencimiento: " + this.aniodevec +  " estado " + this.estado );
	}
}
