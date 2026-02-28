// Eager way of creating singelton Object
package DesignPatterns.Singelton;

public class Jalebi {
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi() {
        return jalebi;
    }
}

// Not good way of creating obj
// Here if you don't need this in project still this object is created.