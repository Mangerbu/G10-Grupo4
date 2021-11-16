package co.edu.unab.apprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import co.edu.unab.apprecyclerview.model.Registro;

public class MainActivity extends AppCompatActivity {
    String IMC;
    private ArrayList<Registro> registro = new ArrayList<Registro>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registro.add(new Registro(1L, "Manuel", 175L, 75L, 24L));
        registro.add(new Registro(2L, "Samuel", 178L, 79L, 24L));
        registro.add(new Registro(3L, "Antonio", 158L, 80L, 32L));
        registro.add(new Registro(4L, "Laura", 180L, 50L, 15L));
        registro.add(new Registro(5L, "Lucia", 150L, 50L, 22L));
        registro.add(new Registro(6L, "Andrea", 165L, 59L, 21L));
        registro.add(new Registro(7L, "Carlos", 190L, 90L, 24L));
        registro.add(new Registro(8L, "Andres", 200L, 95L, 23L));
        registro.add(new Registro(9L, "Rocio", 155L, 50L, 20L));


        RegistroAdapter adaptador = new RegistroAdapter(this, R.layout.registro_custom_adapter, registro, new CustomClickListener() {
            @Override
            public void onClic(int position) {
                IMC = registro.get(position).getIMC() + "";

            }
        });

        RecyclerView listaRegistros = (RecyclerView) findViewById(R.id.lista_registros);
        listaRegistros.setAdapter(adaptador);
        listaRegistros.setLayoutManager(new LinearLayoutManager(this));
        listaRegistros.setHasFixedSize(true);

    }

}
