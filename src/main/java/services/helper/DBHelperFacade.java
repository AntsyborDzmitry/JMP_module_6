package services.helper;

import beans.Person;

public interface DBHelperFacade {
    public void addUser (Person user);
    public Person readUserByName (String name);
}
