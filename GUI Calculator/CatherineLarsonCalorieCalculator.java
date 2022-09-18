import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
Catherine Larson
431006908
11/15/2021
Calorie Calculator frame
*/

public class CatherineLarsonCalorieCalculator extends JFrame implements ActionListener{
  //GridBagConstraints object to use GridBagLayout:
  private GridBagConstraints calcConstraints;
  //JLabels to show users what values they should enter:
  private JLabel gender;
  private JLabel age;
  private JLabel feetTall;
  private JLabel inchesTall;
  private JLabel height;
  private JLabel weight;
  private JLabel activityLevel;
  //JLabel to show the user what the calculations make:
  private JLabel calorieIntake;
  //text fields to take in text field values:
  private JTextField userAge;
  private JTextField userFeetTall;
  private JTextField userInchesTall;
  private JTextField userWeight;
  private JTextField userCalories;
  //radio buttons and groups to take in radio button values:
  private ButtonGroup genderGroup;
  private JRadioButton male;
  private JRadioButton female;
  private ButtonGroup activityLevelGroup;
  private JRadioButton sedentary;
  private JRadioButton lightlyActive;
  private JRadioButton moderatelyActive;
  private JRadioButton veryActive;
  private JRadioButton extremelyActive;
  //panels to allow for better formatting:
  private JPanel malePanel;
  private JPanel femalePanel;
  private JPanel sedentaryPanel;
  private JPanel lightlyActivePanel;
  private JPanel moderatelyActivePanel;
  private JPanel veryActivePanel;
  private JPanel extremelyActivePanel;
  //submit button and panel:
  private JButton submitButton;
  private JPanel submitPanel;
  CatherineLarsonCalorieCalculator() {
    //creates the constraints:
    calcConstraints = new GridBagConstraints();
    setLayout(new GridBagLayout());
    //sets the title:
    setTitle("Daily Calorie Intake Calculator");
    //sets the labels:
    gender = new JLabel("Gender: ");
    age = new JLabel("               Age: ");
    feetTall = new JLabel("Feet: ");
    inchesTall = new JLabel("Inches: ");
    height = new JLabel("Height:");
    weight = new JLabel("Weight in pounds: ");
    activityLevel = new JLabel("Daily Activity Level: ");
    calorieIntake = new JLabel("Recommended Daily Calorie Intake: ");
    //sets the text fields:
    userAge = new JTextField("18 ");
    userFeetTall = new JTextField("5  ");
    userInchesTall = new JTextField("6  ");
    userWeight = new JTextField("150");
    userCalories = new JTextField("                                                  ");
    userCalories.setEditable(false);
    //sets the radio buttons and groups:
    genderGroup = new ButtonGroup();
    male = new JRadioButton("Male", true);
    female = new JRadioButton("Female", false);
    genderGroup.add(male);
    genderGroup.add(female);
    activityLevelGroup = new ButtonGroup();
    sedentary = new JRadioButton("Sedentary", true);
    lightlyActive = new JRadioButton("Lightly Active", false);
    moderatelyActive = new JRadioButton("Moderately Active", false);
    veryActive = new JRadioButton("Very Active", false);
    extremelyActive = new JRadioButton("Extremely Active", false);
    activityLevelGroup.add(sedentary);
    activityLevelGroup.add(lightlyActive);
    activityLevelGroup.add(moderatelyActive);
    activityLevelGroup.add(veryActive);
    activityLevelGroup.add(extremelyActive);
    //sets the panels:
    malePanel = new JPanel();
    femalePanel = new JPanel();
    sedentaryPanel = new JPanel();
    lightlyActivePanel = new JPanel();
    moderatelyActivePanel = new JPanel();
    veryActivePanel = new JPanel();
    extremelyActivePanel = new JPanel();
    //adds radio buttons to their panels:
    malePanel.add(male);
    femalePanel.add(female);
    sedentaryPanel.add(sedentary);
    lightlyActivePanel.add(lightlyActive);
    moderatelyActivePanel.add(moderatelyActive);
    veryActivePanel.add(veryActive);
    extremelyActivePanel.add(extremelyActive);
    //makes the submit button, gives it a listener, and adds it to a panel:
    submitButton = new JButton("Submit");
    submitPanel = new JPanel();
    submitButton.addActionListener(this);
    submitPanel.add(submitButton);
    //integer that makes it easier to format the user input things:
    int topPadding = 0;
    int sidePadding = 5;
    //adding the labels, buttons, and text fields using a grid bag layout to mainFrame:
    calcConstraints.gridx = 0;
    calcConstraints.gridy = 0;
    calcConstraints.insets = new Insets(20, sidePadding, topPadding, 0);
    add(gender, calcConstraints);
    calcConstraints.gridx = 0;
    calcConstraints.gridy = 1;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(malePanel, calcConstraints);
    calcConstraints.gridx = 0;
    calcConstraints.gridy = 2;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(femalePanel, calcConstraints);
    calcConstraints.gridx = 2;
    calcConstraints.gridy = 0;
    calcConstraints.insets = new Insets(20, sidePadding, topPadding, sidePadding);
    add(height, calcConstraints);
    calcConstraints.gridx = 2;
    calcConstraints.gridy = 1;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, 1);
    add(feetTall, calcConstraints);
    calcConstraints.gridx = 2;
    calcConstraints.gridy = 2;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, 1);
    add(inchesTall, calcConstraints);
    calcConstraints.gridx = 3;
    calcConstraints.gridy = 1;
    calcConstraints.insets = new Insets(topPadding, 1, topPadding, sidePadding);
    add(userFeetTall, calcConstraints);
    calcConstraints.gridx = 3;
    calcConstraints.gridy = 2;
    calcConstraints.insets = new Insets(topPadding, 1, topPadding, sidePadding);
    add(userInchesTall, calcConstraints);
    calcConstraints.gridx = 5;
    calcConstraints.gridy = 0;
    calcConstraints.insets = new Insets(20, sidePadding, topPadding, sidePadding);
    add(activityLevel, calcConstraints);
    calcConstraints.gridx = 5;
    calcConstraints.gridy = 1;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(sedentaryPanel, calcConstraints);
    calcConstraints.gridx = 5;
    calcConstraints.gridy = 2;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(lightlyActivePanel, calcConstraints);
    calcConstraints.gridx = 5;
    calcConstraints.gridy = 3;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(moderatelyActivePanel, calcConstraints);
    calcConstraints.gridx = 5;
    calcConstraints.gridy = 4;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(veryActivePanel, calcConstraints);
    calcConstraints.gridx = 5;
    calcConstraints.gridy = 5;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(extremelyActivePanel, calcConstraints);
    calcConstraints.gridx = 1;
    calcConstraints.gridy = 3;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, 1);
    add(age, calcConstraints);
    calcConstraints.gridx = 2;
    calcConstraints.gridy = 3;
    calcConstraints.insets = new Insets(topPadding, 1, topPadding, sidePadding);
    add(userAge, calcConstraints);
    calcConstraints.gridx = 1;
    calcConstraints.gridy = 4;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(weight, calcConstraints);
    calcConstraints.gridx = 0;
    calcConstraints.gridy = 5;
    calcConstraints.insets = new Insets(topPadding, sidePadding, topPadding, sidePadding);
    add(submitPanel, calcConstraints);
    calcConstraints.gridx = 2;
    calcConstraints.gridy = 4;
    calcConstraints.insets = new Insets(topPadding, sidePadding, 10, sidePadding);
    add(userWeight, calcConstraints);
    calcConstraints.gridx = 0;
    calcConstraints.gridy = 6;
    calcConstraints.insets = new Insets(topPadding, 20, 20, 1);
    add(calorieIntake, calcConstraints);
    calcConstraints.gridx = 1;
    calcConstraints.gridy = 6;
    calcConstraints.insets = new Insets(topPadding, 1, 20, sidePadding);
    add(userCalories, calcConstraints);
    //sets the default operation to exit the program when it closes:
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }//end constructor

  @Override
  public void actionPerformed(ActionEvent event) {
    //creates variables that will be set using user data to be put in a DailyCalorieValue constructor later:
    boolean calcIsMan = false;
    double calcHeightFt = 1;
    double calcHeightIn = 1;
    double calcWeightLbs = 1;
    double calcActivityLevel = 1;
    double calcAge = 1;
    int calories = 0;
    //sets the text field variables to what they are in the text fields and returns error messages if they are not numbers:
    try {
      calcHeightFt = Double.parseDouble(userFeetTall.getText());
    } catch(Exception e) {
      JOptionPane.showMessageDialog(this, "Please enter a number for height in feet.",
               "Calorie Calculator", JOptionPane.ERROR_MESSAGE);
      return;
    }
    try {
      calcHeightIn = Double.parseDouble(userInchesTall.getText());
    } catch(Exception e) {
      JOptionPane.showMessageDialog(this, "Please enter a number for height in inches.",
               "Calorie Calculator", JOptionPane.ERROR_MESSAGE);
      return;
    }
    try {
    calcWeightLbs = Double.parseDouble(userWeight.getText());
    } catch(Exception e) {
      JOptionPane.showMessageDialog(this, "Please enter a number for weight in pounds.",
               "Calorie Calculator", JOptionPane.ERROR_MESSAGE);
      return;
    }
    try {
    calcAge = Double.parseDouble(userAge.getText());
    } catch(Exception e) {
      JOptionPane.showMessageDialog(this, "Please enter a number for age.",
               "Calorie Calculator", JOptionPane.ERROR_MESSAGE);
      return;
    }
    //restricts values for height, age, and weight:
    if(calcHeightFt <= 0 || calcHeightFt >= 8 || calcHeightIn < 0 || calcHeightIn >12) {
      JOptionPane.showMessageDialog(this, "Please enter valid height values. Feet must be between 0-8, and inches between 0-12.",
               "Calorie Calculator", JOptionPane.ERROR_MESSAGE);
      return;
    }
    if(calcWeightLbs <= 0 || calcWeightLbs >= 800) {
      JOptionPane.showMessageDialog(this, "Please enter valid weight value. Weight must be between 0-800 pounds.",
               "Calorie Calculator", JOptionPane.ERROR_MESSAGE);
      return;
    }
    if(calcAge <= 0 || calcAge >= 150) {
      JOptionPane.showMessageDialog(this, "Please enter valid age value. Age must be between 0-150 years.",
               "Calorie Calculator", JOptionPane.ERROR_MESSAGE);
      return;
    }
    //assigns value to isMan:
    if(male.isSelected()) {
      calcIsMan = true;
    }
    //assigns multiplier to activity level based on which radio button is selected:
    if(sedentary.isSelected()) {
      calcActivityLevel = 1.2;
    } else if(lightlyActive.isSelected()) {
      calcActivityLevel = 1.375;
    } else if(moderatelyActive.isSelected()) {
      calcActivityLevel = 1.55;
    } else if(veryActive.isSelected()) {
      calcActivityLevel = 1.725;
    } else if(extremelyActive.isSelected()) {
      calcActivityLevel = 1.9;
    }
    //makes a new calculation and calculates calorie value:
    CatherineLarsonDailyCalorieValue myValue = new CatherineLarsonDailyCalorieValue(calcIsMan, calcHeightFt,
    calcHeightIn, calcWeightLbs, calcActivityLevel, calcAge);
    calories = (int)Math.round(myValue.calcCalories());
    //sets the text box to the calculated value
    userCalories.setText(Integer.toString(calories));

  }//end actionPerformed
}//end class
