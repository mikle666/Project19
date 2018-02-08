package com.example.mike.project19;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // получаем экземпляр FragmentTransaction

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        // добавляем фрагмент
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



//   FragmentManager fragmentManager = getFragmentManager();
//   FragmentTransaction fragmentTransaction = fragmentManager
//           .beginTransaction();

// добавляем фрагмент
//   SearchFragment  mySearchFragment = new SearchFragment();
//   fragmentTransaction.add(R.id.container, mySearchFragment);
//   fragmentTransaction.commit();