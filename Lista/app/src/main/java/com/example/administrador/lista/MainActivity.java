package com.example.administrador.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView mostrar = (ListView) findViewById(R.id.lista_show);
        String[] paises = new String[]{"Mexico", "Estados Unidos", "Argentina", "Chile", "Canada", "Colombia", "Peru", "Brasil", "Venezuela", "Costa Rica"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        mostrar.setAdapter(adaptador);

        mostrar.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                int item = position + 1;
                String itemval = (String)mostrar.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), item +": " + itemval, Toast.LENGTH_LONG).show();
            }
        });
    }
}
