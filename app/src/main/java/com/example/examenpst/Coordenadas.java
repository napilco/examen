package com.example.examenpst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Coordenadas extends AppCompatActivity {
    ArrayList<EditText> lati = new ArrayList<>();
    ArrayList<EditText>longi = new ArrayList<>();
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
        if (validator(lat,lon)){
            Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
            intent.putStringArrayListExtra("latitud", lat);
            intent.putStringArrayListExtra("longitud", lon);
            startActivity(intent);
        }


    }
    public boolean validator(ArrayList<String> lat, ArrayList<String> lon){
        for (String latitud: lat ){
            if(!val(latitud)){
                Toast.makeText(getApplicationContext(),"No es válida la coordenada ingresada",Toast.LENGTH_SHORT);
                return false;
            }
        }
        return true;
    }
    public boolean val(String coor){
        try{
            double coordenada = Double.valueOf(coor);
        }catch(Exception e){
            return false;
        }
        return true;
    }


}