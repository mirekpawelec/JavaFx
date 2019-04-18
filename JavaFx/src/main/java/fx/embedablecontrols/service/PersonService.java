package fx.embedablecontrols.service;

import fx.embedablecontrols.model.PersonFx;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Comparator;
import java.util.Random;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class PersonService {

    ObservableList<PersonFx> personFxObservableList = FXCollections.observableArrayList();

    public ObservableList<PersonFx> getPersonFxObservableList() {
        return personFxObservableList;
    }

    public void setPersonFxObservableList(ObservableList<PersonFx> personFxObservableList) {
        this.personFxObservableList = personFxObservableList;
    }

    public void init() {
        PersonFx person1 = new PersonFx("Adam", "Nowak", 22);
        PersonFx person2 = new PersonFx("Janusz", "Jan", 33);
        PersonFx person3 = new PersonFx("Jan", "Kowalski", 44);
        getPersonFxObservableList().addAll(person1, person2, person3);
    }

    public void sortPersonList() {
        getPersonFxObservableList().sort(comparing(PersonFx::getAge, reverseOrder()));
    }

    public void add() {
        getPersonFxObservableList().add(new PersonFx(
                    "Greg" + new Random().nextInt()*10,
                    "Generowany" + new Random().nextInt()*10,
                    new Random().nextInt(50)
                ));
    }

    public void remove() {
        if (!getPersonFxObservableList().isEmpty()) getPersonFxObservableList().remove(0);
    }
}
