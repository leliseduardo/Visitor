package visitor;

public class AnimalVisitor implements Visitor {

    public String display(Animal animal) {
        return animal.accept(this);
    }

    @Override
    public String displayDog(Dog dog) {
        return "Dog{" +
                "id=" + dog.getId() +
                ", name='" + dog.getName() + '\'' +
                ", owner=" + dog.getOwner().getName() +
                '}';
    }

    @Override
    public String displayHorse(Horse horse) {
        return "Horse{" +
                "id=" + horse.getId() +
                ", name='" + horse.getName() + '\'' +
                ", owner=" + horse.getOwner().getName() +
                ", sireName='" + horse.getSireName() + '\'' +
                ", damName='" + horse.getDamName() + '\'' +
                '}';
    }

    @Override
    public String displayBird(Bird bird) {
        return "Bird{" +
                "id=" + bird.getId() +
                ", name='" + bird.getName() + '\'' +
                ", owner=" + bird.getOwner().getName() +
                ", featherColor='" + bird.getFeatherColor() + '\'' +
                '}';
    }
}
