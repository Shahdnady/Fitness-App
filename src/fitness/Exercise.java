/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitness;
import java.util.*;


/**
 *
 * @author AFAQE
 */
// Factory Pattern: Exercise Types

abstract class Exercise {
    public  abstract void perform();
}

class Cardio extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing Cardio Exercise.");
    }
}

class Strength extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing Strength Exercise.");
    }
}

class Flexibility extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing Flexibility Exercise.");
    }
}

class ExerciseFactory {
    public static Exercise createExercise(String type) {
        switch (type.toLowerCase()) {
            case "cardio":
                return new Cardio();
            case "strength":
                return new Strength();
            case "flexibility":
                return new Flexibility();
            default:
                throw new IllegalArgumentException("Invalid exercise type");
        }
    }
}
