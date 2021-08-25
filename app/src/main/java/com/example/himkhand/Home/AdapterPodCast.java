package com.example.himkhand.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.R;

import java.util.ArrayList;

public class AdapterPodCast extends RecyclerView.Adapter<AdapterPodCast.ViewHolder> {

    Context context;
    ArrayList<ModelPodCast> podCastArrayList;

    public AdapterPodCast(Context context, ArrayList<ModelPodCast> podCastArrayList) {
        this.context = context;
        this.podCastArrayList = podCastArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_podcast_layout, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.podImage.setImageResource(podCastArrayList.get(position).getPodCastImage());
        holder.hearder.setText(podCastArrayList.get(position).getTvHeader());
        holder.subheader.setText(podCastArrayList.get(position).getTvsubheader());
        holder.header1.setText(podCastArrayList.get(position).getTvHeader1());
        holder.subheader1.setText(podCastArrayList.get(position).getTvSubHeader1());
        holder.subheader1.setText(podCastArrayList.get(position).getTvSubHeader1());
      //  holder.podCastLayout.setBackground(podCastArrayList.get(position).getPodCastLayout());

    }

    @Override
    public int getItemCount() {
        return podCastArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView podImage;
        TextView hearder, subheader, header1, subheader1;
        ConstraintLayout podCastLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            podImage = itemView.findViewById(R.id.img_podcast);
            hearder = itemView.findViewById(R.id.tv_podcast_header);
            subheader = itemView.findViewById(R.id.tv_podcast_subheader);
            header1 = itemView.findViewById(R.id.tv_podcast_header1);
            subheader1 = itemView.findViewById(R.id.tv_podcast_subheader1);
            podCastLayout = itemView.findViewById(R.id.pod_gradient_layout);

        }
    }
}
