package com.company.spsolutions.gestosdecompras.Gastos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.spsolutions.gestosdecompras.R;

/**
 * Created by coralRodriguez on 28/03/19.
 */

public class FragmentGastosPasados extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_gastospasados, container, false);
    }
}
