package aplicacion;

public class Main {
	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/menuPrincipal.fxml"));
				Scene scene = new Scene(root,200,200);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			get.prime();
}
