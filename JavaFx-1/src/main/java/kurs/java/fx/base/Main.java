package kurs.java.fx.base;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import kurs.java.fx.base.controller.StackPaneController;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* utworzenie i konfiguracja StackPane w java */
		StackPane stackPaneJavaCode = new StackPane();
		Button button = new Button("Przycisk");
		stackPaneJavaCode.getChildren().add(button);

		/* wczytanie StackPane z pliku fxml*/
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/fxml/StackPaneWindow.fxml"));
		
		/* ustawienie kontrolera poza plikiem fxml, nale¿y to zrobiæ przed wywo³aniem metody load() na loader'ze */
//		StackPaneController stackPaneController = new StackPaneController();
//		loader.setController(stackPaneController);
		
		StackPane stackPaneFromXml = loader.load();
		
		/* pobranie instancji klasy kontrolera 'StackPaneController', obiekt inicjowany jest przez umieszczenie go w pliku fxml fx:controller="kurs.java.fx.controller.StackPaneController"*/
		StackPaneController controller = loader.getController();
		
		
//		Scene scene = new Scene(stackPaneJavaCode, 400, 600);
		Scene scene = new Scene(stackPaneFromXml);
		
		/* wczytanie scene do stage*/
		primaryStage.setScene(scene);
		
		/* zablokowanie zmiany rozmiaru okna */
//		primaryStage.setResizable(false);
		
		/* aplikacja na ca³y ekran */
//		primaryStage.setFullScreen(true);
		
		/* ustawienie rozmiaru okna, ma pierszeñstwo nad Scene*/
//		primaryStage.setWidth(200);
//		primaryStage.setHeight(200);
		
		/* sterowanie po³o¿enie okna */
//		primaryStage.setX(0);
//		primaryStage.setY(0);
		
		/* usuniêcie obramowania */
//		primaryStage.initStyle(StageStyle.UNDECORATED);
		
		/* ustawienie przezroczystoœci */
//		primaryStage.setOpacity(0.5);
		
		/* ustawienie nazwy okna */
		primaryStage.setTitle("Pierwsze okno");
		primaryStage.show();
	}

}
