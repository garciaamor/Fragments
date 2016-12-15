package com.example.acer.afinal;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    Comunicar comunicar;
    public interface Comunicar{
        public void mensaje(String texto);
    }

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        comunicar=(Comunicar)contexto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFra=inflater.inflate(R.layout.fragment_main,container,false);
        Button boton=(Button) layFra.findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(getResources().getBoolean(R.bool.landScape)){
                    comunicar.mensaje("Mensaje enviado desde fragment1 landScape");
                }else {
                    Intent intent=new Intent(getActivity(),Main2Activity.class);
                    intent.putExtra("hola","Mensaje desde la Activity1");
                    startActivity(intent);}
                }


            });
               return layFra;

    }
}
