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

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ViewHolder> {

    Context context;
    ArrayList<ArtistModel> artistModelArrayList;

    public ArtistAdapter(Context context, ArrayList<ArtistModel> artistModelArrayList) {
        this.context = context;
        this.artistModelArrayList = artistModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_choose_artist_play,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int artistImage = artistModelArrayList.get(position).getImageArtist();
        int settingsImage = artistModelArrayList.get(position).getImgSettings();
        String textViewSongName = artistModelArrayList.get(position).getTvSongName();
        String textViewlisteners = artistModelArrayList.get(position).getTvListeners();

        holder.setData(artistImage,settingsImage, textViewSongName, textViewlisteners);

    }

    @Override
    public int getItemCount() {
        return artistModelArrayList.size();
    }

    public class ViewHolder extends AdapterChooseArtist.ViewHolder {

        ImageView artistImage, settingImage;
        TextView tvSongname, tvListeners;

        public ViewHolder(View itemView) {
            super(itemView);
            artistImage = itemView.findViewById(R.id.Img_artistrecycler);
            settingImage = itemView.findViewById(R.id.artist_settings);
            tvSongname = itemView.findViewById(R.id.songName);
            tvListeners = itemView.findViewById(R.id.artist_listeners);

        }

        public void setData(int artistImage, int settingsImage, String textViewSongName, String textViewlisteners) {

        }
    }
}
