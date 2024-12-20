/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fitness;
import java.util.*;

/**
 *
 * @author AFAQE
 */
// Prototype Pattern: Exercise Prototype

public interface Prototype<T>{
     T clone();
}

class CustomExercise implements Prototype<CustomExercise> {
    private String name;

    public CustomExercise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public CustomExercise clone() {
        return new CustomExercise(this.name);
    }
}
