package com.example.himkhand.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.R;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {

    Context context;
    ArrayList<ModelStory> modelArrayList;

    public PopularAdapter(Context context, ArrayList<ModelStory> ModelArrayList) {
        this.context = context;
        this.modelArrayList = ModelArrayList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_popular_artist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PopularAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(modelArrayList.get(position).getImage());
        holder.artistName.setText(modelArrayList.get(position).getTextview());


    }


    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        private TextView artistName;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_story);
            artistName = itemView.findViewById(R.id.tv_story);
        }
    }
}
