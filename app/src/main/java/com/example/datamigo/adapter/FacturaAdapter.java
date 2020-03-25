package com.example.datamigo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.datamigo.R;
import com.example.datamigo.entity.Factura;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FacturaAdapter extends BaseAdapter {

    /*Nos permite inyectar cada item al listWiew listaFacturasOut*/
    private final LayoutInflater inflater;
    /*Siempre es el que se va mostrar al usuario*/
    private final List<Factura> listaFacturasOut;

    public FacturaAdapter(Context context, List<Factura> listaFacturas){
        this.listaFacturasOut = listaFacturas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listaFacturasOut.size();
    }

    @Override
    public Factura getItem(int position) {
        return listaFacturasOut.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = inflater.inflate(R.layout.factura_item_layout, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        holder.imagenFactura.setImageResource(listaFacturasOut.get(position).getImagen());
        holder.txtProveedor.setText(listaFacturasOut.get(position).getProveedor());
        holder.txtFecha.setText(listaFacturasOut.get(position).getFecha());
        holder.txtValor.setText(listaFacturasOut.get(position).getValorTotal());
        return convertView;
    }

    class ViewHolder{

        /*Segun los datos que hayan en la factura con su tipo de dato*/
        @BindView(R.id.imgFactura)
        ImageView imagenFactura;
        @BindView(R.id.txtProveedor)
        TextView txtProveedor;
        @BindView(R.id.txtFecha)
        TextView txtFecha;
        @BindView(R.id.txtValor)
        TextView txtValor;
        @BindView(R.id.detalles)
        Button detalles;

        /*Constructor parametrizado*/
        public ViewHolder(View view) {
            ButterKnife.bind(this,view);
        }

    }
}
