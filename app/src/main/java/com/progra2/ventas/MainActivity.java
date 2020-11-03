package com.progra2.ventas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FragmentArticulos.OnFragmentInteraction, FragmentDetalle.OnFragmentInteractionListener {

    EditText editTxtProducto;
    EditText editTxtcant;
    EditText editTxtPrecioU;
    Button btnArt,btnDet,btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregar = (Button)findViewById(R.id.button3);

        FragmentArticulos FragArticulos = new FragmentArticulos();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, FragArticulos);
        btnArt = (Button)findViewById(R.id.btnArticulo);
        btnDet = (Button)findViewById(R.id.btnDetalle);

        btnArt.setOnClickListener(this);
        btnDet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnArticulo:

                FragmentArticulos FragArticulos = new FragmentArticulos();
                FragmentTransaction transition =  getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, FragArticulos);
                transition.commit();
                break;

            case R.id.btnDetalle:

                FragmentDetalle FragDetalle = new FragmentDetalle();
                FragmentTransaction transition1 =  getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, FragDetalle);
                transition1.commit();
                break;
        }
    }

    public void onFragmentInteraction(Uri uri) {
    }
}

