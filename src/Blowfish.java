public class Blowfish extends Fish {
    private boolean isPoisonous;

    public Blowfish() {
        super();
        this.isPoisonous = false;
    }

    public Blowfish(String name, int age, double weight, boolean hasScales, boolean isPoisonous) {
        super(name, age, weight, hasScales);
        this.isPoisonous = isPoisonous;
    }

    public Blowfish(String name, int age, boolean hasScales, boolean isPoisonous) {
        super(name, age, hasScales);
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void eat() {
        System.out.println("The blowfish is eating.");
    }

    @Override
    public String getVoice() {
        return "Blub";
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", weight=" + super.weight +
                ", hasScales=" + super.hasScales +
                ", isPoisonous=" + isPoisonous +
                '}';
    }
}