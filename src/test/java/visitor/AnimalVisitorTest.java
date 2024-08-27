package visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalVisitorTest {

    Client owner;
    AnimalVisitor visitor;

    @BeforeEach
    void setUp() {
        owner = new Client("Joao");
        visitor = new AnimalVisitor();
    }

    @Test
    void shouldDisplayDog() {
        Client owner = new Client("Joao");
        Dog dog = new Dog(1, "Billy", owner);

        assertEquals("Dog{id=1, name='Billy', owner=Joao}", visitor.display(dog));
    }

    @Test
    void shouldDisplayHorse() {
        Horse horse = new Horse(1, "Atlas", owner, "Ringo", "Dama");

        assertEquals("Horse{id=1, name='Atlas', owner=Joao, sireName='Ringo', damName='Dama'}", visitor.display(horse));
    }

    @Test
    void shouldDisplayBird() {
        Bird bird = new Bird(1, "Bicudo", owner, "Blue");

        assertEquals("Bird{id=1, name='Bicudo', owner=Joao, featherColor='Blue'}", visitor.display(bird));
    }

}
