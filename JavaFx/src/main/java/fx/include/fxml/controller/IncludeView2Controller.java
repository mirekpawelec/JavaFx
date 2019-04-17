package fx.include.fxml.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class IncludeView2Controller implements Initializable {
	
	@FXML
	private Label infoLabel;
	
	@FXML
	private Button pokazButton;

	private StringProperty message = new SimpleStringProperty("Message 2");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		infoLabel.textProperty().bindBidirectional(message);
	}
	
	@FXML
	public void pokazInfo(ActionEvent e) {
		System.out.println(infoLabel.getText());
	}

	public String getMessage() {
		return message.get();
	}

	public void setMessage(String message) {
		this.message.set(message);
	}
	
}
