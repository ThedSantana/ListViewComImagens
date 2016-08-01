package com.example.aulaunibratec.carrosapp;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by felipe on 30/07/16.
 */
public class CarroAdapter extends BaseAdapter{

    Context ctx;
    List<Carro> carros;

    public CarroAdapter(Context ctx, List<Carro> carros)
    {
        this.ctx = ctx;
        this.carros = carros;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Carro carro = carros.get(position);

        View linha = LayoutInflater.from(ctx).inflate(R.layout.item_carro, null);


        ImageView imgLogo = (ImageView) linha.findViewById(R.id.itemIcon);
        TextView txtModelo =     (TextView) linha.findViewById(R.id.itemModelo);
        TextView txtFabricante = (TextView) linha.findViewById(R.id.itemFabricante);
        TextView txtAno =        (TextView) linha.findViewById(R.id.itemAno);

        Resources res = ctx.getResources();

        TypedArray logos = res.obtainTypedArray(R.array.logos);
        imgLogo.setImageDrawable(logos.getDrawable(carro.getFabricante()));
        txtModelo.setText(carro.getModelo());
        txtFabricante.setText(String.valueOf(carro.getFabricante()));
        txtAno.setText(String.valueOf(carro.getAno()));

        return linha;
    }
}
