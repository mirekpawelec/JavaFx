package kurs.java.fx.include.fxml.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class IncludeView1Controller implements Initializable {

	@FXML
	private Label infoLabel;
	
	@FXML
	private Button pokazButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	public void pokazInfo(ActionEvent e) {
		System.out.println(infoLabel.getText());
	}
}
