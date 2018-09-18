package aplicacion;

public class Menu_Compra_Actualizar_Proveedor {
	
	Conexion conexion;
	public void actualizar() throws Throwable {
		conexion = new Conexion();
		try {
			int codigo = Integer.parseInt(TF1.getText());
			String nombre = TF2.getText();
			int telefono = Integer.parseInt(TF3.getText());
			String direccion = TF4.getText();


		Proveedor proveedor = new Proveedor(codigo,nombre,telefono,direccion);
		ProveedorCtrl proveedorCtrl = new ProveedorCtrl(conexion);
		proveedorCtrl.update1(proveedor);
	}catch(Exception e) {
		TF1.setText("Ingrese Valor Valido");
		TF2.setText("Ingrese Valor Valido");
	}
}
}

