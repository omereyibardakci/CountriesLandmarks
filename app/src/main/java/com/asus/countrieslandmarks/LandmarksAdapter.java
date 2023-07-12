package com.asus.countrieslandmarks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.asus.countrieslandmarks.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarksAdapter extends RecyclerView.Adapter<LandmarksAdapter.LandmarksHolder> {

    ArrayList<Landmarks> landmarksArrayList;

    public LandmarksAdapter(ArrayList<Landmarks> landmarksArrayList) {
        this.landmarksArrayList = landmarksArrayList;
    }

    @NonNull
    @Override
    public LandmarksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // in here wants a 'binding'.
        // this 'binding' will come from 'RecyclerRowBinding'
        // 'inflate' reads the XML layout file

        RecyclerRowBinding recyclerRowBinding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new LandmarksHolder(recyclerRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull LandmarksHolder holder, int position) {

        // we got the data and bind it to the view element.
        holder.binding.recyclerViewTextView.setText(landmarksArrayList.get(position).name);

    }

    @Override
    public int getItemCount() {
        return landmarksArrayList.size();
    }

    public class LandmarksHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public LandmarksHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());       // getRoot() is used to give 'binding' as a view.
            this.binding=binding;
        }
    }




}
