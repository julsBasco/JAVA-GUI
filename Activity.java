public class Activity{

    String activityName;
    double activityCalories;

    public Activity(String n, double c){
        activityName = n;
        activityCalories = c;
    }

    public String getActivityName(){
        return activityName;
    }

    public double getActivityCalories(){
        return activityCalories;
    }

    public void updateCalories(double c){
        activityCalories = c;
    }
}