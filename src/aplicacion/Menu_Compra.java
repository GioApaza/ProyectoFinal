package aplicacion;

public class Menu_Compra {

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
}
