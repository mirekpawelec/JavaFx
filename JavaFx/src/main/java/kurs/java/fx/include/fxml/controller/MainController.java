package kurs.java.fx.include.fxml.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MainController implements Initializable{

	@FXML
	private IncludeView1Controller tab1Controller;
	
	@FXML
	private IncludeView2Controller tab2Controller;

	@FXML
	private Button zmienButton;
	
	@FXML
	private Pane tab1;
	
	@FXML
	private Pane tab2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(tab1);
		System.out.println(tab2);
	}
	
	@FXML
	public void change() {
		tab1Controller.setMessage("New message 1");
		tab2Controller.setMessage("New message 2");
		System.out.println("Zmieni³em treœæ wiadomoœci!");
	}
	
}
