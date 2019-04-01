package com.company.spsolutions.gestosdecompras.MenuPrincipal;
/**
 * Created by coralRodriguez on 27/03/19.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.company.spsolutions.gestosdecompras.R;

public class MainActivity extends AppCompatActivity {
/*
*Esta clase gestiona la vista principal del menu con las opciones
* el método initComponents inicializa los componentes
* el método setListeners coloca los listeners a cada componente que asi lo necesite y su logica correspondiente
*
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initComponents(){}

    public void setListeners(){}

}
