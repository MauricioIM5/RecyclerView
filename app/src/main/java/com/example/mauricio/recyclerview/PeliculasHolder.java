package com.example.mauricio.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MAURICIO on 27/01/2018.
 */

public class PeliculasHolder extends RecyclerView.ViewHolder {
    private ImageView ivPortada;
    private TextView tvNombre;
    private TextView tvDuracion;

    public PeliculasHolder(View v){
        super(v);
        ivPortada= (ImageView)v.findViewById(R.id.iv_portada);
        tvNombre= (TextView)v.findViewById(R.id.tv_nombre);
        tvDuracion= (TextView)v.findViewById(R.id.tv_nombre);
    }

    public void enlazarPeliculas(Peliculas item){
        ivPortada.setImageResource(item.getPortadaPelicula());
        tvNombre.setText(item.getNombrePelicula());
        tvDuracion.setText(item.getDuracionPelicula());
    }

}
