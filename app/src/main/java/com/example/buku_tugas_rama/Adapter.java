package com.example.buku_tugas_rama;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.buku_tugas_rama.databinding.ItemRecycleViewBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<Data> dataModels;

    public Adapter(ArrayList<Data> dataModels) {
        this.dataModels = dataModels;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemRecycleViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Data dataModel = dataModels.get(position);
        holder.binding.nama.setText(dataModel.getNama());
        holder.binding.deskripsi.setText(dataModel.getDeskripsi());
        holder.binding.gambar.setImageResource(dataModel.getGambar());
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecycleViewBinding binding;

        public ViewHolder(ItemRecycleViewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
