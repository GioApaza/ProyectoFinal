package application;

import control.ClienteCtrl;
import control.Conexion;
import control.ProveedorCtrl;
import entity.Cliente;
import entity.Proveedor;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Menu_Compra_Buscar_Proveedor {
	@FXML private TextField TF1;
	@FXML private TextField TF2;
	@FXML private TextField TF3;
	@FXML private TextField TF4;
Conexion conexion;
	public void buscar() throws Throwable {
		conexion = new Conexion();
		try {
			intls
			codigo = Integer.parseInt(TF1.getText());
			
			Proveedor proveedor = new Proveedor(codigo,"",0,"");
			ProveedorCtrl proveedorCtrl = new ProveedorCtrl(conexion);
			Proveedor proveedor1 =proveedorCtrl.search1(proveedor);
			TF1.setText(String.valueOf(proveedor1.getCodigoProveedor()));
			TF2.setText(proveedor1.getNombre());
			TF3.setText(String.valueOf(proveedor1.getTelefono()));
			TF4.setText(proveedor1.getDireccion());
		}catch(Exception e) {
			TF1.setText("Ingrese Valor Valido");
			TF2.setText("Ingrese Valor Valido");
		}
	}
}
