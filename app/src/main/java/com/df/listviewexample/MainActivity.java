package com.df.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.listviewexample.models.Fruta;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listViewNames;
    private ArrayList<Fruta> listFrutas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewNames = findViewById(R.id.listViewNames);
        Bundle intent = getIntent().getBundleExtra("extra");
        listFrutas = ((ArrayList<Fruta>) (intent.getSerializable("lista")));
        AdapterFruta adapter = new AdapterFruta(this, listFrutas);
        listViewNames.setAdapter(adapter);
        listViewNames.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"ha pulsado el elemento numero "+ listFrutas.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}