import java.util.ArrayList;

public class LifestyleTracker{
    double totalCalorieGain;
    double totalCalorieBurned;
    double netCalorie;
    ArrayList <Food> foodCollection = new ArrayList<Food>();
    ArrayList <Activity> activityCollection = new ArrayList<Activity>();
    ArrayList <String> foodConsumed = new ArrayList<String>();
    ArrayList <String> activityDone = new ArrayList<String>();


    public String addFood ( String n, double c ) {
        if(foodCollection.size() > 0){
            //finds a matching object to the parameter
            for(int i = 0; i < 1; i++){
                for(int j = 0; j<foodCollection.size() ; j++){
                    if(foodCollection.get(j).getFoodName() == n){
                        foodCollection.get(j).updateCalories(c);
                        return ("Food Calorie updated");
                    }
                }
                foodCollection.add(new Food(n,c));
                return ("New Food has been added");
            }
        }
        
        foodCollection.add(new Food(n,c));
        return ("New Food has been added");
    }

    public String addActivity ( String n, double c ) {
        if(activityCollection.size() > 0){
            //finds a matching object to the parameter
            for(int i = 0; i < 1; i++){
                for(int j = 0; j < activityCollection.size() ; j++){
                    if(activityCollection.get(j).getActivityName() == n){
                        activityCollection.get(j).updateCalories(c);
                        return ("Activity Calorie updated");
                    }
                }
                activityCollection.add(new Activity(n,c));
                return ("New Activity has been added");
            }
        }
        
        activityCollection.add(new Activity(n,c));
        return ("New Activity has been added");
    }

    public String eat( String foodName, double servings ) {
        if(servings > 0) {
            for(int i = 0; i < 1; i++){
                for(int j = 0; j<foodCollection.size() ; j++){
                    if(foodCollection.get(j).getFoodName() == foodName){
                        foodConsumed.add(foodName);
                        totalCalorieGain += foodCollection.get(j).getFoodCalories() * servings;
                        return ("Food is recorded successfully");
                    }
                }
                
                return ("The Food entered is not in the collections");
            }
        } 
        
        return "The servings must not be a negative value";
        
    }

    public String perform( String actName, double hours ) {
        if(hours > 0) {
            for(int i = 0; i < 1; i++){
                for(int j = 0; j<activityCollection.size() ; j++){
                    if(activityCollection.get(j).getActivityName() == actName){
                        activityDone.add(actName);
                        totalCalorieBurned += activityCollection.get(j).getActivityCalories() * hours;
                        return ("Activity is recorded successfully");
                    }
                }
                
                return ("The Activity entered is not in the collections");
            }
        } 
        
        return "The Hours must not be a negative value";
    }

    public String report() {
        String totalFood = "";
        String totalActivity = "";
        String reportResponse = "";
        double verdict;

        for(int i=0; i < foodConsumed.size(); i++){
            totalFood += foodConsumed.get(i) + ", ";
        }

        for(int i=0; i < activityDone.size(); i++){
            totalActivity += activityDone.get(i) + ", ";
        }

        netCalorie = totalCalorieGain - totalCalorieBurned;

        verdict = netCalorie * 0.00012959782;

        reportResponse = "Here is the report of your progress: " + "Food Consumption: " + totalFood +   "Activity Done: " + totalActivity + " Gained/Loss: " + verdict + " Kilograms";

        return reportResponse;
    }


}
