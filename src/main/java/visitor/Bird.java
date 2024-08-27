package visitor;

public class Bird implements Animal {

    private int id;
    private String name;
    private Client owner;
    private String featherColor;

    public Bird(int id, String name, Client owner, String featherColor) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.featherColor = featherColor;
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

    public String getFeatherColor() {
        return featherColor;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.displayBird(this);
    }

}
