package com.df.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.df.listviewexample.models.Fruta;

import java.util.LinkedList;

public class formularioInicio extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtShaper;
    private EditText txtValue;
    private EditText txtUrlImage;
    private EditText txtSize;
    private Button btnAgregar;
    private Button btnConsultar;

    private LinkedList<Fruta> carros ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_inicio);
        carros = new LinkedList<>();
        txtName  = findViewById(R.id.txtFruitName);
        txtShaper = findViewById(R.id.txtShaper);
        txtValue = findViewById(R.id.txtValue);
        txtUrlImage = findViewById(R.id.txtImageUrl);
        txtSize = findViewById(R.id.txtSize);

        btnAgregar = findViewById(R.id.btnAgregar);
        btnConsultar = findViewById(R.id.btnConsultar);

        btnAgregar.setOnClickListener(this);
        btnConsultar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.btnAgregar:
                Fruta fruta = new Fruta();
                fruta.setName(txtName.getText().toString());
                fruta.setSize(txtSize.getText().toString());
                fruta.setShape(txtShaper.getText().toString());
                fruta.setValue(txtValue.getText().toString());
                fruta.setImage(txtUrlImage.getText().toString());
                carros.add(fruta);
                this.cleanForm();
                Toast.makeText(this, "Fruta adicionada correctamente", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnConsultar:
                Bundle extra = new Bundle();
                extra.putSerializable("lista", carros);

                Intent intent = new Intent(formularioInicio.this,MainActivity.class);
                intent.putExtra("extra", extra);

                startActivity(intent);
                break;
        }



    }

    private void cleanForm(){
        txtName.setText("");
        txtShaper.setText("");
        txtValue.setText("");
        txtUrlImage.setText("");
        txtSize.setText("");
    }
}