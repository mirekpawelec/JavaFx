package fx.embedablecontrols.converter;

import fx.embedablecontrols.component.PersonComponent;
import fx.embedablecontrols.model.PersonFx;

import java.util.ArrayList;
import java.util.List;

public class PersonConverter {
    public static PersonComponent convertToPersonComponent(PersonFx personFx) {
        PersonComponent component = new PersonComponent();
        component.setName(personFx.getName());
        component.setSurname(personFx.getSurname());
        component.setAge(personFx.getAge());
        return component;
    }

    public static List<PersonComponent> convertToPersonComponentList(List<PersonFx> personFxList) {
        List<PersonComponent> personComponents = new ArrayList<>();
        personFxList.forEach(p -> {
            personComponents.add(new PersonComponent(p.getName(), p.getSurname(), p.getAge()));
        });
        return personComponents;
    }
}
