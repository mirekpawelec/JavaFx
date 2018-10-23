package kurs.java.fx.base.controller;

import javax.sound.midi.Soundbank;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class StackPaneController {

	@FXML
	private Button button; // wstrzykniêcie przycisku id: 'button' do zmiennej button

	public StackPaneController() {
		System.out.println("Jestem w kontrolerze!");
	}
	
	@FXML
	void initialize() {
		button.setText("Nowa nazwa");
		
		/* dodanie obs³ugi eventów w java, poza fxml */
		// 1. dodanie EventHandlera, w którym jako typ wskazujemy rodzaj zdarzenia
		// 2. dodanie implementacji metody handle()
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("To jest handler");
			}
		};
		button.addEventHandler(ActionEvent.ACTION, handler);	// w ten sposób mo¿emy zdefiniowaæ wiele handlerów
	
		/* implementacja obs³ugi eventu za pomoc¹ lambda */
		EventHandler<MouseEvent> mouseHandler = e -> System.out.println("To jest Mouse Handler");
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
		
		/* usuwanie handlerów */
		button.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
		
		/* Trzeci sposób obs³ugi eeventów. WA¯NE! Tym sposobem mo¿emy zdefiniowaæ tylko jeden handler */
		button.setOnAction(e -> {
			System.out.println("To jest setOnActionHandler ");
		});
	}
	
}
