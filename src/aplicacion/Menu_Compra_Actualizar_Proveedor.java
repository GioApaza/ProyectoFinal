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

}
