package fx.observablelist.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.sound.midi.Soundbank;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import fx.observablelist.model.Person;

public class Controller implements Initializable {

	@FXML
	private ComboBox<Person> comboBox;
	
	@FXML
	private TextField nameTextField;
	
	@FXML
	private TextField surnameTextField;
	
	@FXML
	private Button addButton;
	
	@FXML
	private Button removeButton;

	private Person singlePerson;
	private ObservableList<Person> personObservableList;
	private ListProperty<Person> personPropertyList;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Janusz", "Kowalski"));
		personList.add(new Person("Marian", "Nowak"));
		personList.add(new Person("Adam", "Zieli�ski"));
		personList.add(new Person("Krzych", "Kowalik"));
		
		personObservableList = FXCollections.observableArrayList(personList);
		personPropertyList = new SimpleListProperty<>();
		personPropertyList.set(personObservableList);
		
		comboBox.itemsProperty().bindBidirectional(personPropertyList);
		personObservableList.addListener(this::onChanged);
	}
	
	@FXML
	public void addItem(ActionEvent e) {
		singlePerson = new Person(nameTextField.getText(), surnameTextField.getText());
		personObservableList.add(singlePerson);
		System.out.println(personObservableList);
	}
	
	@FXML
	public void removeItem(ActionEvent e) {
		personObservableList.remove(comboBox.getSelectionModel().getSelectedItem());
		System.out.println(personObservableList);
	}
	
	private void onChanged(Change change) {
		while(change.next()) {
			if(change.wasRemoved()) {
				System.out.println("Co� zosta�o usuni�te!");
			} else if(change.wasAdded()) {
				System.out.println("Co� zosta�o dodane!");
			}
		}
	}
	
}
