package com.example.himkhand.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.Adapters.AdapterChooseArtist;
import com.example.himkhand.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder> {

    Context context;
    ArrayList<ModelStory> modelStoryArrayList;

    public ModelAdapter(Context context, ArrayList<ModelStory> modelStoryArrayList) {
        this.context = context;
        this.modelStoryArrayList = modelStoryArrayList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ModelAdapter.ViewHolder holder, int position) {
        holder.circleImageView.setImageResource(modelStoryArrayList.get(position).getImage());
        holder.storyName.setText(modelStoryArrayList.get(position).getTextview());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //   Intent i = new Intent(context.getApplicationContext(), AdapterChooseArtist.class);

            }
        });

    }

    @Override
    public int getItemCount() {
        return modelStoryArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView circleImageView;
        TextView storyName;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            circleImageView = itemView.findViewById(R.id.img_story);
            storyName = itemView.findViewById(R.id.tv_story);

        }
    }
}
