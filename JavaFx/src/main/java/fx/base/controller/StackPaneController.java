package fx.base.controller;

import javax.sound.midi.Soundbank;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class StackPaneController {

	@FXML
	private Button button; // wstrzykni�cie przycisku id: 'button' do zmiennej button

	public StackPaneController() {
		System.out.println("Jestem w kontrolerze!");
	}
	
	@FXML
	void initialize() {
		button.setText("Nowa nazwa");
		
		/* dodanie obs�ugi event�w w java, poza fxml */
		// 1. dodanie EventHandlera, w kt�rym jako typ wskazujemy rodzaj zdarzenia
		// 2. dodanie implementacji metody handle()
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("To jest handler");
			}
		};
		button.addEventHandler(ActionEvent.ACTION, handler);	// w ten spos�b mo�emy zdefiniowa� wiele handler�w
	
		/* implementacja obs�ugi eventu za pomoc� lambda */
		EventHandler<MouseEvent> mouseHandler = e -> System.out.println("To jest Mouse Handler");
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
		
		/* usuwanie handler�w */
		button.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
		
		/* Trzeci spos�b obs�ugi eevent�w. WA�NE! Tym sposobem mo�emy zdefiniowa� tylko jeden handler */
		button.setOnAction(e -> {
			System.out.println("To jest setOnActionHandler ");
		});
	}
	
}
