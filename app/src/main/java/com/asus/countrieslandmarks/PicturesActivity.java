package com.asus.countrieslandmarks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.asus.countrieslandmarks.databinding.ActivityPicturesBinding;

public class PicturesActivity extends AppCompatActivity {

    private ActivityPicturesBinding binding;
    /*
    viewBinding method is offered as an alternative to the findViewById() method.
    more effective and
    Prevents Null Reference Errors
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPicturesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }
}