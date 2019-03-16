package com.symphoniax.dndlotrabilities.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.symphoniax.dndlotrabilities.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.information_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.general_info:
                Intent info = new Intent(this, GeneralInfo.class);
                startActivity(info);
                return true;
            case R.id.culture:
                Intent cultures = new Intent(this, CulturesActivity.class);
                startActivity(cultures);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
