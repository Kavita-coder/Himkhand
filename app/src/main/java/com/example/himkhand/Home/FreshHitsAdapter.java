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

public class FreshHitsAdapter extends RecyclerView.Adapter<FreshHitsAdapter.ViewHolder> {

    Context context;
    ArrayList<FreshHitsModel> freshHitsArrayList;


    public FreshHitsAdapter(Context context, ArrayList<FreshHitsModel> freshHitsArrayList) {
        this.context = context;
        this.freshHitsArrayList = freshHitsArrayList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fresh_hits_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FreshHitsAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(freshHitsArrayList.get(position).getArtistPic());
        holder.song_name.setText(freshHitsArrayList.get(position).getSongName());
        holder.singerName.setText(freshHitsArrayList.get(position).getSongName());

    }

    @Override
    public int getItemCount() {
        return freshHitsArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        private TextView song_name, singerName ;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.songPicture);
            song_name = itemView.findViewById(R.id.songName);
            singerName = itemView.findViewById(R.id.singerName);
        }
    }
}
