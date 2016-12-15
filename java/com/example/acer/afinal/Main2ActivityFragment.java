package com.example.acer.afinal;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import static com.example.acer.afinal.R.id.fragment2;
import static com.example.acer.afinal.R.id.textView;
/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    TextView textView;


    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFra2=inflater.inflate(R.layout.fragment_main2,container,false);

        textView=(TextView) layFra2.findViewById(R.id.textView);
        return layFra2;
    }
    public void recibirTexto(String texto){
        textView.setText(texto);
    }
}
