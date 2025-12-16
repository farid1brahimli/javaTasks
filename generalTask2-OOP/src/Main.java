public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion();
        lion.makeSound();
        Animal elephant = new Elephant();
        Zoo.makeAnimalSound(elephant);
        Animal monkey  = new Monkey();
        Zoo.makeAnimalSound(monkey);
    }
}