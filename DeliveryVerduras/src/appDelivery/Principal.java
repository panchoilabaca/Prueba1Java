
package appDelivery;

import java.util.ArrayList;

public class Principal {
	
	

	public static void main(String[] args) {
		
		Personal personal1 = new Personal("Francisco", "Tomador de pedidos");
		Personal personal2 = new Personal("Juan", "Preparador de pedidos");
		Personal personal3 = new Personal("Luis", "Preparador de pedidos");
		Personal personal4 = new Personal("Andrés", "Encargado de compras");
		Personal personal5 = new Personal("Cesar", "Repartidor");
		Personal personal6 = new Personal("José" , "Repartidor");
		Personal personal7 = new Personal("Nelson ", "Encargado de bodega");
		
		Producto producto1 = new Producto("Papas" , 0001);
		Producto producto2 = new Producto("Tomates" , 0002);
		Producto producto3 = new Producto("Cebollas" , 0003);
		Producto producto4 = new Producto("Porotos" , 0004);
		Producto producto5 = new Producto("Manzanas" , 0005);
		Producto producto6 = new Producto("Naranjas" , 0006);
		
		Cliente cliente1 = new Cliente("Antonio" , "Los Cobres 012");
		Cliente cliente2 = new Cliente("Rodrigo" , "Los Pajaros 023");
		Cliente cliente3 = new Cliente("Roberto" , "Los Cerezos 045");
		
		Proveedor proveedor1 = new Proveedor("Don Cesar" , "Mercado Lo Valledor");
		Proveedor proveedor2 = new Proveedor("Los Castaños" , "Mercado Lo Valledor");
		Proveedor proveedor3 = new Proveedor("Tomasito" , "La Vega Central");
		Proveedor proveedor4 = new Proveedor("Bertita" , "La Vega Central");
		Proveedor proveedor5 = new Proveedor("Doña Maria" , "Mercado Lo Valledor");
		Proveedor proveedor6 = new Proveedor("Don Mario" , "La Vega Central");
		
		
		
		Inventario inventario1 = new Inventario(200 , "Papas");
		Inventario inventario2 = new Inventario(200 , "Tomates");
		Inventario inventario3 = new Inventario(200 , "Cebollas");
		Inventario inventario4 = new Inventario(200 , "Porotos");
		Inventario inventario5 = new Inventario(200 , "Manzanas");
		Inventario inventario6 = new Inventario(200 , "Naranjas");
		
		Venta venta1 = new Venta(111 , 15000);
		Venta venta2 = new Venta(112 , 10000);
		Venta venta3 = new Venta(113 , 20000);
		
		ArrayList<String> Personal = new ArrayList<String>();
		Personal.add("Francisco: Tomador de pedidos");
		Personal.add("Juan: Preparador de pedidos");
		Personal.add("Luis: Preparador de pedidos");
		Personal.add("Andrés: Encargado de compras");
		Personal.add("Cesar: Repartidor");
		Personal.add("Jose: Repartidor");
		Personal.add("Nelson: Encargado de bodega");
		
		System.out.println("----------------------------------------App Delivery Francisco Frutas y Verduras----------------------------------");
		System.out.println("\n---------------------------------------Venta 1-------------------------------------------------------------------");
		System.out.println(" El cliente " + cliente1.getNombre() + " Se comunica con " + personal1.getNombre() + " quien es nuestro " + personal1.getCargo() + " para solicitar 10 kg. de " + producto1.getNombre() + " con el ID " + producto1.getId_producto());
		System.out.println(" El cliente " + cliente1.getNombre() + " Solicita tambien 5 kg. de " + producto2.getNombre() + " con el ID " + producto2.getId_producto());
		System.out.println(" La dirección de entrega es " + cliente1.getDireccion());
		System.out.println(" El folio de la venta es " + venta1.getFolio() + " y el costo incluyendo delivery y propina es de " + venta1.getMonto());
		System.out.println(" El  empaque de los productos se le asignan a " + personal2.getNombre() + " quien es " + personal2.getCargo());
		System.out.println(" El delivery es realizado por " + personal5.getNombre() + " quien es " + personal5.getCargo() + " a la dirección " + cliente1.getDireccion());
		
		System.out.println("\n---------------------------------------Venta 2-------------------------------------------------------------------");
		System.out.println(" El cliente " + cliente2.getNombre() + " Se comunica con " + personal1.getNombre() + " quien es nuestro " + personal1.getCargo() + " para solicitar 10kg. de " + producto3.getNombre() + " con el ID " + producto3.getId_producto());
		System.out.println(" El cliente " + cliente2.getNombre() + " Solicita tambien 5kg. de " + producto4.getNombre() + " con el ID " + producto4.getId_producto());
		System.out.println(" La dirección de entrega es " + cliente2.getDireccion());
		System.out.println(" El folio de la venta es " + venta2.getFolio() + " y el costo incluyendo delivery y propina es de " + venta2.getMonto());
		System.out.println(" El  empaque de los productos se le asignan a " + personal3.getNombre() + " quien es " + personal3.getCargo());
		System.out.println(" El delivery es realizado por " + personal6.getNombre() + " quien es " + personal6.getCargo() + " a la dirección " + cliente2.getDireccion());
		
		System.out.println("\n---------------------------------------Venta 3-------------------------------------------------------------------");
		System.out.println(" El cliente " + cliente3.getNombre() + " Se comunica con " + personal4.getNombre() + " quien es nuestro " + personal4.getCargo() + " para solicitar 7kg. " + producto5.getNombre() + " con el ID " + producto5.getId_producto());
		System.out.println(" El cliente " + cliente3.getNombre() + " Solicita tambien 5kg. " + producto6.getNombre() + " con el ID " + producto6.getId_producto());
		System.out.println(" La dirección de entrega es " + cliente3.getDireccion());
		System.out.println(" El folio de la venta es " + venta3.getFolio() + " y el costo incluyendo delivery y propina es de " + venta3.getMonto());
		System.out.println(" El  empaque de los productos se le asignan a " + personal3.getNombre() + " quien es " + personal3.getCargo());
		System.out.println(" El delivery es realizado por " + personal6.getNombre() + " quien es " + personal6.getCargo() + " a la dirección " + cliente2.getDireccion());
		
		System.out.println(" El encargado de negociar con los proveedores es " + personal4.getNombre() + " quien es " + personal4.getCargo());
		System.out.println("\n-------------------------------------------------------Proveedores---------------------------------------------");
		System.out.println(proveedor1.getNombre() + " ubicado en " + proveedor1.getDireccion());
		System.out.println(proveedor2.getNombre() + " ubicado en " + proveedor2.getDireccion());
		System.out.println(proveedor3.getNombre() + " ubicado en " + proveedor3.getDireccion());
		System.out.println(proveedor4.getNombre() + " ubicado en " + proveedor4.getDireccion());
		System.out.println(proveedor5.getNombre() + " ubicado en " + proveedor5.getDireccion());
		System.out.println(proveedor6.getNombre() + " ubicado en " + proveedor6.getDireccion());
		
		
		System.out.println("\n-------------------------------------------Stock en Bodega-----------------------------------------------------------------");
		System.out.println(personal7.getNombre() + personal7.getCargo());
		System.out.println(inventario1.getStock() + "Kg. de " +  inventario1.getInsumo());
		System.out.println(inventario2.getStock() + "Kg. de " + inventario2.getInsumo());
		System.out.println(inventario3.getStock() + "Kg. de " + inventario3.getInsumo());
		System.out.println(inventario4.getStock() + "Kg. de " + inventario4.getInsumo());
		System.out.println(inventario5.getStock() + "Kg. de " + inventario5.getInsumo());
		System.out.println(inventario6.getStock() + "Kg. de " + inventario6.getInsumo());
		
		
		System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
		System.out.println("\n--------------------------------------Nuestra App se compone de las siguientes Personas---------------------------");
		
		for (int i = 0; i < Personal.size(); i++) {
		      System.out.println(Personal.get(i));
		      
		
		
		
		
		
		
		
		
		

	}

}
}

