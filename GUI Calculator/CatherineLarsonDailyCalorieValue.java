/*
Catherine Larson
431006908
CSCE-111
11/15/2021
PC User
Daily Caloric Intake Calculator
*/
class CatherineLarsonDailyCalorieValue {
  //declares private variables that will be used in calculations:
  private boolean isMan;
  private double weightKg;
  private double heightCm;
  private double heightFt;
  private double heightIn;
  private double weightLbs;
  private double activityLevel;
  private double age;
  //constructor that converts everything to the metric system to make calculations easier:
  CatherineLarsonDailyCalorieValue(boolean isMan, double heightFt, double heightIn, double weightLbs, double activityLevel, double age) {
    this.isMan = isMan;
    this.heightCm = 30.48*heightFt + 2.54*heightIn;
    this.weightKg = 0.45359237*weightLbs;
    this.activityLevel = activityLevel;
    this.age = age;
  }//end constructor
  //method that returns daily calorie values based on inputted variables and the formula for basal metabolic rate and
  //calorie intake based on BMR and activity level:
  public double calcCalories() {
    double dailyValue = 0;
    if(this.isMan) {
      double bmr = 88.362 + (13.397*this.weightKg) + (4.799*heightCm) - (5.677 * this.age);
      dailyValue = bmr*this.activityLevel;
    } else {
      double bmr = 447.593 + (9.247*this.weightKg) + (3.098*heightCm) - (4.330*this.age);
      dailyValue = bmr*this.activityLevel;
    }
    return dailyValue;
  }//end calcCalories
}//end class
