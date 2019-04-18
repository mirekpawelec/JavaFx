package fx.embedablecontrols.component;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PersonComponent extends AnchorPane {

    @FXML
    private AnchorPane personPane;
    @FXML
    private Label nameLabel, surnameLabel, ageLabel;

    private StringProperty name = new SimpleStringProperty(this, "name", "");
    private StringProperty surname = new SimpleStringProperty(this, "surname", "");
    private IntegerProperty age = new SimpleIntegerProperty(this, "age", 0);

    {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fx/embedablecontrols/file/fxml/Person.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.nameLabel.textProperty().bind(nameProperty());
        this.surnameLabel.textProperty().bind(surnameProperty());
        this.ageLabel.textProperty().bind(ageProperty().asString());
    }

    public PersonComponent() {
    }

    public PersonComponent(String name, String surname, int age) {
        this.name.set(name);
        this.surname.set(surname);
        this.age.set(age);
    }

    public AnchorPane getPersonPane() {
        return personPane;
    }

    public Label getNameLabel() {
        return nameLabel;
    }

    public Label getSurnameLabel() {
        return surnameLabel;
    }

    public Label getAgeLabel() {
        return ageLabel;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }
}
