package com.example.mike.project19;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity {

    public static final String MY_SETTINGS = "my_settings";
    public static final String KEY_RADIOBUTTON_INDEX = "KEY_RADIOBUTTON_INDEX";

    private SharedPreferences mSharedPreferencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSharedPreferencesHelper = getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);
       // Toast.makeText(this,Integer.toString(mSharedPreferencesHelper.getInt(KEY_RADIOBUTTON_INDEX,0)) , Toast.LENGTH_LONG).show();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        MainActivFragment myFragment = new MainActivFragment();
        fragmentTransaction.add(R.id.container, myFragment);
        fragmentTransaction.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.actionSettings:
                Toast.makeText(this, "Настройки", Toast.LENGTH_LONG).show();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, SettingsFragment.newInstance())
                        .addToBackStack(SettingsFragment.class.getName())
                        .commit();
                break;

            case R.id.actionSearch:
                Toast.makeText(this, "Поиск", Toast.LENGTH_LONG).show();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, SearchFragment.newInstance())
                        .addToBackStack(SearchFragment.class.getName())
                        .commit();
                break;
            case R.id.actionExit:
                Toast.makeText(this, "Выход", Toast.LENGTH_LONG).show();
                finish();
                break;
                /*  */
        }
        return super.onOptionsItemSelected(item);
    }
}

