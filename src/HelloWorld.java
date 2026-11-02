import model.Dog;
import model.Person;
import model.Address;
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "Smith", LocalDate.of(1984, 6, 15));
        Person janet = new Person("Janet", "Jackson", LocalDate.of(1985, 12, 3));

        tom.setSpouse(janet);
        tom.setAddress(new Address("Baker Street", "221B", "London", "UK"));

        Dog fido = new Dog("Fido", LocalDate.of(2018, 1, 1), "Labrador");
        tom.setPet(fido);

        fido.bark();
        System.out.println(tom);
    }
}