import beans.Person;
import services.helper.DBHelperFacade;
import services.helper.DBHelperFacadeImpl;

public class Main {
    public static void main(String[] args) {

        DBHelperFacade helper = new DBHelperFacadeImpl();
        Person userFromDb = null;

        helper.addUser(new Person("Stas", 25));
        helper.addUser(new Person("Ira", 27));
        helper.addUser(new Person("Sam", 35));


        userFromDb = helper.readUserByName("Ira");
        System.out.println(userFromDb);

        userFromDb = helper.readUserByName("Sam");
        System.out.println(userFromDb);

        userFromDb = helper.readUserByName("Stas");
        System.out.println(userFromDb);
    }
}
