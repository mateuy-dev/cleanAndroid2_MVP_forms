package com.mateuyabar.android.cleanapp.presentation.presenters;


import com.mateuyabar.android.cleanapp.domain.models.Recipe;

import java.util.List;

public class RecipeListPresenter  extends BasePresenter {
    ViewRenderer view;


    public void initialize(ViewRenderer view){
        this.view = view;
        loadRecipiesList();
    }

    private void loadRecipiesList(){
        view.render(recipeUseCases.getRecipes());
    }

    public void displayRecipe(Recipe recipe){
        view.render(recipe);
    }

    public interface ViewRenderer{
        /**
         * Renders the list to the screen
         * @param recipeList
         */
        public void render(List<Recipe> recipeList);

        /**
         * Renders a single recipie detail view (or performs navigation)
         * @param recipe
         */
        public void render(Recipe recipe);
    }
}
