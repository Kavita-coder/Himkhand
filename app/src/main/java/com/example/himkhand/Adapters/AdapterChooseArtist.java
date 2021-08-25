package com.example.himkhand.Adapters;

import static com.example.himkhand.R.*;
import static com.example.himkhand.R.drawable.image_foreground_gradient;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.Interfaces.ChooseArtistListener;
import com.example.himkhand.Models.ModelChooseArtists;

import java.util.ArrayList;
import java.util.List;

public class AdapterChooseArtist extends RecyclerView.Adapter<AdapterChooseArtist.ViewHolder> {

    Context context;
    ArrayList<ModelChooseArtists> modelChooseArtists;
    private ChooseArtistListener chooseArtistListener;
    List<Integer> pos = new ArrayList<>();

    public AdapterChooseArtist(ChooseArtistListener chooseArtistListener) {
        this.chooseArtistListener = chooseArtistListener;
    }

    public AdapterChooseArtist(Context context, ArrayList<ModelChooseArtists> modelChooseArtists) {
        this.context = context;
        this.modelChooseArtists = modelChooseArtists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout.artists_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
      //  holder.bindArtists(modelChooseArtists.get(position));
        // int resource = modelChooseArtists.get(position).getImageChooseArtist();
        //  String name = modelChooseArtists.get(position).getTvArtistName();
        //  holder.setData(resource, name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!pos.contains(position)){
                    pos.add(position);
                   holder.imageView.setImageResource(drawable.layer);
                }
                else {
                    pos.remove((Integer.valueOf(position)));
                    holder.imageView.setImageResource(drawable.login_bg);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelChooseArtists.size();
    }

    public ArrayList<ModelChooseArtists> getSelectedArtists() {
        ArrayList<ModelChooseArtists> selectedArtists = new ArrayList<>();
        for (ModelChooseArtists modelChooseArtist : modelChooseArtists) {
            if (modelChooseArtist.isSelectd()) {
                selectedArtists.add(modelChooseArtist);
            }
        }
        return selectedArtists;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView, checkbox;
        public TextView artistname;
        ConstraintLayout layoutArtists;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(id.img_artist);
            artistname = itemView.findViewById(id.tv_artistName);
            layoutArtists = itemView.findViewById(id.layoutArtist);
        //    checkbox = itemView.findViewById(id.image_selected);
        }
//        void bindArtists(final ModelChooseArtists modelChooseArtists) {
//            imageView.setImageResource(modelChooseArtists.getImageChooseArtist());
//            artistname.setText(modelChooseArtists.getTvArtistName());
//
//            if (modelChooseArtists.isSelectd()) {
//                imageView.setImageResource(R.drawable.google);
//                checkbox.setVisibility(View.VISIBLE);
//            } else {
//                imageView.setBackgroundColor(R.drawable.login_bg);
//                checkbox.setVisibility(View.GONE);
//            }
//            layoutArtists.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (modelChooseArtists.isSelectd()){
//                        imageView.setBackgroundColor(R.drawable.login_bg);
//                        checkbox.setVisibility(View.GONE);
//                        modelChooseArtists.isSelectd = false;
//                    }else{
//                }
//            });
        }
        //  public void setData(int resource, String name) {
        //  imageView.setImageResource(resource);
        //  tv_artistname.setText(name);
        //  }
    }
