package fx.example.binding.properties.model;

import java.time.LocalDate;


import javafx.beans.binding.When;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public class PersonalViewModel {

	private StringProperty nameProperty = new SimpleStringProperty(); /* ok */
	
	private BooleanProperty nameOkProperty = new SimpleBooleanProperty(); /* ok */
	
	private StringProperty surnameProperty = new SimpleStringProperty(); /* ok */
	
	private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty(); /* ok */
	
	private BooleanProperty surnameOkProperty = new SimpleBooleanProperty(); /* ok */
	
	private IntegerProperty yearProperty = new SimpleIntegerProperty(); /* ok */
	
	private BooleanProperty confirmProperty = new SimpleBooleanProperty(); /* ok */
	
	private StringProperty ageProperty = new SimpleStringProperty(); /* ok */
	
	private BooleanProperty disableButtonProperty = new SimpleBooleanProperty();
	
	private IntegerProperty actualYearProperty = new SimpleIntegerProperty(LocalDate.now().getYear());

	public PersonalViewModel() {
		nameOkProperty.bind(nameProperty.isNotEmpty());
		surnameOkProperty.bind(surnameProperty.isNotEmpty());
		disableSurnameProperty.bind(nameProperty.isEmpty());
		disableButtonProperty.bind(confirmProperty.not());
		ageProperty.bind(new When(yearProperty.isNotEqualTo(0)).then(actualYearProperty.subtract(yearProperty).asString()).otherwise(""));
	}
	
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
		System.out.println("getYearProperty: " + this.yearProperty.get());
		return yearProperty;
	}

	public void setYearProperty(IntegerProperty yearProperty) {
		System.out.println("setYearProperty: " + yearProperty.get());
		this.yearProperty = yearProperty;
	}

	public BooleanProperty getConfirmProperty() {
		return confirmProperty;
	}

	public void setConfirmProperty(BooleanProperty confirmProperty) {
		this.confirmProperty = confirmProperty;
	}

	public StringProperty getAgeProperty() {
		System.out.println("getAgeProperty: " + ageProperty.get());
		return ageProperty;
	}

	public void setAgeProperty(StringProperty ageProperty) {
		System.out.println("setAgeProperty: " + ageProperty.get());
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
