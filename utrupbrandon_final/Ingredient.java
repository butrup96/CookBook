/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utrupbrandon_final;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Ingredient Class:
 * The user can input what they wish for an ingredient.
 * At the end of the code, the ingredient will be added to the recipe.
 * @author brandon.utrup
 */
public class Ingredient {

String nameOfIngredient = "";
float numberCups = 0;
int numberCaloriesPerCup = 0;
double totalCalories = 0;
ArrayList Ingredients = new ArrayList();

/*
Accessors and mutators for variables.
*/

    /**
     *
     * @return
     */

public ArrayList getIngredients(){
    return Ingredients;
}

    /**
     *
     * @param Ingredients
     */
    public void setIngredients(ArrayList Ingredients){
    this.Ingredients = Ingredients;
}

    /**
     *
     * @return
     */
    public String getNameOfIngredient(){
    return nameOfIngredient;
}

    /**
     *
     * @param nameOfIngredient
     */
    public void setNameOfIngredient(String nameOfIngredient){
    this.nameOfIngredient = nameOfIngredient;
}

    /**
     *
     * @return
     */
    public float getNumberCups(){
    return numberCups;
}

    /**
     *
     * @param numberCups
     */
    public void setNumberCups(float numberCups){
    this.numberCups = numberCups;
}

    /**
     *
     * @return
     */
    public int getNumberCaloriesPerCup(){
    return numberCaloriesPerCup;
}

    /**
     *
     * @param numberCaloriesPerCup
     */
    public void setNumberCaloriesPerCup(int numberCaloriesPerCup){
    this.numberCaloriesPerCup = numberCaloriesPerCup;
}

    /**
     *
     * @return
     */
    public double getTotalCalories(){
    return totalCalories;
}

    /**
     *
     * @param totalCalories
     */
    public void setTotalCalories(double totalCalories){
    this.totalCalories = totalCalories;
}

/*
This method allows the user to input a new ingredient. This will be used for 
modification if the user chooses to update a recipe .
*/

    /**
     *
     */

    public void addIngredient(){
        int MAX_CUPS = 0;
        double ingredientAmount = 0.0;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("What is the name of the ingredient?");
        nameOfIngredient = scnr.next();
        
        System.out.println("Please enter the amount of cups " + nameOfIngredient + " we will need: (between 1 and 100)");
        
        while (scnr.hasNextFloat()){
            numberCups = scnr.nextFloat();
            
            if (numberCups <= MAX_CUPS){
                
                ingredientAmount = Double.valueOf(numberCups);
                
                System.out.println("You entered " + ingredientAmount + " of " + nameOfIngredient );
                System.out.println("That is a valid number of cups!");
                System.out.println("");
                
                break;
            }
            else if(numberCups > MAX_CUPS){
                System.out.println("That is an invalid number of cups.");
                System.out.println("Try again.");       
            }
            else if(!scnr.hasNextInt()){
                System.out.println("That is not a number.");
                System.out.println("Try again.");
                
            }
            
        }
        
        /*
        This does the math to calculate the total calroies in this ingredient
        along with the number of cups.
        */
        System.out.println("Next, we will need the amount of calories in each cup...");
        System.out.println("Please enter the amount of calories per cup of " + 
                nameOfIngredient + ": (round to the nearest whole number)");
        
        numberCaloriesPerCup = scnr.nextInt();
        
        totalCalories = (ingredientAmount * numberCaloriesPerCup);
        
        System.out.println("With " + numberCups + " cups at " + numberCaloriesPerCup + " calories per cup.");
        System.out.println("That is a grand total of " + totalCalories + " calories for this ingredient.");
        /*
        Note This line below is supposed to add it to an ArrayList but it will not cooperate.
        */
        //Ingredients.add(addIngredient());
        
    }

    
}
