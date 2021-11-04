public class Opgave_2_Main {
    public static void main(String[] args) {
Opgave_2_FavoriteToy circle = new Opgave_2_FavoriteToy("yellow","round","rubber");
// note that dog has a favoriteToy called "circle"
// is what is called a "has a" relationship since dog references another class
Opgave_2_Dog fiddo = new Opgave_2_Dog("fiddo","doggie Snack",4,circle);
    }
}
