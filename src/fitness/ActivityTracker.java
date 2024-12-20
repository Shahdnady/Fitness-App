package fitness;

import java.util.ArrayList;
import java.util.List;

// Singleton: Activity Tracker
public class ActivityTracker {
    private static ActivityTracker instance;
    private List<String> activities;

    private ActivityTracker() {
        activities = new ArrayList<>();
    }

    public static ActivityTracker getInstance() {
        if (instance == null) {
            instance = new ActivityTracker();
        }
        return instance;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public List<String> getActivities() {
        return activities;
    }
}
