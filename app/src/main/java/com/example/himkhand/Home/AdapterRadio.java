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

public class AdapterRadio extends RecyclerView.Adapter<AdapterRadio.ViewHolder> {

    Context context;
    ArrayList<RadioModel> radioModelArrayList;

    public AdapterRadio(Context context, ArrayList<RadioModel> radioModelArrayList) {
        this.context = context;
        this.radioModelArrayList = radioModelArrayList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recom_radio, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterRadio.ViewHolder holder, int position) {

        holder.radioImage.setImageResource(radioModelArrayList.get(position).imageRadio);
        holder.fmRadio.setText(radioModelArrayList.get(position).tvRadio);
        holder.fmRadio.setText(radioModelArrayList.get(position).tvRadioName);

    }

    @Override
    public int getItemCount() {
        return radioModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView radioImage;
        TextView fmRadio, radioName;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            radioImage = itemView.findViewById(R.id.img_radio);
            fmRadio = itemView.findViewById(R.id.tv_radio);
            radioName = itemView.findViewById(R.id.tv_radioname);

        }
    }
}
