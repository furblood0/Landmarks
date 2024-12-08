package com.furkan.landmarkbook;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.furkan.landmarkbook.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // View Binding'i başlat
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Intent ile gelen verileri al
        String placeName = getIntent().getStringExtra("placeName");
        String placeCountry = getIntent().getStringExtra("placeCountry");
        int placeImage = getIntent().getIntExtra("placeImage", R.drawable.ic_launcher_background);

        // Verileri detay ekranında göster
        binding.textViewTitle.setText(placeName);
        binding.textViewDescription.setText(placeCountry);
        binding.imageViewPlace.setImageResource(placeImage);



    }
}