package com.mateuyabar.android.cleanapp.presentation.navigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.mateuyabar.android.cleanapp.R;
import com.mateuyabar.android.cleanapp.presentation.view.fragments.CreateRecipeFragment;
import com.mateuyabar.android.cleanapp.presentation.view.fragments.ListRecipesFragment;
import com.mateuyabar.android.cleanapp.presentation.view.fragments.ShowRecipeDetailFragment;
import com.mateuyabar.android.cleanapp.presentation.view.fragments.UpdateRecipeFragment;

/**
 * Created by mateuyabar on 3/09/15.
 */
public class Navigator {
    public void show(FragmentActivity activity, int recipeId){
        Fragment fragment = ShowRecipeDetailFragment.getInstance(recipeId);
        changeFragment(activity, fragment);
    }

    public void edit(FragmentActivity activity, int recipeId){
        Fragment fragment = UpdateRecipeFragment.getInstance(recipeId);
        changeFragment(activity, fragment);
    }

    public void createRecipe(FragmentActivity activity){
        Fragment fragment = CreateRecipeFragment.getInstance();
        changeFragment(activity, fragment);
    }

    public void listRecipes(FragmentActivity activity){
        changeFragment(activity, ListRecipesFragment.getInstance());

    }

    private void changeFragment(FragmentActivity activity, Fragment newFragment){
        FragmentManager manager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment).commit();//addToBackStack(null).
    }


}
