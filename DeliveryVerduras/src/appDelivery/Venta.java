package appDelivery;

public class Venta {
	private int folio;
	private int monto;
	
	public Venta(int folio, int monto) {
		
		this.folio = folio;
		this.monto = monto;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	

}
