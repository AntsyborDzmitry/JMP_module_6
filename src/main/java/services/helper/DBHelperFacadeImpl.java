package services.helper;

import beans.Person;
import services.manager.DBPersonManager;
import services.manager.PersonManager;

public class DBHelperFacadeImpl implements DBHelperFacade {
    PersonManager pm = new DBPersonManager();

    @Override
    public Person readUserByName(String name) {
        return pm.readPerson(name);
    }

    @Override
    public void addUser(Person user) {
        pm.writePerson(user);
    }
}
