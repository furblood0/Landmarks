package com.furkan.landmarkbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.furkan.landmarkbook.databinding.ListItemPlaceBinding;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private List<Places> placeList;

    public PlaceAdapter(List<Places> placeList) {
        this.placeList = placeList;
    }

    @NonNull
    @Override
    public PlaceAdapter.PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemPlaceBinding binding = ListItemPlaceBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new PlaceViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.PlaceViewHolder holder, int position) {
        Places place = placeList.get(position);
        holder.binding.title.setText(place.getTitle());
        holder.binding.description.setText(place.getDescription());

        // Tıklama olayı
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("placeName", place.getTitle());
                intent.putExtra("placeCountry", place.getDescription());
                intent.putExtra("placeImage", place.getImageResource());
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    public static class PlaceViewHolder extends RecyclerView.ViewHolder{
        private ListItemPlaceBinding binding;

        public PlaceViewHolder(ListItemPlaceBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
