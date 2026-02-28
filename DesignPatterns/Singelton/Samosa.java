// Lazy way of Creating Singelton Object
package DesignPatterns.Singelton;

public class Samosa {
    private static Samosa samosa;

    // Constructor
    private Samosa() {

    }

    // Object of this Class
    public static Samosa getSamosa() {
        if (samosa == null) {
            samosa = new Samosa();
        }

        return samosa;
    }
}
