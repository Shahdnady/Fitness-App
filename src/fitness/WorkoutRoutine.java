package fitness;


import java.util.ArrayList;
import java.util.List;

public class WorkoutRoutine {

    private List<String> exercises;

    public WorkoutRoutine(Builder builder) {
        this.exercises = builder.exercises;
    }

    // هذه الطريقة تقوم بإرجاع الروتين في صيغة نصية
    public String showRoutine() {
        StringBuilder routineText = new StringBuilder("Workout Routine:\n");
        for (String exercise : exercises) {
            routineText.append(exercise).append("\n");
        }
        return routineText.toString();
    }

    public static class Builder {
        private List<String> exercises = new ArrayList<>();

        public Builder addExercise(String exercise) {
            exercises.add(exercise);
            return this;
        }

        public WorkoutRoutine build() {
            return new WorkoutRoutine(this);
        }
    }
}
