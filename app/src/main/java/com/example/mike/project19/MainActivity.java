package com.example.mike.project19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                break;

            case R.id.actionSearch:
                Toast.makeText(this, "Поиск", Toast.LENGTH_LONG).show();
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
