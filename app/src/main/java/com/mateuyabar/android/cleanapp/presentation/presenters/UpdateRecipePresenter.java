package com.mateuyabar.android.cleanapp.presentation.presenters;


import com.mateuyabar.android.cleanapp.domain.models.Recipe;

public class UpdateRecipePresenter extends BasePresenter{
    ViewRenderer view;
    Recipe recipe;

    public void initialize(ViewRenderer view, int recipeId){
        this.view = view;
        recipe = getRecipeUseCases().getRecipe(recipeId);
        view.render(recipe);
    }

    /**
     * Called by the view to save the recipe.
     * @param name recipe name
     */
    public void saveRecipe(String name){
        recipe.setName(name);
        recipe = getRecipeUseCases().update(recipe);
        view.recipeUpdated(recipe);
    }

    public interface ViewRenderer {
        /**
         * Renders the recipe to the view for edit
         */
        public void render(Recipe recipe);

        /**
         * Executed when the recipe modifications have been stored.
         */
        public void recipeUpdated(Recipe recipe);
    }
}
