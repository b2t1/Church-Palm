package com.b2t1.churchpalm.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.b2t1.churchpalm.R;
import com.b2t1.churchpalm.entities.Preaching;

import java.util.Date;
import java.util.List;

public class AdapterPreaching extends RecyclerView.Adapter<AdapterPreaching.MyViewHolder> {

    private List<Preaching> listPreaching;

    public AdapterPreaching(List<Preaching> list1) {
        this.listPreaching = list1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemListaAdapter = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_preaching_lista, parent, false);
        return new MyViewHolder(itemListaAdapter);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Preaching preaching = listPreaching.get(position);
        holder.titulo.setText(preaching.getTitulo());
        holder.data.setText(preaching.getData());
        holder.image.setImageResource(preaching.getImagem());
    }

    @Override
    public int getItemCount() {
        return listPreaching.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView titulo;
        TextView data;

        public MyViewHolder(View itemView){
            super(itemView);

            image = itemView.findViewById(R.id.imageImagem);
            titulo = itemView.findViewById(R.id.textTitulo);
            data = itemView.findViewById(R.id.textData);

        }

    }

}
