package com.example.mauricio.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by MAURICIO on 27/01/2018.
 */

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasHolder>{
    private ArrayList<Peliculas> data;

    public PeliculasAdapter(ArrayList<Peliculas> data){
        this.data=data;
    }

    @Override
    public PeliculasHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item_peliculas, parent, false);
        PeliculasHolder ph = new PeliculasHolder(view);

        return ph;
    }

    @Override
    public void OnBindViewHolder(PeliculasHolder holder, int position){
        Peliculas item=data.get(position);
        holder.enlazarPeliculas(item);
    }

    @Override
    public int getItemCount(){
        return data.size();
    }
}
