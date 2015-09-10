package com.mateuyabar.android.cleanapp.domain.usecases;

import com.mateuyabar.android.cleanapp.domain.models.Recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Recipe Dummy Use Cases
 */
public class RecipeUseCases {
    public static final List<Recipe> recipes = new ArrayList<>(Arrays.asList(new Recipe[]{new Recipe(0, "Paella"), new Recipe(1, "Roasted Rabbit")}));

    public Recipe getRecipe(int id){
        return recipes.get(id);
    }

    public List<Recipe> getRecipes(){
        return recipes;
    }

    public Recipe create(Recipe recipe){
        recipe.setId(recipes.size());
        recipes.add(recipe);
        return recipe;
    }

    public Recipe update(Recipe recipe){
        recipes.set(recipe.getId(), recipe);
        return recipe;
    }
}
