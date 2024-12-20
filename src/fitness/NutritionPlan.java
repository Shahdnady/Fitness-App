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
// Factory Pattern: Nutrition Plans

abstract class NutritionPlan {
    public abstract void followPlan();
}

class WeightLossPlan extends NutritionPlan {
    @Override
    public void followPlan() {
        System.out.println("Following Weight Loss Nutrition Plan.");
    }
}

class MuscleGainPlan extends NutritionPlan {
    @Override
    public void followPlan() {
        System.out.println("Following Muscle Gain Nutrition Plan.");
    }
}

class NutritionPlanFactory {
    public static NutritionPlan createPlan(String goal) {
        switch (goal.toLowerCase()) {
            case "weight loss":
                return new WeightLossPlan();
            case "muscle gain":
                return new MuscleGainPlan();
            default:
                throw new IllegalArgumentException("Invalid goal type");
        }
    }
}

