package com.example.himkhand.Home;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.R;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    Context context;
    ArrayList<Horizontal_Model> horizontalModelArrayList;

    public HorizontalAdapter(Context context, ArrayList<Horizontal_Model> horizontalModelArrayList) {
        this.context = context;
        this.horizontalModelArrayList = horizontalModelArrayList;
    }

    @NonNull
    @NotNull
    @Override
    public HorizontalAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal_layout,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull HorizontalAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(horizontalModelArrayList.get(position).getImageView());
        holder.songName.setText(horizontalModelArrayList.get(position).getTv_trend());
        holder.artistName.setText(horizontalModelArrayList.get(position).getTextView());


    }

    @Override
    public int getItemCount() {
        return horizontalModelArrayList.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
         TextView songName,artistName;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.songPicture);
            songName = itemView.findViewById(R.id.song_name);
            artistName = itemView.findViewById(R.id.artist_name);
        }
    }
}
