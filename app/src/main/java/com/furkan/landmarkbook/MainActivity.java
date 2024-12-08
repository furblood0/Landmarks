package com.furkan.landmarkbook;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.furkan.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PlaceAdapter adapter;
    private List<Places> placesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bindingi başlat
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //Layoutu ayarla
        setContentView(binding.getRoot());

        binding.myRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        placesList = new ArrayList<>();
        placesList.add(new Places("Eiffel Tower", "Fransa",R.drawable.eiffel_tower));
        placesList.add(new Places("Big Ben", "Londra",R.drawable.bigben));
        placesList.add(new Places("Colosseum", "İtalya",R.drawable.colosseum));
        placesList.add(new Places("Stonehenge", "İngiltere",R.drawable.stonehenge));
        placesList.add(new Places("Machu Picchu", "Peru",R.drawable.machu_picchu));
        placesList.add(new Places("Tac Mahal", "Hindistan",R.drawable.tac_mahal));
        placesList.add(new Places("Özgürlük Heykeli", "ABD",R.drawable.ozgurluk_heykeli));
        placesList.add(new Places("Çin Seddi", "Çin",R.drawable.cin_seddi));
        placesList.add(new Places("Petra", "Ürdün",R.drawable.petra));
        placesList.add(new Places("Ayasofya", "Türkiye",R.drawable.ayasofya));
        placesList.add(new Places("Kızıl Meydan", "Rusya",R.drawable.kizil_meydan));
        placesList.add(new Places("Sydney Opera Binası", "Avustralya",R.drawable.sydney_opera_binasi));
        placesList.add(new Places("Büyük Giza Piramidi", "Mısır",R.drawable.giza_piramidi));
        placesList.add(new Places("Tokyo Kulesi", "Japonya",R.drawable.tokyo_kulesi));
        placesList.add(new Places("Christ the Redeemer", "Brezilya",R.drawable.christ_the_redeemer));
        placesList.add(new Places("Burj Khalifa", "Birleşik Arap Emirlikleri",R.drawable.burj_khalifa));
        placesList.add(new Places("Yellowstone Milli Parkı", "ABD",R.drawable.yellowstone));


        adapter = new PlaceAdapter(placesList);
        binding.myRecyclerView.setAdapter(adapter);

    }
}