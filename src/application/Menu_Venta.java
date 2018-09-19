package application;

import java.io.IOException;
import java.util.ArrayList;

import control.ClienteCtrl;
import control.Conexion;
import entity.Cliente;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.stage.Stage;

public class Menu_Venta {
	@FXML private Label TXT1;
	Conexion conexion;
	
	public void opcionIngresarVenta() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/menuVentaRealizarVenta.fxml"));

		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void busquedaCliente() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/menuVentaBuscarCliente.fxml"));

		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void listarclientes() throws Throwable {
		conexion = new Conexion();
		ClienteCtrl clienteCtrl = new ClienteCtrl(conexion);
		ArrayList<Cliente> listaClientes = clienteCtrl.list();
		String datos = "";
		for(Cliente item : listaClientes) {
			datos += item.toString()+"\n";
		}
		TXT1.setText(datos);
		
		
	}
	public void actualizarCliente() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/menuVentaActualizarCliente.fxml"));

		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void insertarCliente() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/menuVentaInsertarCliente.fxml"));

		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}
}