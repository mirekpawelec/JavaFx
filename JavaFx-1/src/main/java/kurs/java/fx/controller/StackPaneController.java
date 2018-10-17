package kurs.java.fx.controller;

import javax.sound.midi.Soundbank;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {

	@FXML
	private Button button; // wstrzykni�cie przycisku id: 'button' do zmiennej button

	public StackPaneController() {
		System.out.println("Jestem w kontrolerze!");
	}
	
	/* metoda wywo�ywana zaraz po konstruktorze, gwarantuje, �e przyciski z formy zosta�y wstrzykni�te i mo�emy je modyfikowa� */
	@FXML
	void initialize() {
		button.setText("Nowa nazwa");		// je�eli wywo�amy metode w konstruktorze otrzymamy NullPointnerException, poniewa� podczas inicjalizacji konstruktora pola kontrolera jeszcze nie zosta�y zainicjowane
	}
	
}
