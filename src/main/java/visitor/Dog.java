package visitor;

public class Dog implements Animal {

    private int id;
    private String name;
    private Client owner;

    public Dog(int id, String name, Client owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Client getOwner() {
        return owner;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.displayDog(this);
    }

}
