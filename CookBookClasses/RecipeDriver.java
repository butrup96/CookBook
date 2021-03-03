/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utrupbrandon_final;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * RecipeDriver Class:
 * This class uses Ingredient, Recipe and RecipeBox class to create a program
 * the user to make a pseudo recipe book.
 * @author brandon.utrup
 */
public class RecipeDriver {
    
   
    /*
    This is the driver that runs and puts all the other classes together.
    */   
    public static void main (String[] args){
        RecipeBox tmpRecipeBox = new RecipeBox();
        Ingredient tmpIngredient = new Ingredient();
        Recipe tmpRecipe = new Recipe();
        
        int response = 0;
        String input = "";
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("What would you like to  do?");
        System.out.println("1: View all recipes and/or their details.");
        System.out.println("2: Add an Ingredient.");
        System.out.println("3: Add a new Recipe.");
        System.out.println("4: Remove a Recipe.");

       /*
        This loop is to allow the user to enter other inputs to make more choices
        after each switch is finished.
        */ 
      do{
        response = scnr.nextInt(); 
        switch (response){
            
            /*
            Print all recipe names at first, if the users opts to do so, it will
            then print all recipe details
            */
            case 1:
                tmpRecipeBox.getListOfRecipes();
                tmpRecipeBox.printAllRecipeNames();
                
                System.out.println("Would you like to see a recipe's details?");
                System.out.println("Please enter the name of the recipe as it appears you would like to see");
                
                input = scnr.next();
                
                tmpRecipeBox.printAllRecipeDetails();
                
                break;
                
            /*
                NOTE:
                This is the switch to allow the user to edit a recipe. 
                I am unsure how to do that, so for now it does not work correctly.
                */
            case 2:
                tmpRecipeBox.getListOfRecipes();
                
                tmpRecipeBox.printAllRecipeNames();
                
                System.out.println("Which recipe would you like to edit? (enter name as it appears)");
                
                input = scnr.next();
                
                tmpRecipe.getRecipeName().equals(input);
                
                tmpIngredient.getIngredients();
                
                tmpIngredient.addIngredient();
                
            /*
                This allows the user to inpit a new recipe
                It then prints the new recipe for them to see what they entered
                */
            case 3: 
                tmpRecipe.addNewRecipe(input);

                    
                tmpRecipeBox.getListOfRecipes();
                tmpRecipeBox.addNewRecipe();
                
                tmpRecipe.printRecipe();
                //This call has the exception error in it.
                
                break;
                
                
                /*
                This removes a recipe from the list in recipe box
                */ 
            case 4:
                System.out.println("Which recipe would you like to remove?");
                input = scnr.next();
                
                tmpRecipeBox.getListOfRecipes();
                tmpRecipeBox.getListOfRecipes().remove(input);
                break;
                
        }

    } while (response < 5);
   }
}
