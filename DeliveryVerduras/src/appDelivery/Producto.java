package appDelivery;

public class Producto {
	private String nombre;
	private int id_producto;
	
	public Producto(String nombre, int id_producto) {
		
		this.nombre = nombre;
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	

}
