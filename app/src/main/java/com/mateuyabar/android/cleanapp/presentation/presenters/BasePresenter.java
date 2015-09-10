package com.mateuyabar.android.cleanapp.presentation.presenters;

import com.mateuyabar.android.cleanapp.domain.usecases.RecipeUseCases;
import com.mateuyabar.android.cleanbase.presentation.presenters.DefaultPresenter;


public class BasePresenter extends DefaultPresenter{
    RecipeUseCases recipeUseCases = new RecipeUseCases();

    public RecipeUseCases getRecipeUseCases() {
        return recipeUseCases;
    }
}
