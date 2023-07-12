package com.asus.countrieslandmarks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.asus.countrieslandmarks.databinding.ActivityMainBinding;
import com.asus.countrieslandmarks.databinding.ActivityPicturesBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmarks> landmarksArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        landmarksArrayList=new ArrayList<>();



        Landmarks pisa= new Landmarks("Pisa","Italy",R.drawable.pisa);
        Landmarks eiffel = new Landmarks("Eiffel","France",R.drawable.eiffel);
        Landmarks pyramids= new Landmarks("Pyramids","Egypt",R.drawable.pyramids);
        Landmarks liberty = new Landmarks("Liberty","USA",R.drawable.liberty);
        Landmarks tacmahal = new Landmarks("Tac Mahal","India",R.drawable.tacmahal);



        landmarksArrayList.add(pisa);
        landmarksArrayList.add(eiffel);
        landmarksArrayList.add(pyramids);
        landmarksArrayList.add(liberty);
        landmarksArrayList.add(tacmahal);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        LandmarksAdapter landmarksAdapter=new LandmarksAdapter(landmarksArrayList);

        binding.recyclerView.setAdapter(landmarksAdapter);

    }
}