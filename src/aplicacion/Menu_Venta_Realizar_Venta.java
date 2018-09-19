package aplicacion;

public class Menu_Venta_Realizar_Venta {

	
	public void realizarVenta() throws Throwable {
		conexion = new Conexion();
		int codigo1=Integer.parseInt(TF1.getText());
		int codigo2=Integer.parseInt(TF2.getText());
		int codigo3=Integer.parseInt(TF3.getText());
		int codigo4=Integer.parseInt(TF4.getText());
		
		ProductoCtrl  productoCtrl = new ProductoCtrl(conexion);
		int monto = productoCtrl.list(codigo2)*codigo3;
		
		Venta venta = new Venta(codigo1,codigo2,codigo3);
		Factura factura = new Factura(codigo1,monto,TF4.getText());
		DetalleVenta detalleVenta = new DetalleVenta(codigo1,codigo1,codigo2,codigo3,codigo1);
	
		VentaCtrl ventaCtrl = new VentaCtrl(conexion);
		ventaCtrl.insert(venta);
		
		DetalleVentaCtrl  detalleVentaCtrl = new DetalleVentaCtrl(conexion);
		detalleVentaCtrl.insert1(detalleVenta);
		
		FacturaCtrl facturaCtrl = new FacturaCtrl(conexion);
		facturaCtrl.insert1(factura);
		
		
		
		
		
		
		
		
		
	};
	
	
}

}
