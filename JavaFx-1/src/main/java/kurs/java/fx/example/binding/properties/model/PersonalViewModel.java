package kurs.java.fx.example.binding.properties.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonalViewModel {

	private StringProperty nameProperty = new SimpleStringProperty();
	
	private BooleanProperty nameOkProperty = new SimpleBooleanProperty();
	
	private StringProperty surnameProperty = new SimpleStringProperty();
	
	private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty();
	
	private BooleanProperty surnameOkProperty = new SimpleBooleanProperty();
	
	private IntegerProperty yearProperty = new SimpleIntegerProperty();
	
	private BooleanProperty confirmProperty = new SimpleBooleanProperty();
	
	private StringProperty ageProperty = new SimpleStringProperty();
	
	private BooleanProperty disableButtonProperty = new SimpleBooleanProperty();
	
	private IntegerProperty actualYearProperty = new SimpleIntegerProperty();

	public PersonalViewModel() {}
	
	public StringProperty getNameProperty() {
		return nameProperty;
	}

	public void setNameProperty(StringProperty nameProperty) {
		this.nameProperty = nameProperty;
	}

	public BooleanProperty getNameOkProperty() {
		return nameOkProperty;
	}

	public void setNameOkProperty(BooleanProperty nameOkProperty) {
		this.nameOkProperty = nameOkProperty;
	}

	public StringProperty getSurnameProperty() {
		return surnameProperty;
	}

	public void setSurnameProperty(StringProperty surnameProperty) {
		this.surnameProperty = surnameProperty;
	}

	public BooleanProperty getDisableSurnameProperty() {
		return disableSurnameProperty;
	}

	public void setDisableSurnameProperty(BooleanProperty disableSurnameProperty) {
		this.disableSurnameProperty = disableSurnameProperty;
	}

	public BooleanProperty getSurnameOkProperty() {
		return surnameOkProperty;
	}

	public void setSurnameOkProperty(BooleanProperty surnameOkProperty) {
		this.surnameOkProperty = surnameOkProperty;
	}

	public IntegerProperty getYearProperty() {
		return yearProperty;
	}

	public void setYearProperty(IntegerProperty yearProperty) {
		this.yearProperty = yearProperty;
	}

	public BooleanProperty getConfirmProperty() {
		return confirmProperty;
	}

	public void setConfirmProperty(BooleanProperty confirmProperty) {
		this.confirmProperty = confirmProperty;
	}

	public StringProperty getAgeProperty() {
		return ageProperty;
	}

	public void setAgeProperty(StringProperty ageProperty) {
		this.ageProperty = ageProperty;
	}

	public BooleanProperty getDisableButtonProperty() {
		return disableButtonProperty;
	}

	public void setDisableButtonProperty(BooleanProperty disableButtonProperty) {
		this.disableButtonProperty = disableButtonProperty;
	}

	public IntegerProperty getActualYearProperty() {
		return actualYearProperty;
	}

	public void setActualYearProperty(IntegerProperty actualYearProperty) {
		this.actualYearProperty = actualYearProperty;
	}
	
}
