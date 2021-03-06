package application;

import control.ClienteCtrl;
import control.Conexion;
import entity.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Menu_Venta_Actualizar_Cliente {
	@FXML private TextField TF1;
	@FXML private TextField TF2;
	
	Conexion conexion;
	
	public void actualizar() throws Throwable {
		conexion = new Conexion();
		try {
			int codigo = Integer.parseInt(TF1.getText());
			String nombre = TF2.getText();
			Cliente cliente = new Cliente(codigo,nombre);
			ClienteCtrl clienteCtrl = new ClienteCtrl(conexion);
			clienteCtrl.update(cliente);
			
			
		}catch(Exception e) {
			TF1.setText("Ingrese Valor Valido");
			TF2.setText("Ingrese Valor Valido");
		}
		
	}
	
}
	