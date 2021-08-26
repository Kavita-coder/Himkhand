package com.example.himkhand.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.Models.ArtistModel;
import com.example.himkhand.R;

import java.util.ArrayList;

public class AdapterArtist2 extends RecyclerView.Adapter<AdapterArtist2.ViewHolder> {

    private Context context;
    private ArrayList<ArtistModel> artistModelArrayList;

    public AdapterArtist2(Context context, ArrayList<ArtistModel> artistModelArrayList) {
        this.context = context;
        this.artistModelArrayList = artistModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_choose_artist_play, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.artistImage.setImageResource(artistModelArrayList.get(position).getImageArtist());
      holder.settingsImg.setImageResource(artistModelArrayList.get(position).getImgSettings());
      holder.songName.setText(artistModelArrayList.get(position).getTvSongName());
      holder.artistname.setText(artistModelArrayList.get(position).getTvListeners());


    }

    @Override
    public int getItemCount() {
        return artistModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView artistImage, settingsImg;
        TextView songName, artistname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            artistImage = itemView.findViewById(R.id.Img_artistrecycler);
            settingsImg = itemView.findViewById(R.id.artist_settings);
            songName = itemView.findViewById(R.id.songName);
            artistname = itemView.findViewById(R.id.artist_listeners);

        }
    }
}
