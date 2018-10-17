package kurs.java.fx.controller;

import javax.sound.midi.Soundbank;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {

	@FXML
	private Button button; // wstrzykniêcie przycisku id: 'button' do zmiennej button

	public StackPaneController() {
		System.out.println("Jestem w kontrolerze!");
	}
	
	/* metoda wywo³ywana zaraz po konstruktorze, gwarantuje, ¿e przyciski z formy zosta³y wstrzykniête i mo¿emy je modyfikowaæ */
	@FXML
	void initialize() {
		button.setText("Nowa nazwa");		// je¿eli wywo³amy metode w konstruktorze otrzymamy NullPointnerException, poniewa¿ podczas inicjalizacji konstruktora pola kontrolera jeszcze nie zosta³y zainicjowane
	}
	
}
