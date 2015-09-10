package com.mateuyabar.android.cleanapp.presentation.presenters;

import com.mateuyabar.android.cleanapp.domain.models.Recipe;
import com.mateuyabar.android.cleanapp.presentation.navigation.Navigator;


public class ShowRecipeDetailPresenter extends BasePresenter {
    Navigator navigator = new Navigator();
    ViewRenderer view;
    int recipeId;

    public void initialize(ViewRenderer view, int recipeId){
        this.view = view;
        this.recipeId = recipeId;
        loadRecipe();
    }

    private void loadRecipe() {
        Recipe recipe = recipeUseCases.getRecipe(recipeId);
        view.render(recipe);
    }

    public void editRecipe(){
        view.renderEdit(recipeId);
    }

    public static interface ViewRenderer {
        public void render(Recipe recipe);
        public void renderEdit(int recipeId);
    }
}
