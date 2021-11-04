public class Opgave_2_Dog extends Opgave_2_Animal {
    Opgave_2_FavoriteToy toy;

    // here dog uses another class as input parameter
    public Opgave_2_Dog(String name, String favoriteFood, int legs, Opgave_2_FavoriteToy toy) {
        super(name, favoriteFood, legs);
        this.toy = toy;
    }

    @Override
    public void animalSound() {
        System.out.println("woof");
    }
}
