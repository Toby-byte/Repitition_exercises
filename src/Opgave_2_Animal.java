public class Opgave_2_Animal {
    // here we have the variables, that will go into the animal constructor
String name;
String favoriteFood;
int legs;

    // this is an animal constructor
    // we assign our genral variables of an animal class
    public Opgave_2_Animal(String name, String favoriteFood, int legs) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.legs = legs;
    }

    // this is the animal methods
    public void numOfLegs(int numlegs) {
        System.out.println("This animal have " + numlegs+" legs");
    }

    public void animalSound() {
        System.out.println("Animal sound");
    }
}
