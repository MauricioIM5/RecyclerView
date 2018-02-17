package com.example.mauricio.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPeliculas;
    private RecyclerView.Adapter adapterPeliculas;
    private RecyclerView.LayoutManager layoutManagerPeliculas;

    private ArrayList<Peliculas> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Carga de DATOS
    data = new ArrayList<Peliculas>();
    data.add(new Peliculas(R.drawable.))





}
