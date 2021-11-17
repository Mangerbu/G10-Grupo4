package co.edu.unab.apprecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.edu.unab.apprecyclerview.model.Registro;

public class RegistroAdapter extends RecyclerView.Adapter<RegistroViewHolder> {
    Context context;
    int layout;
    List<Registro> lista;
    LayoutInflater inflater;
    CustomClickListener clickListener;

    public RegistroAdapter(Context context, int layout, List<Registro> lista, CustomClickListener clickListener){
        this.context=context;
        this.layout=layout;
        this.lista=lista;
        this.clickListener = clickListener;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RegistroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = inflater.inflate(layout, parent, false);
        return new RegistroViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RegistroViewHolder holder, int position) {
        Registro registro = lista.get(position);

        holder.getTxtNombre().setText(registro.getNombre());
        holder.getTxtAltura().setText(registro.getAltura()+"");
        holder.getTxtPeso().setText(registro.getPeso()+"");
        holder.getTxtIMC().setText(registro.getIMC()+"");
        ;
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
