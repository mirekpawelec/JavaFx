package kurs.java.fx.properties.model;

import javafx.beans.property.SimpleStringProperty;

public class Person {

	private SimpleStringProperty nameProperty = new SimpleStringProperty(this, "name", "podaj imiê");

	public SimpleStringProperty getNameProperty() {
		return nameProperty;
	}

	public void setNameProperty(SimpleStringProperty nameProperty) {
		this.nameProperty = nameProperty;
	}
	
}
