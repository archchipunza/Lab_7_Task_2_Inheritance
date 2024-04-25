public abstract class Bird extends Animal {
    protected boolean canFly;

    public Bird() {
        super();
        this.canFly = false;
    }

    public Bird(String name, int age, double weight, boolean canFly) {
        super(name, age, weight);
        this.canFly = canFly;
    }

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public abstract void eat();

    @Override
    public abstract String getVoice();

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", weight=" + super.weight +
                ", can fly?=" + canFly +
                '}';
    }
}