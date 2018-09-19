package application;

import control.ClienteCtrl;
import control.Conexion;
import entity.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Menu_Venta_Buscar_Cliente {
	@FXML private TextField TF1;
	@FXML private TextField TF2;

Conexion conexion;
	public void buscar() throws Throwable {
		conexion = new Conexion();
		try {
			int codigo = Integer.parseInt(TF1.getText());
			
			Cliente cliente = new Cliente(codigo,"");
			ClienteCtrl clienteCtrl = new ClienteCtrl(conexion);
			Cliente cliente1 =clienteCtrl.search1(cliente);
			TF1.setText(String.valueOf(cliente1.getcodigoCliente()));
			TF2.setText(cliente1.getNombre());
			
		}catch(Exception e) {
			TF1.setText("Ingrese Valor Valido");
			TF2.setText("Ingrese Valor Valido");
		}
	}
	
}