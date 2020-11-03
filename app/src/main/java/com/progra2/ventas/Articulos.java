package com.progra2.ventas;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

public class Articulos extends AppCompatActivity {

    EditText editTxtProducto;
    EditText editTxtcant;
    EditText editTxtPrecioU;
    Button btnAgregar;
    ListView listView;
    ArrayList<String> articulos;

    String producto;
    int cantidad;
    double precioU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtProducto = (EditText) findViewById(R.id.editTxtProd);
        editTxtcant = (EditText) findViewById(R.id.editTxtCant);
        editTxtPrecioU = (EditText) findViewById(R.id.editTxtPU);
        btnAgregar = (Button) findViewById(R.id.button3);
        listView = (ListView) findViewById(R.id.Lview);

        btnAgregar.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            producto = editTxtProducto.getText().toString();

        }

    });
        String[] values = new String[]{
                "" + producto,
        };
        
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);
        }
    }


