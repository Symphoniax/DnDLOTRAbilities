package com.symphoniax.dndlotrabilities.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.symphoniax.dndlotrabilities.R;

import java.util.ArrayList;
import java.util.Arrays;

public class CulturesActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayList<String> culture = new ArrayList<>(
            Arrays.asList("Bardiani", "Beorniani", "CavalieriRohan", "Dunedain", "ElfiBoscoAtro", "Hobbit", "Nani", "UominiBoschi","UominiBrea",
                    "UominiLago","UominiMinasTirith"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultures);

        listView = findViewById(R.id.cultures_list);

        CustomAdapter adapter = new CustomAdapter(
                this,
                R.layout.item,
                culture);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Toast.makeText(CulturesActivity.this,
                        culture.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
