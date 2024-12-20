package fitness;

import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerProxy {
    private ActivityTracker activityTracker;

    public ActivityTrackerProxy() {
        this.activityTracker = ActivityTracker.getInstance();
    }

    public void addActivity(String activity) {
        System.out.println("Logging activity: " + activity);
        activityTracker.addActivity(activity);
    }

    public List<String> getActivities() {
        return activityTracker.getActivities();
    }
}
