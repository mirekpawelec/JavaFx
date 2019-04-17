package fx.example.binding.properties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainBindingProperties extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/BindingProperties.fxml"));
		Pane pane = fxmlLoader.load();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Binding properties");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
}
