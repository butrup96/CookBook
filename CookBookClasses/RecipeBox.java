/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utrupbrandon_final;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * RecipeBox Class:
 * This stores the recipes from the addNewRecipe method in Recipe class.
 * @author brandon.utrup
 */
public class RecipeBox {
    ArrayList listOfRecipes = new ArrayList();
    
    
    /*
    Accessors and mutators for Variables.
    */
    public ArrayList getListOfRecipes(){
        return listOfRecipes;
    }
    public  void setListOfRecipes(ArrayList listOfRecipes){
        this.listOfRecipes = listOfRecipes;
    }
    public void RecipeBox(){
        this.listOfRecipes = new ArrayList<RecipeBox>();
    }
    public void RecipeBox(ArrayList listOfRecipes){
        this.listOfRecipes = listOfRecipes;
    }
    
    /*
    This prints recipe details
    */
    public void printAllRecipeDetails(){
        RecipeBox tempRecipe = new RecipeBox();
        
        for(int i = 0; i < listOfRecipes.size(); i++){
            tempRecipe.printAllRecipeDetails();

        }
    }
    /*
    This prints all of the recipe names.
    */
    public void printAllRecipeNames(){
        for(int i = 0; i < listOfRecipes.size(); i ++){
            System.out.println(listOfRecipes.get(i));
        }
    }
    
    /*
    This method calls the Recipe class to allow the user to enter a new Recipe
    NOTE:
    There is a constructor on Recipe class that adds the new recipe to an
    ArrayList in this class. This addNewRecipe seems redundant at this point but
    I will leave it in as the UML diagram asked for it.
    */
    public void addNewRecipe(){
        Recipe tmpRecipe = new Recipe();
        

    }
    
}
