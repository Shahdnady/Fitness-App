package fitness;

import java.util.ArrayList;
import java.util.List;

public class GoalManagementSystem {
    private static GoalManagementSystem instance;
    private List<String> goals = new ArrayList<>();

    private GoalManagementSystem() {}

    public static GoalManagementSystem getInstance() {
        if (instance == null) {
            instance = new GoalManagementSystem();
        }
        return instance;
    }

    public void addGoal(String goal, String description) {
        goals.add(goal + ": " + description);
    }

    public List<String> getGoals() {
        return goals;
    }
}
