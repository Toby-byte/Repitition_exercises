import java.util.ArrayList;

public class Opgave_6 {

    static void generateRandomIntArrayList(ArrayList<Integer> Array, int max, int min) {

        for (int i = 0; i < max; i++) {
            double randomNum = Math.random() * (max - min + 1) + min;
            int roundedNum = (int) Math.round(randomNum);

            Array.add(roundedNum);
        }
    }

    static void generateIntArrayList(ArrayList<Integer> Array, int max, int min) {

        for (int i = min; i < max; i++) {
            Array.add(i);
        }
    }

    static void removeAllMultiples (ArrayList<Integer> Array, int multiple) {

        for (int i = 0; i < Array.size() ; i++) {

            if (Array.get(i) == multiple) {

            } else if (Array.get(i)%multiple == 0) {
                Array.remove(i);
            }
        }
        System.out.println(Array);
        System.out.println("the size is now "+Array.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> hundredNumbers = new ArrayList<>();
        ArrayList<Integer> hundredNumbersInOrder = new ArrayList<>();
    

        generateRandomIntArrayList(hundredNumbers,1000,1);
        System.out.println(hundredNumbers);
        System.out.println("array is " + hundredNumbers.size() + " long");

        removeAllMultiples(hundredNumbers,5);

        generateIntArrayList(hundredNumbersInOrder,1000,1);
        removeAllMultiples(hundredNumbersInOrder,3);


    }
}
