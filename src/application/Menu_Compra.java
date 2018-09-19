package application;

import java.io.IOException;
import java.util.ArrayList;

import control.ClienteCtrl;
import control.Conexion;
import control.ProveedorCtrl;
import entity.Cliente;
import entity.Proveedor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Menu_Compra {
	@FXML private Label TXT;
	Conexion conexion;
	
	public void opcionIngresarCompra() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/MenuCompraRealizarCompra.fxml"));

		Scene scene = new Scene(root,450,450);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void busquedaProveedor() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/MenuCompraBuscarProveedores.fxml"));

		Scene scene = new Scene(root,450,450);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void listarproveedores() throws Throwable {
		conexion = new Conexion();
		ProveedorCtrl proveedorCtrl = new ProveedorCtrl(conexion);
		ArrayList<Proveedor> listaProveedores = proveedorCtrl.list();
		String datos = "";
		for(Proveedor item : listaProveedores) {
			datos += item.toString()+"\n";
		}
		TXT.setText(datos);
		
		
	}
	public void actualizar() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/MenuCompraActualizarProveedor.fxml"));

		Scene scene = new Scene(root,450,450);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void insertarProveedor() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/menuCompraInsertarProveedor.fxml"));

		Scene scene = new Scene(root,450,450);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}
	public void salir() {
		System.exit(0);
	}
	
}
