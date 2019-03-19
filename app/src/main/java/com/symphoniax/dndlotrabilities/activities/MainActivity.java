package com.symphoniax.dndlotrabilities.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.symphoniax.dndlotrabilities.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayList<String> classi = new ArrayList<>(
            Arrays.asList("Classe 1", "Classe 2", "Classe 3", "Classe 4", "Classe 5", "Classe 6", "Classe 7"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_list);

        CustomAdapter adapter = new CustomAdapter(
                this,
                R.layout.item,
                classi);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Toast.makeText(MainActivity.this,
                        classi.get(position), Toast.LENGTH_SHORT).show();
            }
        });
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
