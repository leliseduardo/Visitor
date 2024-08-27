package visitor;

public class Horse implements Animal {

    private int id;
    private String name;
    private Client owner;
    private String sireName;
    private String damName;

    public Horse(int id, String name, Client owner, String sireName, String damName) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.sireName = sireName;
        this.damName = damName;
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

    public String getSireName() {
        return sireName;
    }

    public String getDamName() {
        return damName;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.displayHorse(this);
    }

}
