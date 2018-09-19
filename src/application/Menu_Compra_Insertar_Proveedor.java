package application;

import control.ClienteCtrl;
import control.Conexion;
import control.ProveedorCtrl;
import entity.Cliente;
import entity.Proveedor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Menu_Compra_Insertar_Proveedor {
	@FXML private TextField TF1;
	@FXML private TextField TF2;
	@FXML private TextField TF3;
	@FXML private TextField TF4;
	@FXML private Button BT;
	Conexion conexion;
	
	public void guardar() throws Throwable {
		conexion = new Conexion();
		try {
			int codigo = Integer.parseInt(TF1.getText());
			String nombre = TF2.getText();
			int telefono = Integer.parseInt(TF3.getText());
			String direccion = TF4.getText();
			Proveedor proveedor = new Proveedor(codigo,nombre,telefono,direccion);
			ProveedorCtrl proveedorCtrl = new ProveedorCtrl(conexion);
			proveedorCtrl.insert(proveedor);
			
			
		}catch(Exception e) {
			TF1.setText("Ingrese Valor Valido");
			TF2.setText("Ingrese Valor Valido");
		}
		
	}
}
