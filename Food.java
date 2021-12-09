public class Food{

    String foodName;
    double foodCalories;

    public Food(String f, double c){
        foodName = f;
        foodCalories = c;
    }

    public String getFoodName(){
        return foodName;
    }

    public double getFoodCalories(){
        return foodCalories;
    }

    public void updateCalories(double c){
        foodCalories = c;
    }
}