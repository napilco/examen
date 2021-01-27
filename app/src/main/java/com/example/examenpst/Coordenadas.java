package com.example.examenpst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Coordenadas extends AppCompatActivity {
    ArrayList<EditText> lati;
    ArrayList<EditText>longi;
    ArrayList<String> lon;
    ArrayList<String> lat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordenadas);
        lati.add((EditText)findViewById(R.id.etLat1));
        lati.add((EditText)findViewById(R.id.etLat2));
        lati.add((EditText)findViewById(R.id.etLat3));
        lati.add((EditText)findViewById(R.id.etLat3));
        longi.add((EditText)findViewById(R.id.etLon1));
        longi.add((EditText)findViewById(R.id.etLon2));
        longi.add((EditText)findViewById(R.id.etLon3));
        longi.add((EditText)findViewById(R.id.etLon4));
    }
    public void buscar(View view){
        lat = new ArrayList<>();
        lon = new ArrayList<>();
        for(EditText et: lati){
            String latitud = et.getText().toString();
            lat.add(latitud);
        }
        for (EditText et: longi){
            String longitud = et.getText().toString();
            lon.add(longitud);
        }
        Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(intent);

    }
    public boolean validator(String coordenada){
        
    }


}