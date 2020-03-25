package com.example.datamigo.ui.reciente;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.datamigo.R;
import com.example.datamigo.adapter.FacturaAdapter;
import com.example.datamigo.entity.Factura;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class RecienteFragment extends Fragment {


//    @BindView(R.id.listView)
//    public ListView listWiew;
    ListView listView;
    ArrayAdapter<String> adapter;

    String[] data = {"carlos","jose","Jeronimo","Juan"};

    public static RecienteFragment newInstance() {
        return new RecienteFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.reciente_fragment, container, false);
//            List<Factura> listaFacturas = new ArrayList<>();
//            listaFacturas.add(new Factura(R.drawable.factura, "Postobon","22/02/2020", "$ 13000"));
//            listaFacturas.add(new Factura(R.drawable.factura, "Margarita","23/02/2020", "$ 130000"));
//            listaFacturas.add(new Factura(R.drawable.factura, "Colombina","24/02/2020", "$ 130000"));
//            listaFacturas.add(new Factura(R.drawable.factura, "Nutresa","25/02/2020", "$ 130000"));
//            FacturaAdapter facturaAdapter = new FacturaAdapter(getActivity(),listaFacturas);
//            listWiewFacturas.setAdapter(facturaAdapter);
            listView = view.findViewById(R.id.listView);
            adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
            listView.setAdapter(adapter);

        return view;
    }
}
