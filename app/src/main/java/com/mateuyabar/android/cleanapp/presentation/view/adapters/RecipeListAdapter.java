package com.mateuyabar.android.cleanapp.presentation.view.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.mateuyabar.android.cleanapp.domain.models.Recipe;


public class RecipeListAdapter extends ArrayAdapter<Recipe> {
    public RecipeListAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_1);
    }
}
