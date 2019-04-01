package com.company.spsolutions.gestosdecompras.SolicitudGasto;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by coralRodriguez on 28/03/19.
 */

public class SolicitudActualesAdapter extends RecyclerView.Adapter<SolicitudActualesAdapter.MyViewHolder> {
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }

    @NonNull
    @Override
    public SolicitudActualesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SolicitudActualesAdapter.MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
