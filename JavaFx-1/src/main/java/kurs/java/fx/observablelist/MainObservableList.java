package kurs.java.fx.observablelist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainObservableList extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/ObservableList.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Example ObservableList");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
}
