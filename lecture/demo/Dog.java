public class Dog {
    public int weightInPounds;

    /** One integer constructor for dogs. */
    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("Woooof!");
        }
    }
}
