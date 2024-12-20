package fitness;

public class Fitness {

    public static void main(String[] args) {
        // Singleton: Activity Tracker
        ActivityTracker activityTracker = ActivityTracker.getInstance();
        activityTracker.addActivity("Running");
        activityTracker.addActivity("Cycling");
        System.out.println("Activities: " + activityTracker.getActivities());

        // Singleton: Goal Management
        GoalManagementSystem goalSystem = GoalManagementSystem.getInstance();
        goalSystem.addGoal("Weight Loss", "Lose 5kg in 2 months");
        System.out.println("Goals: " + goalSystem.getGoals());

        // Factory Pattern: Exercise
        Exercise cardio = ExerciseFactory.createExercise("cardio");
        cardio.perform();

        // Factory Pattern: Nutrition Plan
        NutritionPlan weightLossPlan = NutritionPlanFactory.createPlan("weight loss");
        weightLossPlan.followPlan();

        // Builder Pattern: Workout Routine
        WorkoutRoutine routine = new WorkoutRoutine.Builder()
                .addExercise("Push-ups")
                .addExercise("Squats")
                .build();
        routine.showRoutine();

        // Prototype Pattern: Custom Exercise
        CustomExercise originalExercise = new CustomExercise("Yoga");
        CustomExercise clonedExercise = originalExercise.clone();
        System.out.println("Original Exercise: " + originalExercise.getName());
        System.out.println("Cloned Exercise: " + clonedExercise.getName());
    }
}
