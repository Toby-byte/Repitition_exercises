public class Opgave_4 {

    static int secondsInAYear() {
        int numYears = 5;
        int seconds = 60*60*24*365*numYears;
        return seconds;
    }

    static int bornInAYear(int seconds) {
        int humansBorn = seconds/7;
        return humansBorn;
    }

    static int deadInAYear(int seconds) {
        int humansDied = seconds/13;
        return humansDied;
    }

    static int growthInAYear(int born,int dead) {
        int growth =born-dead;
        return growth;
    }

    public static void main(String[] args) {

        int b = bornInAYear(secondsInAYear());
        int d = deadInAYear(secondsInAYear());
        int growth = (growthInAYear(b, d));
        System.out.println("The growth is: "+growth);

        int usaPop = 331002651;
        int sum = usaPop+growth;
        System.out.println("USA current pop: " + usaPop);
        System.out.println("there will be: "+sum+" americans in 2026");

    }
}
