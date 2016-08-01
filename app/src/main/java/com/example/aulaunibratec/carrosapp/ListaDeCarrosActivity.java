package com.example.aulaunibratec.carrosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarrosActivity extends AppCompatActivity {

    List<Carro> carros;
    CarroAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listView = new ListView(this);
        setContentView(listView);
        carros = new ArrayList<Carro>();
        for (int i = 0; i < 20; i++) {
            carros.add(new Carro("Celta" + i,2010,0));
            carros.add(new Carro("Uno" +i ,2012,1));
            carros.add(new Carro("Gol" + i, 2011,2));
        }
        adapter = new CarroAdapter(this, carros);
        listView.setAdapter(adapter);
    }
}
