package com.example.ninja.cooking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textRecipes;
    private TextView textSearch;
    private TextView textInput;
    private TextView textCreate;
    private TextView textFavorites;
    private EditText ingredientField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textRecipes = (TextView) findViewById(R.id.text_recipes);
        textSearch = (TextView) findViewById(R.id.text_search);
        textInput = (TextView) findViewById(R.id.text_input);
        textCreate = (TextView) findViewById(R.id.text_create);
        textFavorites = (TextView) findViewById(R.id.text_favorites);
//        ingredientField = (EditText) findViewById(R.id.)

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_recipeDatabase:
                                textRecipes.setVisibility(View.VISIBLE);
                                textSearch.setVisibility(View.GONE);
                                textInput.setVisibility(View.GONE);
                                textCreate.setVisibility(View.GONE);
                                textFavorites.setVisibility(View.GONE);

                                break;
                            case R.id.action_searchDatabase:
                                textRecipes.setVisibility(View.GONE);
                                textSearch.setVisibility(View.VISIBLE);
                                textInput.setVisibility(View.GONE);
                                textCreate.setVisibility(View.GONE);
                                textFavorites.setVisibility(View.GONE);
                                break;
                            case R.id.action_input:
                                textRecipes.setVisibility(View.GONE);
                                textSearch.setVisibility(View.GONE);
                                textInput.setVisibility(View.VISIBLE);
                                textCreate.setVisibility(View.GONE);
                                textFavorites.setVisibility(View.GONE);
                                break;
                            case R.id.action_create:
                                textRecipes.setVisibility(View.GONE);
                                textSearch.setVisibility(View.GONE);
                                textInput.setVisibility(View.GONE);
                                textCreate.setVisibility(View.VISIBLE);
                                textFavorites.setVisibility(View.GONE);
                                break;
                            case R.id.action_favorites:
                                textRecipes.setVisibility(View.GONE);
                                textSearch.setVisibility(View.GONE);
                                textInput.setVisibility(View.GONE);
                                textCreate.setVisibility(View.GONE);
                                textFavorites.setVisibility(View.VISIBLE);
                        }
                        return false;
                    }
                });
    }
}
