package appDelivery;

public class Inventario {
	private int stock;
	private String insumo;
	
	public Inventario(int stock, String insumo) {
		
		this.stock = stock;
		this.insumo = insumo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getInsumo() {
		return insumo;
	}

	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}
	
	

}
