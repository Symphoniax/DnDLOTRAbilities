package com.symphoniax.dndlotrabilities.activities;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.symphoniax.dndlotrabilities.R;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GeneralInfo extends AppCompatActivity {

    private TextView infoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_info);

        infoView = findViewById(R.id.infoView);

        try {
            StringBuilder stringBuilder = loadInfo(this);
            infoView.setText(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private StringBuilder loadInfo(Context context) throws IOException {

        final Resources resources = context.getResources();

        InputStream inputStream = resources.openRawResource(R.raw.riassunto);

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        try {

            String infoString;

            while((infoString = bufferedReader.readLine()) != null){
                stringBuilder.append(infoString).append("\n");
            }
        } finally {
            bufferedReader.close();
        }

        return stringBuilder;
    }
}
