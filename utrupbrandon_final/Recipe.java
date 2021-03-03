/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utrupbrandon_final;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Recipe Class:
 * The user can add a recipe.
 * The recipe will be added to a list at the end of the code that will be used
 * in RecipeBox Class.
 * @author brandon.utrup
 */
public class Recipe {
    String recipeName = "";
    int servings = 0;
    ArrayList <String> recipeIngredients = new ArrayList();
    double totalRecipeCalories = 0.0;
    
    
    /*
    Accessors and Mutators for variables.
    */
    public String getRecipeName(){
        return recipeName;
    }
    public void setRecipeName(String recipeName){
        this.recipeName = recipeName;
    }
    public int getServings(){
        return servings;
    }
    public void setServings(int servings){
        this.servings = servings;
    }
    public ArrayList getRecipeIngredients(){
        return recipeIngredients;
    }
    public void setRecipeIngredients(ArrayList recipeIngredients){
        this.recipeIngredients = recipeIngredients;
    }
    public double getTotalRecipeCalories(){
        return totalRecipeCalories;
    }
    public void setTotalRecipeCalories(double totalRecipeCalories){
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    /*
    This prints the Recipe and its ingredients.
    */

    
    /*
    This is the method that allows the user to enter inputs to make a new recipe.
    */
    public Recipe addNewRecipe(String tmpRecipe){
        double totalRecipeCalories = getTotalRecipeCalories();
        ArrayList<String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;

        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter recipe name:");
        String recipeName = scnr.next();
        
        System.out.println("Please enter the amount of servings:");
        int servings = scnr.nextInt();
        this.servings = getServings();
        
        
        do{
            System.out.println("Please enter the ingredients or type end if you are finished");
            String ingredientName = scnr.next();
            
                if (ingredientName.toLowerCase().equals("end")){
                    addMoreIngredients = false;
                    break;
                }
                else{
                    recipeIngredients.add(ingredientName);
                    
                    System.out.println("Please enter the amount of cups for this ingredient:");
                    System.out.println("Please enter in 0.0 format.");
                    double ingredientAmount = scnr.nextDouble();
                    
                    
                    System.out.println("Please enter the total calories for this ingredient:");
                    System.out.println("Please enter in 0.0 format.");
                    double ingredientCalories = scnr.nextDouble();
                    
                    totalRecipeCalories += (ingredientAmount * ingredientCalories);
                }
        }while(addMoreIngredients);
        
        /*
        This adds it to the recipe arraylist in the recipe box.
        */
        RecipeBox newRecipe = new RecipeBox();
        newRecipe.listOfRecipes.add(addNewRecipe(tmpRecipe));
        


        return addNewRecipe(tmpRecipe);
    }
    public void printRecipe(){
        /*
        singleServing variable will always create an exception due to dividing by 0
        As it stands, I have no work around for this.
        I had the same issue in an earlier assingment and still have no been able to fix it.
        */
        int singleServing = ((int)totalRecipeCalories/servings);
        
       System.out.println("Recipe: " + recipeName);
       System.out.println("Servings: " + servings);
       System.out.println("Ingredients: ");
       
       for(int i = 0; i < recipeIngredients.size(); i++){
           System.out.println(recipeIngredients.get(i));
       }
       System.out.println("Each serving has " + singleServing + " calories.");
    }

}
