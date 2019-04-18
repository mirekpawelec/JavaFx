package fx.embedablecontrols.controller;

import fx.embedablecontrols.converter.PersonConverter;
import fx.embedablecontrols.service.PersonService;
import javafx.collections.ListChangeListener.Change;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;

public class StrartController implements Initializable {

    @FXML
    private HBox headerHBox;
    @FXML
    private VBox verticalVBox, horizontalHBox1, horizontalHBox2;

    private PersonService personService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.personService = new PersonService();

        this.personService.init();
        sortAndLoadPersonList();
        this.personService.getPersonFxObservableList().addListener(this::onChanged);
    }

    private void onChanged(Change change) {
        while(change.next()) {
            if(change.wasAdded()) {
                updateBox1();
            } else if (change.wasRemoved()) {
                updateBox1();
            }
        }
    }

    private void updateBox1() {
        this.horizontalHBox1.getChildren().clear();
        sortAndLoadPersonList();
    }

    private void sortAndLoadPersonList() {
        this.personService.sortPersonList();
        this.horizontalHBox1.getChildren().addAll(PersonConverter.convertToPersonComponentList(this.personService.getPersonFxObservableList()));
    }

    public HBox getHeaderHBox() {
        return headerHBox;
    }

    public void setHeaderHBox(HBox headerHBox) {
        this.headerHBox = headerHBox;
    }

    public VBox getHorizontalHBox1() {
        return horizontalHBox1;
    }

    public void setHorizontalHBox1(VBox horizontalHBox1) {
        this.horizontalHBox1 = horizontalHBox1;
    }

    public VBox getHorizontalHBox2() {
        return horizontalHBox2;
    }

    public void setHorizontalHBox2(VBox horizontalHBox2) {
        this.horizontalHBox2 = horizontalHBox2;
    }

    public VBox getVerticalVBox() {
        return verticalVBox;
    }

    public void setVerticalVBox(VBox verticalVBox) {
        this.verticalVBox = verticalVBox;
    }

    public void addPerson(ActionEvent actionEvent) {
        this.personService.add();
    }

    public void removePerson(ActionEvent actionEvent) {
        this.personService.remove();
    }
}
