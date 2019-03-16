package com.symphoniax.dndlotrabilities.activities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.symphoniax.dndlotrabilities.R;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {

    private ArrayList<String> dati;
    private Context context;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<String> dati) {
        super(context, resource);
        this.dati = dati;
        this.context = context;
    }

    // QUESTO METODO RESTITUISCE IL NUMERO DI SELEMENTI
    // DELLA LISTVIEW DA DISEGNARE
    @Override
    public int getCount() {
        return dati.size();
    }

    //getView SARÀ RICHIAMATA TANTE VOLTE QUANTI SONO GLI ELEMENTI
    //CONETNUTI NELLA LISTA DI DATI OGNI VOLTA CON position INCREMENTATO
    //E IL RIFERIMENTO convertView ALLA VIEW DA DISEGNARE
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        // È ANALOGO ALLA setContentView DELLA ACTIVITY
        convertView = View.inflate(context, R.layout.item, null);

        //DEVO CHIAMARE findViewById SULL'OGGETTO convertView PERCHÉ
        //ARRAY ADAPTER NON L'HA DEFINITO MA VIEW SI

        TextView nome = convertView.findViewById(R.id.nome);

        nome.setText(dati.get(position));

        return convertView;
    }
}
