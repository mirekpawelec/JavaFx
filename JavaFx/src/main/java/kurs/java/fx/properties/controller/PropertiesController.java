package kurs.java.fx.properties.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kurs.java.fx.properties.model.Person;

public class PropertiesController {

	@FXML
	private TextField text;
	
	@FXML
	private Label label;
	
	private Person person = new Person();
	
	@FXML
	public void initialize() {
		text.textProperty().bindBidirectional(person.getNameProperty());
		label.textProperty().bind(person.getNameProperty());
	}
	
	@FXML
	public void onActionWrite() {
		System.out.println(text.textProperty().get());
		System.out.println(text.textProperty().getValue());
		text.textProperty().set("");
	}

}
