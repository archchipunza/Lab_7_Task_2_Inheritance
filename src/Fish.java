public abstract class Fish extends Animal {
    protected boolean hasScales;

    public Fish() {
        super();
        this.hasScales = false;
    }

    public Fish(String name, int age, double weight, boolean hasScales) {
        super(name, age, weight);
        this.hasScales = hasScales;
    }

    public Fish(String name, int age, boolean hasScales) {
        super(name, age);
        this.hasScales = hasScales;
    }

    @Override
    public abstract void eat();

    @Override
    public abstract String getVoice();

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", weight=" + super.weight +
                ", has scales?=" + hasScales +
                '}';
    }
}