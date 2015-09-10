package com.mateuyabar.android.cleanapp.presentation.view.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mateuyabar.android.cleanapp.R;
import com.mateuyabar.android.cleanapp.presentation.view.fragments.ListRecipesFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, ListRecipesFragment.getInstance()).commit();
    }
}
