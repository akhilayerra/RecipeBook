package com.example.recipe;
import java.util.*;
import com.example.recipe.Recipe;

public interface RecipeRepository{
    ArrayList<Recipe> getAllRecipes();
    void deleteRecipe(int recipeId);
    Recipe updateRecipe(int recipeId,Recipe recipe);
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(int recipeId);
}