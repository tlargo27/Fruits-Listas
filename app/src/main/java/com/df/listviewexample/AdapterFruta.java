package com.df.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.listviewexample.models.Fruta;

import java.util.ArrayList;

public class AdapterFruta extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Fruta> frutas;

    public AdapterFruta(Activity activity, ArrayList<Fruta> frutas) {
        this.activity = activity;
        this.frutas = frutas;
    }

    public void addFruta(Fruta fruta){
        frutas.add(fruta);
    }

    public void addFruta(ArrayList<Fruta> frutaElements){
        frutas.addAll(frutaElements);
    }

    @Override
    public int getCount() {
        return frutas.size();
    }

    @Override
    public Object getItem(int position) {
        return frutas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.fruta_item,null);
        }
        Fruta frutaElement = frutas.get(position);
        TextView nameCar = v.findViewById(R.id.frutaName);
        nameCar.setText(frutaElement.getName());

        TextView frutaSahper = v.findViewById(R.id.frutaShaper);
        frutaSahper.setText(frutaElement.getShape());

        TextView sizeFruta = v.findViewById(R.id.frutaSize);
        sizeFruta.setText(frutaElement.getSize());

        TextView value = v.findViewById(R.id.frutaValue);
        value.setText(frutaElement.getValue());

        return v;
    }
}
