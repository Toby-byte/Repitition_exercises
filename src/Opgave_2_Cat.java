// extends, extend the functionality of Animal
public class Opgave_2_Cat extends Opgave_2_Animal {
    // this means that Cat inherit the parameters of Animal
    // that is also what super is referring to
    public Opgave_2_Cat(String name, String favoriteFood, int legs) {
        super(name, favoriteFood, legs);
    }

    // this is an example of override where the cat class, has its own animalSound
    @Override
    public void animalSound() {
        System.out.println("meow");
    }

    // also note that cat is an animal, that means it is an "is a" relationship
}


