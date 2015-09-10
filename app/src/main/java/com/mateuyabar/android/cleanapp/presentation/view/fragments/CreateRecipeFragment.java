package com.mateuyabar.android.cleanapp.presentation.view.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.mateuyabar.android.cleanapp.R;
import com.mateuyabar.android.cleanapp.domain.models.Recipe;
import com.mateuyabar.android.cleanapp.presentation.presenters.CreateRecipePresenter;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class CreateRecipeFragment extends BaseFragment<CreateRecipePresenter> implements CreateRecipePresenter.ViewRenderer{
    public static CreateRecipeFragment getInstance(){
        return new CreateRecipeFragment();
    }

    CreateRecipePresenter presenter = new CreateRecipePresenter();

    @InjectView(R.id.recipe_name)
    EditText recipeName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.recipe_form_layout, container, false);
        ButterKnife.inject(this, rootView);
        presenter.initialize(this);

        return rootView;
    }

    @OnClick(R.id.save_button)
    public void saveRecipe(){
        String name = recipeName.getText().toString();
        presenter.saveRecipe(name);
    }

    @Override
    public CreateRecipePresenter getPresenter() {
        return presenter;
    }

    @Override
    public void recipeCreated(Recipe recipe) {
        getNavigator().listRecipes(getActivity());
    }
}
