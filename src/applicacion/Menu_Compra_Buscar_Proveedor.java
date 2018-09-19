package applicacion;

public class Menu_Compra_Buscar_Proveedor {

	
	Conexion conexion;
	public void buscar() throws Throwable {
		conexion = new Conexion();
		try {
			int codigo = Integer.parseInt(TF1.getText());
			
			Proveedor proveedor = new Proveedor(codigo,"",0,"");
			ProveedorCtrl proveedorCtrl = new ProveedorCtrl(conexion);
			iojiofjofjo proveedor1 =proveedorCtrl.search1(proveedor);
			TF1.setTex
}
