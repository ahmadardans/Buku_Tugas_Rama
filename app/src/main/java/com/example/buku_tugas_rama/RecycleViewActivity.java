package com.example.buku_tugas_rama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.buku_tugas_rama.databinding.ActivityRecycleViewBinding;

import java.util.ArrayList;
import java.util.Collection;

public class RecycleViewActivity extends AppCompatActivity {

    ActivityRecycleViewBinding binding;
    ArrayList<Data> dataModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecycleViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rv.setHasFixedSize(true);
        dataModels.addAll(getListData());
        showRecycleView();
    }

    private void showRecycleView() {
        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(dataModels);
        binding.rv.setAdapter(adapter);
    }

    private ArrayList<Data> getListData() {
        String[] nama = {"Rama1","Rama2","Rama3","Rama4","Rama5","Rama6","Rama7","Rama8","Rama9","Rama10"};
        String[] deskripsi = {"deskripsi1","deskripsi2","deskripsi3","deskripsi4","deskripsi5","deskripsi6","deskripsi7","deskripsi8","deskripsi9","deskripsi10"};
        Integer[] gambar = {R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48,R.drawable.freya_tgr48};

        ArrayList<Data> dataModel = new ArrayList<>();
        for(int i = 0; i < nama.length; i++) {
            Data data = new Data();
            data.setNama(nama[i]);
            data.setDeskripsi(deskripsi[i]);
            data.setGambar(gambar[i]);
            dataModel.add(data);
        }

        return dataModel;
    }
}