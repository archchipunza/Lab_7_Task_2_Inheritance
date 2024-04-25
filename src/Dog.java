public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "";
    }

    public Dog(String name, int age, double weight, boolean hasFur, String breed) {
        super(name, age, weight, hasFur);
        this.breed = breed;
    }

    public Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("The dog is feasting.");
    }

    @Override
    public String getVoice() {
        return "Barks";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void play() {
        System.out.println("The dog is playing.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", weight=" + super.weight +
                ", has fur?=" + super.hasFur +
                ", breed='" + breed + '\'' +
                '}';
    }
}