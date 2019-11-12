package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*int id = item.getItemId();
        if (id == R.id.settings){
            Toast.makeText(getApplicationContext(),"Settings",Toast.LENGTH_SHORT).show();
        }return super.onOptionsItemSelected(item);*/
        switch (item.getItemId()){
            case R.id.settings:
                Intent intent = new Intent(MainActivity.this,Settings.class);
                startActivity(intent);
                break;

            case R.id.refresh:
                Toast.makeText(getApplicationContext(),"Settings",Toast.LENGTH_SHORT).show();
                break;
            default:return super.onOptionsItemSelected(item);

        }return true;
    }

}