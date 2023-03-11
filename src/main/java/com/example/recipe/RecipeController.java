package com.example.recipe;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;

@RestController
public class RecipeController{
    RecipeService recipeservice=new RecipeService();
    @GetMapping("/recipes")
    public ArrayList<Recipe> getAllRecipes(){
        return recipeservice.getAllRecipes();
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId){
        recipeservice.deleteRecipe(recipeId);
    }
    
    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return recipeservice.updateRecipe(recipeId, recipe);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeservice.addRecipe(recipe);
    }
    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipe(@PathVariable("recipeId") int recipeId){
        return recipeservice.getRecipe(recipeId);
    }
}