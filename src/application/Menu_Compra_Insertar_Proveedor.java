package application;

public class Menu_Compra_Insertar_Proveedor {

Conexion conexion;
	
	public void guardar() throws Throwable {
		conexion = new Conexion();
		try {
			int codigo = Integer.parseInt(TF1.getText());
			String nombre = TF2.getText();
			int telefono = Integer.parseInt(TF3.getText());
			String direccion = TF4.getText();
			Prov proveedor = new Proveedor(codigo,nombre,telefono,direccion);
			ProveedorCtrl proveedorCtrl = new ProveedorCtrl(conexion);
			proveedorCtrl.insert(proveedor);
			
}
