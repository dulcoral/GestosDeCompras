package com.company.spsolutions.gestosdecompras.MenuPrincipal;
/**
 * Created by coralRodriguez on 27/03/19.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.company.spsolutions.gestosdecompras.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
/*
*Esta clase gestiona la vista principal del menu con las opciones
* el método initComponents inicializa los componentes
* el método setListeners coloca los listeners a cada opción de menú con su correspondiente intent y logica para mandar a la siguiente actividad
*
 */
    private RecyclerView recyclerMenu;
    private MainAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recList = findViewById(R.id.recycler_menu);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        MainAdapter ca = new MainAdapter(getData());
        recList.setAdapter(ca);
        //getActionBar().setTitle("xRendir");
        //setSupportActionBar(toolbar);

        //initComponents();

    }

    public void initComponents(){
        recyclerMenu = findViewById(R.id.recycler_menu);
        recyclerMenu.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerMenu.setLayoutManager(layoutManager);
        mAdapter = new MainAdapter(getData());
        recyclerMenu.setAdapter(mAdapter);
    }

    public void setListeners(){}

    public List<ItemMenu> getData(){
        List<ItemMenu> items= new ArrayList <ItemMenu>();
        items.add(new ItemMenu("Gestión de solicitudes","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTlv7N1qgf_Al1YinpbuSLGwciK_e2r3EK3Ewjx78s8zBl88YPl"));
        items.add(new ItemMenu("Gestión de gastos","https://cooperandoando.com/media/2017/12/19-Gastos.png"));
        items.add(new ItemMenu("Informe de gastos","https://cooperandoando.com/media/2017/12/19-Gastos.png"));
        return items;
    }

}
