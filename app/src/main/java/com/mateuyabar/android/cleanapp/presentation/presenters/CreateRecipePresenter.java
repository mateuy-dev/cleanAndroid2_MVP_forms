package com.mateuyabar.android.cleanapp.presentation.presenters;

import com.mateuyabar.android.cleanapp.domain.models.Recipe;


public class CreateRecipePresenter extends BasePresenter {
    ViewRenderer view;

    public void initialize(ViewRenderer view) {
        this.view = view;
    }

    /**
     * Called by the view to save the recipe.
     * @param name recipe name
     */
    public void saveRecipe(String name){
        Recipe created = recipeUseCases.create(new Recipe(name));
        view.recipeCreated(created);
    }

    public interface ViewRenderer{
        /**
         * Executed when the recipe has been created.
         */
        public void recipeCreated(Recipe recipe);
    }
}
