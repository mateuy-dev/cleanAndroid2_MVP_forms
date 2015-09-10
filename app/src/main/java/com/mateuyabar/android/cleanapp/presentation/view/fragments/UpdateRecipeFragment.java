package com.mateuyabar.android.cleanapp.presentation.view.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.mateuyabar.android.cleanapp.R;
import com.mateuyabar.android.cleanapp.domain.models.Recipe;
import com.mateuyabar.android.cleanapp.presentation.presenters.UpdateRecipePresenter;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class UpdateRecipeFragment extends BaseFragment<UpdateRecipePresenter> implements UpdateRecipePresenter.ViewRenderer{
    public static final String RECIPE_ID = "recipe_id";

    public static UpdateRecipeFragment getInstance(int recipeId){
        UpdateRecipeFragment fragment = new UpdateRecipeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(RECIPE_ID, recipeId);
        fragment.setArguments(bundle);
        return fragment;
    }

    UpdateRecipePresenter presenter = new UpdateRecipePresenter();

    @InjectView(R.id.recipe_name)
    EditText recipeName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.recipe_form_layout, container, false);
        ButterKnife.inject(this, rootView);

        int recipeId = getArguments().getInt(RECIPE_ID);

        presenter.initialize(this, recipeId);

        return rootView;
    }

    @OnClick(R.id.save_button)
    public void saveRecipe(){
        String name = recipeName.getText().toString();
        presenter.saveRecipe(name);
    }

    @Override
    public UpdateRecipePresenter getPresenter() {
        return presenter;
    }

    @Override
    public void render(Recipe recipe) {
        recipeName.setText(recipe.getName());
    }

    @Override
    public void recipeUpdated(Recipe recipe) {
        getNavigator().listRecipes(getActivity());
    }
}
