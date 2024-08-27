package visitor;

public interface Visitor {

    String displayDog(Dog dog);
    String displayHorse(Horse horse);
    String displayBird(Bird bird);
}
