public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Bhoki", 6, 20.5, true, "Labrador");
        animals[1] = new Blowfish("Nemo", 2, 1.2, true, true);
        animals[2] = new Pigeon("Ratatouille", 3, true, "Rock Dove");

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.eat();
            System.out.println("Sound: " + animal.getVoice());
            switch (animal) {
                case Dog dog -> dog.play();
                case Blowfish blowfish -> System.out.println("Is poisonous?: " + blowfish.isPoisonous());
                case Pigeon pigeon -> pigeon.nest();
                default -> {
                }
            }
            System.out.println();
        }
    }
}