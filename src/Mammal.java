public abstract class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal() {
        super();
        this.hasFur = false;
    }

    public Mammal(String name, int age, double weight, boolean hasFur) {
        super(name, age, weight);
        this.hasFur = hasFur;
    }

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    @Override
    public abstract void eat();

    @Override
    public abstract String getVoice();

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", weight=" + super.weight +
                ", has fur?=" + hasFur +
                '}';
    }
}