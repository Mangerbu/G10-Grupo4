package co.edu.unab.apprecyclerview;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RegistroViewHolder extends RecyclerView.ViewHolder {
    private TextView txtNombre;
    private TextView txtAltura;
    private TextView txtPeso;
    private TextView txtIMC;

    public RegistroViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        txtAltura = (TextView) itemView.findViewById(R.id.txtAltura);
        txtPeso = (TextView) itemView.findViewById(R.id.txtPeso);
        txtIMC = (TextView) itemView.findViewById(R.id.txtIMC);
    }

    public TextView getTxtNombre() { return  txtNombre; }

    public TextView getTxtAltura() { return txtAltura; }

    public TextView getTxtPeso() { return txtPeso;}

    public TextView getTxtIMC() { return txtIMC; }

}
