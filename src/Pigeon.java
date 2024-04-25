public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "";
    }

    public Pigeon(String name, int age, double weight, boolean canFly, String species) {
        super(name, age, weight, canFly);
        this.species = species;
    }

    public Pigeon(String name, int age, boolean canFly, String species) {
        super(name, age, canFly);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("The pigeon is eating.");
    }

    @Override
    public String getVoice() {
        return "Coos";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void nest() {
        System.out.println("The pigeon is building a nest.");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", weight=" + super.weight +
                ", can fly?=" + super.canFly +
                ", species='" + species + '\'' +
                '}';
    }
}