package aplicacion;

public class Menu_Principal {


	
	public void cargarMenuCompra() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/MenuCompra.fxml"));

		Scene scene = new Scene(root,450,450);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		

		
	}
	
	public void cargarMenuVenta() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/MenuVenta.fxml"));

		Scene scene = new Scene(root,450,450);
		scene.getStyl
}
